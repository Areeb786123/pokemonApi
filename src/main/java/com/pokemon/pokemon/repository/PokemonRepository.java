package com.pokemon.pokemon.repository;

import com.pokemon.pokemon.models.PokemonModels;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends MongoRepository<PokemonModels, String> {
}
