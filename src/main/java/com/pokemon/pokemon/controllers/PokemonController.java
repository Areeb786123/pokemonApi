package com.pokemon.pokemon.controllers;

import com.pokemon.pokemon.models.PokemonModels;
import com.pokemon.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping("/getAllPokemons")
    public List<PokemonModels> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    @PostMapping("/addPokemon")
    public PokemonModels addPokemon(@RequestBody  PokemonModels pokemonData) {
        return pokemonRepository.save(pokemonData);
    }

}
