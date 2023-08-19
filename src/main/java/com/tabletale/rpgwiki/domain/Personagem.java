package com.tabletale.rpgwiki.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSONAGENS")
public class Personagem extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "historia", nullable = false)
    private String historia;

    @Column(name = "idade", nullable = false)
    private int idade;

    @Column(name = "classe", nullable = false)
    private String classe;

    @Column(name = "raca", nullable = false)
    private String raca;

    @Column(name = "nivel", nullable = false)
    private int nivel;

    @Column(name = "data_criacao", nullable = false)
    private LocalDate dataCriacao;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "dano", nullable = false)
    private int dano;

    @Column(name = "forca", nullable = false)
    private int forca;

    @Column(name = "defesa", nullable = false)
    private int defesa;

    @Column(name = "agilidade", nullable = false)
    private int agilidade;

    @Column(name = "inteligencia", nullable = false)
    private int inteligencia;

    @Column(name = "sabedoria", nullable = false)
    private int sabedoria;

    @Column(name = "carisma", nullable = false)
    private int carisma;

    @Column(name = "abates", nullable = false)
    private int abates;

    @Column(name = "assistencia", nullable = false)
    private int assistencia;

    @ManyToOne
    @JoinColumn(name = "usuario_id_fk")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "mesa_id_fk")
    private Mesa mesa;

}
