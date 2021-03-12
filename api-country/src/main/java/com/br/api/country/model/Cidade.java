package com.br.api.country.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cidade implements Serializable {

    @Id
    @SequenceGenerator(name = "seqcidade", sequenceName = "seqcidade", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqcidade")
    private Long id;
    @Column
    private String nome;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "estadoid", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_estadoid_cidade"))
    private Estado estado;

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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
