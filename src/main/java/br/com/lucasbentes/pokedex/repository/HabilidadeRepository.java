package br.com.lucasbentes.pokedex.repository;

import br.com.lucasbentes.pokedex.model.Habilidade;
import br.com.lucasbentes.pokedex.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {

    public Optional<Habilidade> findByHabilidadeContainingIgnoreCase(String habilidade);

}
