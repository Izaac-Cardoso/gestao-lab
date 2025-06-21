package com.gestaolab.lab.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

//import com.gestaolab.lab.domain.enums.EstadoOrcamento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.EnumType;
//import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Orcamento implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orcamento_id;

    private LocalDateTime dataCadastro;

    @Column(nullable = false)
    private String uri;

// Implementar essa coluna no BD    
//    @Enumerated(EnumType.STRING)
//    private EstadoOrcamento estado;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private OrdemServico ordemServico;

    public Orcamento() {
    }

    
    
}
