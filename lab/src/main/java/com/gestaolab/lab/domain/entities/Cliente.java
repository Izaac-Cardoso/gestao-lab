package com.gestaolab.lab.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cliente_id;

    @Column(nullable = false)
    private String nome;

    private int cpf;
        
    @Email
    @NotBlank(message = "Informe um e-mail válido.")
    @Column(nullable = false)
    private String email;

    private int cep;
    private LocalDateTime dataCadastro;
      
    public Cliente() { }
  
    public Cliente(Long cliente_id, String nome, String email, LocalDateTime data_cadastro) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = LocalDateTime.now();
    }

    public Cliente(Long cliente_id, String nome, int cpf, String email, int cep) {
        this.cliente_id = cliente_id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cep = cep;
        this.dataCadastro = LocalDateTime.now();
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getCep() {
        return cep;
    }

    
    
}
