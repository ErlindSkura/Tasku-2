package com.menaxhim.controller;


import com.menaxhim.entities.Punonjes;
import com.menaxhim.service.PunonjesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/punonjesit")
public class PunonjesController {
    @Autowired
    PunonjesService punonjesService;

    public Punonjes savePunonjes(@RequestBody Punonjes punonjes) {
        return punonjesService.createPunonjes(punonjes);
    }

    @GetMapping()
    public List<Punonjes> getPunonjesit() {
        return punonjesService.getPunonjesit();
    }

    @GetMapping("/{id}")
    public Punonjes getpunonjes(@PathVariable int id) {
        return punonjesService.getPunonjes(id);
    }

    @PutMapping("/{id}")
    public Punonjes updatePunonjes(@PathVariable int id, @RequestBody Punonjes punonjes) {
        return punonjesService.updatePunonjes(id, punonjes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePunonjes(@PathVariable String id) {
        punonjesService.deletePunonjes(id);
        return new ResponseEntity<>("Punonjesi i fshire me sukses", HttpStatus.OK);
    }
}
