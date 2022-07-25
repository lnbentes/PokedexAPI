package br.com.lucasbentes.pokedex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "habilidade")
public class Habilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nomeHabilidade;

    @ManyToOne
    @JsonIgnoreProperties("habilidade")
    private Pokemon pokemon;


    public Long getId() {
        return id;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
