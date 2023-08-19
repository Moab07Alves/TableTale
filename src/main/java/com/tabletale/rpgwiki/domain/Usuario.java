package com.tabletale.rpgwiki.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USUARIOS")
public class Usuario extends AbstractEntity<Long>{

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "nome", nullable = false, unique = true)
    private String email;

    @Column(name = "nome", nullable = false)
    private String senha;

    @Column(name = "biografia")
    private String biografia;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @Enumerated(EnumType.STRING)
    private Pais pais;

    @OneToMany(mappedBy = "usuario")
    private List<Personagem> pesronoagens;

    @OneToMany(mappedBy = "usuarioMestre")
    private List<Mesa> mesasMestradas;

}
