package br.com.senai.pokedex.service;

import br.com.senai.pokedex.models.Pokemon;
import br.com.senai.pokedex.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    //CADASTRO DE POKEMONS
    public Pokemon create(Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }

    //ATUALIZAÇÃO DE POKEMONS
    public Pokemon update(Long id, Pokemon pokemonUpdate) throws Exception{
        Optional<Pokemon> pokemon = pokemonRepository.findById(id);
        if(pokemon.isPresent()){
            pokemon.get().setNumero(pokemonUpdate.getNumero());
            pokemon.get().setNome(pokemonUpdate.getNome());
            pokemon.get().setDescricao(pokemonUpdate.getDescricao());
            pokemon.get().setUrl(pokemonUpdate.getUrl());
            pokemon.get().setTipo(pokemonUpdate.getTipo());
            pokemon.get().setCategoria(pokemonUpdate.getCategoria());
            pokemon.get().setHabitat(pokemonUpdate.getHabitat());
            pokemon.get().setAltura(pokemonUpdate.getAltura());
            pokemon.get().setPeso(pokemonUpdate.getPeso());
            pokemonRepository.save(pokemon.get());
        }
        return pokemon.get();
    }

    //EXCLUSÃO DE POKEMONS
    public void delete(Long id){
        pokemonRepository.deleteById(id);
    }

    //LISTAR UM POKEMON
    public Optional<Pokemon> findOne(Long id) {
        return pokemonRepository.findById(id);
    }
}
