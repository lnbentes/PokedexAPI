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

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("pokemon")
    private List<Tipo> tipo;

    @OneToMany(mappedBy = "pokemon", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("pokemon")
    private List<Habilidade> habilidade;


    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
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

    public List<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(List<Tipo> tipo) {
        this.tipo = tipo;
    }

    public List<Habilidade> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<Habilidade> habilidade) {
        this.habilidade = habilidade;
    }
}
