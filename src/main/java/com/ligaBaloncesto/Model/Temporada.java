package com.ligaBaloncesto.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String nombre;
    @Column
    private Date fecha;
    @ManyToOne
    private Liga liga;
    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public Temporada(String nombre, Date fecha, Liga liga, Set<Equipo> equipos) {

        this.nombre = nombre;
        this.fecha = fecha;
        this.liga = liga;
        this.equipos = equipos;
    }

    public Temporada() {

    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", liga=" + liga +
                ", equipos=" + equipos +
                '}';
    }
}

