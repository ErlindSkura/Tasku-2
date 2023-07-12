package com.menaxhim.punonjes;

import com.menaxhim.departament.Departament;
import jakarta.persistence.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Entity
public class Punonjes {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name="id_pun")
    private int id;
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

    public Punonjes( ) {

    }
    public Punonjes(int id, String emri, String email, String gjinia, String pozicioni, Date data_krijimit, Departament departament) {
        super();
        this.id = id;
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
}
