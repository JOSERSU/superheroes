package com.upiiz.superheroes.controllers;

import com.upiiz.superheroes.entities.Heroe;
import com.upiiz.superheroes.services.HeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/heroes")
@CrossOrigin(origins = "https://superheroes-dc0k.onrender.com/api/v1/heroes")
public class HeroeController {

    @Autowired
    private HeroeService heroeService;

    //GET TODOS
    @GetMapping
    public ResponseEntity<List<Heroe>> getHeroes(){
        return ResponseEntity.ok(heroeService.getAllHeroes());
    }
    //GET UNO
    @GetMapping("/{id}")
    public ResponseEntity<Heroe> getHeroeById(@PathVariable Long id){
        return ResponseEntity.ok(heroeService.getHeroeById(id));
    }
    //POST
    @PostMapping
    public ResponseEntity<Heroe> createHeroe(@RequestBody Heroe heroe){
        return ResponseEntity.ok(heroeService.createHeroe(heroe));
    }
    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Heroe> updateHeroe(@RequestBody Heroe heroe, @PathVariable Long id){
        heroe.setId(id);
        return ResponseEntity.ok(heroeService.updateHeroe(heroe));
    }
    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Heroe> deleteHeroe(@PathVariable Long id){
        heroeService.deteleHeroe(id);
        return ResponseEntity.noContent().build();
    }


}
