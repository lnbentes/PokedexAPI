package br.com.lucasbentes.pokedex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @ManyToOne
    @JsonIgnoreProperties("pokemon")
    private Tipo tipo;

    @ManyToOne
    @JsonIgnoreProperties("pokemon")
    private Habilidade habilidade;

    /*
    Os gets e sets
     */
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTaxaCaptura() {
        return taxaCaptura;
    }

    public void setTaxaCaptura(String taxaCaptura) {
        this.taxaCaptura = taxaCaptura;
    }

    public String getTaxaGenero() {
        return taxaGenero;
    }

    public void setTaxaGenero(String taxaGenero) {
        this.taxaGenero = taxaGenero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Habilidade getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade habilidade) {
        this.habilidade = habilidade;
    }
}
