package br.com.senai.pokedex.service;

import br.com.senai.pokedex.models.Pokemon;
import br.com.senai.pokedex.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    //CADATRO DE POKEMONS
    public Pokemon create(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }
}
