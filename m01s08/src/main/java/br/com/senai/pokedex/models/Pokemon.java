package br.com.senai.pokedex.models;

import br.com.senai.pokedex.models.enums.TipoPokemonEnum;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Integer numero;

    @Column(length = 100)
    private String nome;

    @Column(length = 500)
    private String descricao;

    @Column(name = "imagem_url", length = 255)
    private String url;

    @Column
    @Enumerated(EnumType.STRING)
    private TipoPokemonEnum tipo;

    @Column
    private String categoria;

    @Column
    private String habitat;

    private Float altura;

    private Float peso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TipoPokemonEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemonEnum tipo) {
        this.tipo = tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id) && Objects.equals(numero, pokemon.numero) && Objects.equals(nome, pokemon.nome) && Objects.equals(descricao, pokemon.descricao) && Objects.equals(url, pokemon.url) && tipo == pokemon.tipo && Objects.equals(categoria, pokemon.categoria) && Objects.equals(habitat, pokemon.habitat) && Objects.equals(altura, pokemon.altura) && Objects.equals(peso, pokemon.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, nome, descricao, url, tipo, categoria, habitat, altura, peso);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", numero=" + numero +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", url='" + url + '\'' +
                ", tipo=" + tipo +
                ", categoria='" + categoria + '\'' +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}


