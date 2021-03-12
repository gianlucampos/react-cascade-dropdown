package com.br.api.country.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pais implements Serializable {

    @Id
    @SequenceGenerator(name = "seqpais", sequenceName = "seqpais", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqpais")
    private Long id;
    @Column
    private String nome;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
