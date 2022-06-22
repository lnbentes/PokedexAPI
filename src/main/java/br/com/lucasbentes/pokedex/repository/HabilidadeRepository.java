package br.com.lucasbentes.pokedex.repository;

import br.com.lucasbentes.pokedex.model.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {
}
