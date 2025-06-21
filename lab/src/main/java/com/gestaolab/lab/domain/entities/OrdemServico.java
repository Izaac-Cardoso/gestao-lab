package com.gestaolab.lab.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class OrdemServico implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long os_id;

    private LocalDateTime dLocalDateTime;

    @Column(nullable = false)
    private String uri;

    @OneToOne
    private Orcamento orcamento;


    
}
