package com.alunos.escolaxyz.repository;

import com.alunos.escolaxyz.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    List<Aluno> findAllByNomeContainingIgnoreCase(@Param(value = "nome") String nome);
}
