package com.ligaBaloncesto.Repository;

import com.ligaBaloncesto.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporadaRepository extends PagingAndSortingRepository <Temporada,Long> {
    public Temporada findByNombre(String nombre);
}
