package com.ligaBaloncesto.Repository;


import com.ligaBaloncesto.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface EquipoRepository extends PagingAndSortingRepository<Equipo,Long> {
    Equipo findByNombre(String nombre);
    public ArrayList findByLocalidad(String localidad);

}
