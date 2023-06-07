package com.pokemon.pokemon.controllers;

import com.pokemon.pokemon.models.PokemonModels;
import com.pokemon.pokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
