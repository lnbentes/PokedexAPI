package br.com.lucasbentes.pokedex.service;

import br.com.lucasbentes.pokedex.exceptions.ResourceNotFoundException;
import br.com.lucasbentes.pokedex.model.Tipo;
import br.com.lucasbentes.pokedex.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class TipoService {

    @Autowired
    private TipoRepository repository;

    private Logger logger = Logger.getLogger(TipoService.class.getName());

    public List<Tipo> findAll(){
        logger.info("Finding all type!");
        return repository.findAll();
    }

    public Tipo findById(Long id){
        logger.info("Finding one type!");
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));
    }

    public Optional<Tipo> findByTipo(String tipo){
        logger.info("Updating one type!");
        return repository.findALLByNomeTipoContainingIgnoreCase(tipo);
    }

    public Tipo create(Tipo tipo) {
        logger.info("Creating one type!");
        return repository.save(tipo);
    }

    public Tipo update(Tipo tipo) {
        logger.info("Updating one type!");

        Tipo entity = repository.findById(tipo.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        entity.setNomeTipo(tipo.getNomeTipo());
        entity.setFotoTipo(tipo.getFotoTipo());
        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("Deleting one type!");

        Tipo entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        repository.delete(entity);
    }

}
