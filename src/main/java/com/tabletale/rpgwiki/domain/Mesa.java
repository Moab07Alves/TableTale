package com.tabletale.rpgwiki.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MESAS")
public class Mesa extends AbstractEntity<Long>{

    @Column(name = "nome_do_Jogo", nullable = false)
    private String nomeDoJogo;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_criacao", nullable = false, columnDefinition = "DATE")
    private LocalDate dataCriacao;

    @Column(name = "numero_maximo_user", nullable = false)
    private int numeroMax;

    @ManyToOne
    @JoinColumn(name = "usuario_mestre_id_fk")
    private Usuario usuarioMestre;

    @OneToMany(mappedBy = "mesa")
    private List<Personagem> personagensDaMesa;

}
