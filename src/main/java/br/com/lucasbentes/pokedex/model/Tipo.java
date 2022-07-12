package br.com.lucasbentes.pokedex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tipo")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo;

    @NotNull
    private String nomeTipo;

    @NotNull
    private String fotoTipo;

    @ManyToOne
    @JsonIgnoreProperties("tipo")
    private Pokemon pokemon;

    /*
    Os gets e sets
     */
    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public String getFotoTipo() {
        return fotoTipo;
    }

    public void setFotoTipo(String fotoTipo) {
        this.fotoTipo = fotoTipo;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
