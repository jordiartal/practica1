package com.ligaBaloncesto.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String nombre;
    @OneToMany(mappedBy = "liga")
    private Set<Temporada> temporadas = new HashSet<>();

    public Liga() {
    }

    public Liga(String nombre, Set<Temporada> temporadas) {
        this.nombre = nombre;
        this.temporadas = temporadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
