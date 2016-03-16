package com.ligaBaloncesto.Repository;

import com.ligaBaloncesto.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long> {
    public Jugador findBynombre(String nombre);
    public List<Jugador> findBynombreStartingWith(String nombre);
    public List<Jugador> findBycanastasTotalesGreaterThanEqual(Integer canastasTotales);
    public List<Jugador> findByasistenciasTotalesBetween(Integer minAsistencias, Integer maxAsistencias);
    public List<Jugador> findByposicionCampoIs(String posicionCampo);
    public List<Jugador> findByfechaNacimientoBefore(Date fechaNacimiento);
    public List<Jugador> findBycanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(Integer canastasTotales, Date fechaNacimiento);
    public ArrayList findByEquipoNombre(String equipo);
    public ArrayList findByEquipoNombreAndPosicionCampoIs(String equipo,String posicion);
    public Jugador findTopByOrderByCanastasTotalesDesc();
    public ArrayList<Jugador> findFirst5ByOrderByAsistenciasTotalesDesc();
    /*@Query("SELECT j FROM Jugador j where j.equipo.name = :equipoName order by j.canastasTotal desc ")
    List<Jugador> findJugadorOrderByCanastasFromEquipo(@Param("equipoName") String equipoName);*/
}
