package br.com.lucasbentes.pokedex.service;

import br.com.lucasbentes.pokedex.exceptions.ResourceNotFoundException;
import br.com.lucasbentes.pokedex.model.Habilidade;
import br.com.lucasbentes.pokedex.repository.HabilidadeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadeService {

    HabilidadeRepository repository;

    public List<Habilidade> findALl(){
        return repository.findAll();
    }

    public Habilidade findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this Habilite"));
    }

    public Habilidade findByAbility(String ability){
        return repository.findByNomeHabilidadeContainingIgnoreCase(ability)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ability"));
    }

    public Habilidade create(Habilidade habilidade) {
        return repository.save(habilidade);
    }

    public Habilidade update(Habilidade habilidade) {
        Habilidade entity = repository.findById(habilidade.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        entity.setNomeHabilidade(habilidade.getNomeHabilidade());
        return repository.save(entity);
    }

    public void delete(Long id) {
        Habilidade entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found this ID"));

        repository.delete(entity);
    }
}
