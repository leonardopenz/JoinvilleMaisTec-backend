package br.com.senai.pokedex.controllers;

import br.com.senai.pokedex.models.Pokemon;
import br.com.senai.pokedex.repository.PokemonRepository;
import br.com.senai.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<Pokemon> update(@PathVariable Long id, @RequestBody Pokemon pokemon) throws Exception{
        Pokemon pokemonUpdate = this.pokemonService.update(id, pokemon);
        return ResponseEntity.ok(pokemonUpdate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        this.pokemonService.delete(id);
        return ResponseEntity.ok("Pokemon deletado com sucesso!");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> findOne(@PathVariable Long id){
        Optional<Pokemon> pokemon = pokemonService.findOne(id);
        return pokemon.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
}
