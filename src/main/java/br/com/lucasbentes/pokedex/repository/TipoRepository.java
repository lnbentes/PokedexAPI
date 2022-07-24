package br.com.lucasbentes.pokedex.repository;

import br.com.lucasbentes.pokedex.model.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long> {

    List<Tipo> findALLByNomeTipoContainingIgnoreCase(String tipo);

}
