package br.com.lucasbentes.pokedex.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "habilidade")
public class Habilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @NotNull
    private String nomeHabilidade;
}
