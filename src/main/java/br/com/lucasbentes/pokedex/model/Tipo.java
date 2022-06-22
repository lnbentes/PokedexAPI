package br.com.lucasbentes.pokedex.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tipo")
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @NotNull
    private String nomeTipo;

    @NotNull
    private String fotoTipo;
}
