package br.com.lucasbentes.pokedex.controller;

import br.com.lucasbentes.pokedex.model.Tipo;
import br.com.lucasbentes.pokedex.service.TipoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipo")
@Tag(name = "Tipo", description = "Endpoints para gerenciar as tipagens")
public class TipoController {

    @Autowired
    private TipoService service;

    @RequestMapping(method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tipo> findAll(){
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Tipo findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @RequestMapping(value = "/nome/{tipo}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Tipo> findByTipo(@PathVariable(value = "tipo") String tipo){
        return service.findByTipo(tipo);
    }

    @RequestMapping(method=RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Tipo post(@RequestBody Tipo tipo){
        return service.create(tipo);
    }

    @RequestMapping(method=RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Tipo put(@RequestBody Tipo tipo){
        return service.update(tipo);
    }

    @RequestMapping(value = "/{id}",
            method=RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
    }
}
