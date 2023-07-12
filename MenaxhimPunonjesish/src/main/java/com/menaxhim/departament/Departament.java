package com.menaxhim.departament;

import com.menaxhim.punonjes.Punonjes;
import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Entity
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_dep")
    private int idDep;
    @Column
    private String emri;
    @Column
    private String pershkrimi;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_dep", referencedColumnName = "id_dep")
    private List<Punonjes> punonjes;

    public Departament( ) {

    }

    public Departament(int idDep, String emri, String pershkrimi) {
        super();
        this.idDep = idDep;
        this.emri = emri;
        this.pershkrimi = pershkrimi;
    }

    public int getIdDep() {

        return idDep;
    }

    public void setIdDep(int id) {

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
}

