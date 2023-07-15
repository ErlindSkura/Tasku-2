package com.menaxhim.entities;

import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Entity
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_dep")
    private Integer idDep;
    @Column
    private String emri;
    @Column
    private String pershkrimi;

    @OneToMany(mappedBy = "departament", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Punonjes> punonjes;

    public Departament( ) {

    }

    public Departament( String emri, String pershkrimi) {
        super();

        this.emri = emri;
        this.pershkrimi = pershkrimi;
    }

    public Integer getIdDep() {

        return idDep;
    }

    public void setIdDep(Integer id) {

        this.idDep = idDep;
    }

    public String getEmri() {

        return emri;
    }

    public void setEmri(String emri) {

        this.emri = emri;
    }

    public String getPershkrimi() {

        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {

        this.pershkrimi = pershkrimi;
    }


    public List<Punonjes> getPunonjes() {
        return punonjes;
    }

    public void setPunonjes(List<Punonjes> punonjes) {
        this.punonjes = punonjes;
    }
}

