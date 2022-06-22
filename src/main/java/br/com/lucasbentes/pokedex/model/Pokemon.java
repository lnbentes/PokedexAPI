package br.com.lucasbentes.pokedex.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @NotNull
    private String nome;

    @NotNull
    private int numero;

    @NotNull
    private String foto;

    private String classificacao;

    @Size(max = 10)
    private String peso;

    @Size(max = 10)
    private String altura;

    @Size(max = 10)
    private String taxaCaptura;

    @Size(max = 20)
    private String taxaGenero;


    private Tipo tipo;


    private Habilidade habilidade;

}
