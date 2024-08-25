package com.alunos.escolaxyz.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_professores")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres.")
    private String nome;

    @NotNull(message = "O número da sala é obrigatório")
    private int numeroDaSala;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres.") String nome) {
        this.nome = nome;
    }

    @NotNull(message = "O número da sala é obrigatório")
    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(@NotNull(message = "O número da sala é obrigatório") int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }
}
