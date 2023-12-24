package com.workintech.s17d1.controller;


import com.workintech.s17d1.entity.Animal;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech")
public class AnimalController {

        Map<Integer, Animal> animals = new HashMap<>();

        @GetMapping("/animal")
        public List<Animal> getAll(){
            return animals.values().stream().toList();
        }

        @GetMapping("/animal/{id}")
        public Animal getAnimalId(@PathVariable int id){
            return animals.get(id);
        }

        @PostMapping("/animal")
    public Animal save(@RequestBody Animal animal){
            animals.put(animal.getId(), animal);
            return animal;
        }

        @PutMapping("/animal/{id}")
    public Animal update(@PathVariable int id,@RequestBody Animal animal){

            animals.put(id,new Animal(id, animal.getAnimalName()));
            return animals.get(id);
        }

        @DeleteMapping("/animal/{id}")
    public Animal delete(@PathVariable int id){
            Animal animal = animals.get(id);
            animals.remove(id);
            return animal;


        }




}
