package com.menaxhim.punonjes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/punonjes")
public class PunonjesController {
    @Autowired
    PunonjesService punonjesService;

    @PostMapping("/save")
    public Punonjes savePunonjes(@RequestBody Punonjes punonjes) {
        return punonjesService.createPunonjes(punonjes);
    }

    @GetMapping("/getpunonjesit")
    public List<Punonjes> getPunonjesit() {

        return punonjesService.getPunonjesit();
    }

    @GetMapping("/getpunonjes/{id}")
    public Punonjes getpunonjes(@PathVariable int id) {
        return punonjesService.getPunonjes(id);
    }

    @PutMapping("/{id}")
    public Punonjes updatePunonjes(@PathVariable int id, @RequestBody Punonjes punonjes) {
        return punonjesService.updatePunonjes(punonjes, id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePunonjes(@PathVariable int id) {
        punonjesService.deletePunonjes(id);
        return new ResponseEntity<String>("Punonjesi i fshire me sukses", HttpStatus.OK);
    }
}
