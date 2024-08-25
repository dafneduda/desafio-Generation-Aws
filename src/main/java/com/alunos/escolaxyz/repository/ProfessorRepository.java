package com.alunos.escolaxyz.repository;

import com.alunos.escolaxyz.model.Aluno;
import com.alunos.escolaxyz.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findAllByNomeContainingIgnoreCase(@Param(value = "nome") String nome);
}
