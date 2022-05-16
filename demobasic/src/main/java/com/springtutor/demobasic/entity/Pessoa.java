package com.springtutor.demobasic.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.springtutor.demobasic.util.StateEnum;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String name;
    @OneToMany(mappedBy = "pessoa")
    @LazyCollection(LazyCollectionOption.EXTRA)
    private List<Documento> documentos = new ArrayList<>();

    // private List<Endereco> entenderecos = new ArrayList<>();

    @Column(name = "datacadastro", nullable = false)
    private Instant datecreation = Instant.now();
    @Column(name = "datavalidade", nullable = true)
    private Date expirationdate;

    @Enumerated(EnumType.STRING)
    private StateEnum status = StateEnum.UNACTIVE;

    public Pessoa() {
    }

    public Pessoa(Long id, String name, List<Documento> documentos, Instant datecreation, Date expirationdate,
            StateEnum status) {
        this.id = id;
        this.name = name;
        this.documentos = documentos;
        this.datecreation = datecreation;
        this.expirationdate = expirationdate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public Instant getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(Instant datecreation) {
        this.datecreation = datecreation;
    }

    public Date getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(Date expirationdate) {
        this.expirationdate = expirationdate;
    }

    public StateEnum getStatus() {
        return status;
    }

    public void setStatus(StateEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pessoa [datecreation=" + datecreation + ", documentos=" + documentos + ", expirationdate="
                + expirationdate + ", id=" + id + ", name=" + name + ", status=" + status + "]";
    }

}
