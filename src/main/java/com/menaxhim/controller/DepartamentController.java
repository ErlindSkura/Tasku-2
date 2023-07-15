package com.menaxhim.controller;

import com.menaxhim.entities.Departament;
import com.menaxhim.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentet")
public class DepartamentController {
    private DepartamentService departamentService;

    @Autowired
    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }

    // GET /departamentet
    @GetMapping
    public List<Departament> getAllDepartaments() {
        return departamentService.getAllDepartaments();
    }

    // GET /departamentet/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Departament> getDepartamentById(@PathVariable Integer id) {
        Departament departament = departamentService.getDepartamentById(id);
        if (departament != null) {
            return ResponseEntity.ok(departament);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // POST /departamentet
    @PostMapping
    public ResponseEntity<Departament> createDepartament(@RequestBody Departament departament) {
        Departament createdDepartament = departamentService.createDepartament(departament);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDepartament);
    }

    // PUT /departamentet/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Departament> updateDepartament(@PathVariable Integer id, @RequestBody Departament departament) {
        Departament updatedDepartament = departamentService.updateDepartament(id, departament);
        if (updatedDepartament != null) {
            return ResponseEntity.ok(updatedDepartament);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE /departamentet/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartament(@PathVariable String id) {
        boolean deleted = departamentService.deleteDepartament(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}