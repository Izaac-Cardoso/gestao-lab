package com.gestaolab.lab.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaolab.lab.domain.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
