package br.com.lucasbentes.pokedex.repository;

import br.com.lucasbentes.pokedex.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    Optional<Pokemon> findAllByNomeContainingIgnoreCase(String nome);

}
