package br.com.senai.pokedex.models;

import br.com.senai.pokedex.models.enums.TipoPokemonEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Integer numero;

    @Column(nullable = false, length = 100)
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
}


