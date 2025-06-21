package com.gestaolab.lab.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.gestaolab.lab.domain.enums.EstadoCliente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuario_id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String senha;

    private String perfil;

    @Enumerated(EnumType.STRING)
    private EstadoCliente estado;

    @Column(nullable = false)
    private int numCadastro;

    @Email(message = "Informe um e-mail válido.")
    private String email;

    private LocalDateTime dataCadastro;
    
    public Usuario() { }

    public Usuario(Long usuario_id, String nome, String senha, String perfil, EstadoCliente estado, int numCadastro,
            String email) {
        this.usuario_id = usuario_id;
        this.nome = nome;
        this.senha = senha;
        this.perfil = perfil;
        this.estado = estado;
        this.numCadastro = numCadastro;
        this.email = email;
        this.dataCadastro = LocalDateTime.now();
    }

    
    public Long getUsuario_id() {
        return usuario_id;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public int getNumCadastro() {
        return numCadastro;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void atualizaNome(String novoNome) {
        if(novoNome.isBlank()) {
            throw new RuntimeException("Um novo nome deve ser informado.");
        }
        this.nome = novoNome;
        System.out.println("Nome atualizado com sucesso.");
    }
    
}
