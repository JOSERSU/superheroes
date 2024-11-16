package com.upiiz.superheroes.services;

import com.upiiz.superheroes.entities.Heroe;
import com.upiiz.superheroes.respositories.HeroeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class HeroeService {

    @Autowired
    private HeroeRepository heroeRepository;

    //GET TODOS
    public List<Heroe> getAllHeroes(){
        return heroeRepository.findAll();
    }

    //GET UNO
    public Heroe getHeroeById(Long id){
        return heroeRepository.findById(id).orElse(null);
    }

    //POST
    public Heroe createHeroe(Heroe heroe){
        return heroeRepository.save(heroe);
    }

    //PUT
    public Heroe updateHeroe(Heroe heroe){
        return heroeRepository.save(heroe);
    }

    //DELETE
    public void deteleHeroe(Long id){
        heroeRepository.deleteById(id);
    }

}
