package com.menaxhim.service;


import com.menaxhim.entities.Departament;
import com.menaxhim.entities.Punonjes;
import com.menaxhim.repository.PunonjesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunonjesService {
    @Autowired
    PunonjesRepository punonjesRepository;

    public Punonjes createPunonjes(Punonjes punonjes) {
        return punonjesRepository.save(punonjes);
    }

    public List<Punonjes> getPunonjesit() {
        return punonjesRepository.findAll();
    }


    public Punonjes getPunonjes(int id) {
        return punonjesRepository.findById(String.valueOf(id)).orElse(null);
    }


    public Punonjes updatePunonjes(Integer id, Punonjes punonjes) {
        if (punonjesRepository.existsById(String.valueOf(id))) {
            punonjes.setId(id);
            return punonjesRepository.save(punonjes);
        } else {
            return null;
        }
    }

    public void deletePunonjes(String id) {

        punonjesRepository.deleteById(id);
    }
}
