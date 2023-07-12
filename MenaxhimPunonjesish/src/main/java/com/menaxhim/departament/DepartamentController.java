package com.menaxhim.departament;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/departament")
public class DepartamentController {
    @Autowired
    DepartamentService departamentService;

    @PostMapping("/save")
    public Departament saveDepartament(@RequestBody Departament departament){
        return departamentService.createDepartament(departament);
    }

    @GetMapping("/getdepartamentet")
    public List<Departament> getDepartamentet(){
        return departamentService.getDepartamentet();
    }

    @GetMapping("/getdepartament/{idDep}")
    public Departament getdepartament(@PathVariable int idDep){

        return departamentService.getDepartament(idDep);
    }

    @PutMapping("/{idDep}")
    public Departament updateDepartament(@PathVariable int idDep, @RequestBody Departament departament){
        return departamentService.updateDepartament(departament, idDep);
    }

    @DeleteMapping("/delete/{idDep}")
    public ResponseEntity<String> deleteDepartament(@PathVariable int idDep){
        departamentService.deleteDepartament(idDep);
        return new ResponseEntity<String>("Departamenti i fshire me sukses", HttpStatus.OK);
    }
}
