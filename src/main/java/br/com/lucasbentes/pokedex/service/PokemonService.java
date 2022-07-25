package br.com.lucasbentes.pokedex.service;

import br.com.lucasbentes.pokedex.exceptions.ResourceNotFoundException;
import br.com.lucasbentes.pokedex.model.Pokemon;
import br.com.lucasbentes.pokedex.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository repository;

    private Logger logger = Logger.getLogger(TipoService.class.getName());

    public List<Pokemon> findAll(){
        logger.info("Finding all pokemon!");
        return repository.findAll();
    }

    public Pokemon findById(Long id){
        logger.info("Finding one pokemon!");
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));
    }

    public Optional<Pokemon> findByPokemon(String pokemon){
        logger.info("Updating one pokemon!");
        return repository.findAllByNomeContainingIgnoreCase(pokemon);
    }

    public Pokemon create(Pokemon pokemon) {
        logger.info("Creating one pokemon!");
        return repository.save(pokemon);
    }

    public Pokemon update(Pokemon pokemon) {
        logger.info("Updating one pokemon!");

        Pokemon entity = repository.findById(pokemon.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        entity.setNome(pokemon.getNome());
        entity.setNumero(pokemon.getNumero());
        entity.setFoto(pokemon.getFoto());
        entity.setClassificacao(pokemon.getClassificacao());
        entity.setPeso(pokemon.getPeso());
        entity.setAltura(pokemon.getAltura());
        entity.setTaxaCaptura(pokemon.getTaxaCaptura());
        entity.setTaxaGenero(pokemon.getTaxaGenero());

        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("Deleting one pokemon!");

        Pokemon entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        repository.delete(entity);
    }
}
