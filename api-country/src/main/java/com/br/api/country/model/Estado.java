package com.br.api.country.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Estado implements Serializable {

    @Id
    @SequenceGenerator(name = "seqestado", sequenceName = "seqestado", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqestado")
    private Long id;
    @Column
    private String nome;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "PAISID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "fk_paisid_estado"))
    private Pais pais;

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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @OneToMany(mappedBy = "estado")
    private Collection<Cidade> cidade;

    public Collection<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(Collection<Cidade> cidade) {
        this.cidade = cidade;
    }
}
