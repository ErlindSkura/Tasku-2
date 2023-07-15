package com.menaxhim.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.menaxhim.entities.Departament;
import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Entity
public class Punonjes {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE)
    @Column(name="id_pun")
    private Integer  id;
    @Column
    private String emri;
    @Column
    private String email;
    @Column
    private String gjinia;
    @Column
    private String pozicioni;
    @Column
    private Date data_krijimit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Departament departament;

    public Punonjes( ) {

    }
    public Punonjes(String emri, String email, String gjinia, String pozicioni, Date data_krijimit) {
        super();
        this.emri = emri;
        this.email = email;
        this.gjinia = gjinia;
        this.pozicioni = pozicioni;
        this.data_krijimit = data_krijimit;
    }


    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getEmri() {

        return emri;
    }

    public void setEmri(String emri) {

        this.emri = emri;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getGjinia() {

        return gjinia;
    }

    public void setGjinia(String gjinia) {

        this.gjinia = gjinia;
    }

    public String getPozicioni() {

        return pozicioni;
    }

    public void setPozicioni(String pozicioni) {

        this.pozicioni = pozicioni;
    }

    public Date getData_krijimit() {

        return data_krijimit;
    }

    public void setData_krijimit(Date data_krijimit) {

        this.data_krijimit = data_krijimit;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
