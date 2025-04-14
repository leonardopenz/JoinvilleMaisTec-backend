package br.com.senai.pokedex.controllers;

import br.com.senai.pokedex.models.Pokemon;
import br.com.senai.pokedex.repository.PokemonRepository;
import br.com.senai.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @PostMapping
    public ResponseEntity<Pokemon> create(@RequestBody Pokemon pokemon) throws Exception{
        this.pokemonService.create(pokemon);
        return ResponseEntity.ok(pokemon);
    }
}
