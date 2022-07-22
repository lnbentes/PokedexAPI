package br.com.lucasbentes.pokedex.service;

import br.com.lucasbentes.pokedex.exceptions.ResourceNotFoundException;
import br.com.lucasbentes.pokedex.model.Tipo;
import br.com.lucasbentes.pokedex.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class TipoService {

    @Autowired
    TipoRepository repository;

    private Logger logger = Logger.getLogger(TipoService.class.getName());

    public List<Tipo> findAll(){
        logger.info("Finding all people!");
        return repository.findAll();
    }

    public Tipo findById(Long id){
        logger.info("Finding one person!");
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));
    }

    public Tipo findByTipo(String tipo){
        logger.info("Updating one person!");

        return repository.findByTipoContainingIgnoreCase(tipo)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this Type"));

    }

    public Tipo create(Tipo tipo) {
        logger.info("Creating one person!");
        return repository.save(tipo);
    }

    public Tipo update(Tipo tipo) {
        logger.info("Updating one person!");

        Tipo entity = repository.findById(tipo.getIdTipo())
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        entity.setNomeTipo(tipo.getNomeTipo());
        entity.setFotoTipo(tipo.getFotoTipo());
        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");

        Tipo entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        repository.delete(entity);
    }

}
