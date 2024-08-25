package com.alunos.escolaxyz.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres.")
    private String nome;

    @NotNull(message = "A idade é obrigatória")
    private int idade;

    @NotNull(message = "A nota do primeiro semestre é obrigatória.")
    private float notaPrimeiroSemestre;

    @NotNull(message = "A nota do segundo semestre é obrigatória.")
    private float notaSegundoSemestre;

    @ManyToOne
    @JsonIgnoreProperties("aluno")
    private Professor professor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @NotNull(message = "A idade é obrigatória")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A idade é obrigatória") int idade) {
        this.idade = idade;
    }

    @NotNull(message = "A nota do primeiro semestre é obrigatória.")
    public float getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre(float notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    @NotNull(message = "A nota do segundo semestre é obrigatória.")
    public float getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre(float notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
