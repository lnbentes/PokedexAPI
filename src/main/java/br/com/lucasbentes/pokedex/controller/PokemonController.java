package br.com.lucasbentes.pokedex.controller;

import br.com.lucasbentes.pokedex.model.Pokemon;
import br.com.lucasbentes.pokedex.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @RequestMapping(method= RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pokemon> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @RequestMapping(value = "/nome/{pokemon}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Pokemon> findByPokemon(@PathVariable(value = "pokemon") String pokemon){
        return service.findByPokemon(pokemon);
    }

    @RequestMapping(method=RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon post(@RequestBody Pokemon pokemon){
        return service.create(pokemon);
    }

    @RequestMapping(method=RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pokemon put(@RequestBody Pokemon pokemon){
        return service.update(pokemon);
    }

    @RequestMapping(value = "/{id}",
            method=RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
    }
}
