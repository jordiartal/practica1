package com.ligaBaloncesto.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String nombre;
    @ManyToOne
    private Liga liga;
    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

    public Temporada() {
    }

    public Temporada(String nombre, Liga liga, Set<Equipo> equipos) {
        this.nombre = nombre;
        this.liga = liga;
        this.equipos = equipos;
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

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }
}

