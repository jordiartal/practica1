package com.practica1.Repository;

import com.practica1.Model.Jugador;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jordi.artal on 25/11/2015.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long> {

    public List<Jugador> findBynombreStartingWith(String nombre);
    public List<Jugador> findBycanastasTotalesGreaterThanEqual(Integer canastasTotales);
    public List<Jugador> findByasistenciasTotalesBetween(Integer minAsistencias, Integer maxAsistencias);
    public List<Jugador> findByposicionCampoIs(String posicionCampo);
    public List<Jugador> findByfechaNacimientoBefore(Date fechaNacimiento);
    /*public List<Jugador> findBycanastasTotalesGreaterThanEqualAndFechaNaciemientoBefore(Integer canastasTotales, Date fechaNacimiento);*/

}
