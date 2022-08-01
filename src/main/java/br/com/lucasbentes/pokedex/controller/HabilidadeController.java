package br.com.lucasbentes.pokedex.controller;

import br.com.lucasbentes.pokedex.model.Habilidade;
import br.com.lucasbentes.pokedex.service.HabilidadeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habilidade")
@Tag(name = "Habilidade", description = "Endpoints para gerenciar as habilidades")
public class HabilidadeController {

    @Autowired
    private HabilidadeService service;

    @RequestMapping(method= RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Habilidade> findAll(){
        return service.findALl();
    }

    @RequestMapping(value = "/{id}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Habilidade findById(@PathVariable(value = "id") Long id){
        return service.findById(id);
    }

    @RequestMapping(value = "/nome/{habilidade}",
            method=RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Habilidade findByTipo(@PathVariable(value = "habilidade") String habilidade){
        return service.findByAbility(habilidade);
    }

    @RequestMapping(method=RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Habilidade post(@RequestBody Habilidade habilidade){
        return service.create(habilidade);
    }

    @RequestMapping(method=RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Habilidade put(@RequestBody Habilidade habilidade){
        return service.update(habilidade);
    }

    @RequestMapping(value = "/{id}",
            method=RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id){
        service.delete(id);
    }
}
