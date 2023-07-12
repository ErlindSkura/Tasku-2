package com.menaxhim.punonjes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PunonjesServiceImp implements PunonjesService {
    @Autowired
    PunonjesRepository punonjesRepository;

    public Punonjes createPunonjes(Punonjes punonjes) {
        return punonjesRepository.save(punonjes);
    }

    public List<Punonjes> getPunonjesit() {
        return punonjesRepository.findAll();
    }


    public Punonjes getPunonjes(int id) {
        return punonjesRepository.findById(id).orElse(null);
    }


    public Punonjes updatePunonjes(Punonjes punonjes, int id) {
        Punonjes oldPunonjes = punonjesRepository.findById(id).orElse(null);
        oldPunonjes.setId(punonjes.getId());
        oldPunonjes.setEmri(punonjes.getEmri());
        oldPunonjes.setEmail(punonjes.getEmail());
        oldPunonjes.setGjinia(punonjes.getGjinia());
        oldPunonjes.setPozicioni(punonjes.getPozicioni());
        oldPunonjes.setData_krijimit(punonjes.getData_krijimit());
        punonjesRepository.save(oldPunonjes);
        return oldPunonjes;
    }

    public void deletePunonjes(int id) {

        punonjesRepository.deleteById(id);
    }
}
