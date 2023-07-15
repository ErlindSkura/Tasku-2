package com.menaxhim.service;


import com.menaxhim.entities.Departament;
import com.menaxhim.repository.DepartamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DepartamentService {

        private DepartamentRepository departamentRepository;

        @Autowired
        public DepartamentService(DepartamentRepository departamentRepository) {
            this.departamentRepository = departamentRepository;
        }

        public List<Departament> getAllDepartaments() {
            return departamentRepository.findAll();
        }

        public Departament getDepartamentById(Integer id) {
            Optional<Departament> optionalDepartament = departamentRepository.findById(String.valueOf(id));
            return optionalDepartament.orElse(null);
        }

        public Departament createDepartament(Departament departament) {
            return departamentRepository.save(departament);
        }

        public Departament updateDepartament(Integer id, Departament departament) {
            if (departamentRepository.existsById(String.valueOf(id))) {
                departament.setIdDep(id);
                return departamentRepository.save(departament);
            } else {
                return null;
            }
        }

        public boolean deleteDepartament(String id) {
            if (departamentRepository.existsById(id)) {
                departamentRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        }
    }
