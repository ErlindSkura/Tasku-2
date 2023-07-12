package com.menaxhim.departament;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartamentServiceImp implements DepartamentService {
    @Autowired
    DepartamentRepository departamentRepository;

    public Departament createDepartament(Departament departament){
        return departamentRepository.save(departament);
    }

    public List<Departament> getDepartamentet() {
        return departamentRepository.findAll();
    }


    public Departament getDepartament(int idDep) {
         return departamentRepository.findById(idDep).orElse(null);
    }


    public Departament updateDepartament(Departament departament, int idDep) {
        Departament oldDepartament= departamentRepository.findById(idDep).orElse(null);
        oldDepartament.setIdDep(departament.getIdDep());
        oldDepartament.setEmri(departament.getEmri());
        oldDepartament.setPershkrimi(departament.getPershkrimi());
        departamentRepository.save(oldDepartament);
        return oldDepartament;

    }

    public void deleteDepartament(int idDep) {

        departamentRepository.deleteById(idDep);
    }

}
