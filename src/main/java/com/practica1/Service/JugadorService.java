package com.practica1.Service;

import com.practica1.Model.Jugador;
import com.practica1.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jordi.artal on 25/11/2015.
 */

@Service
@Transactional

public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    public void creaPlayer(){

        Jugador player1 = new Jugador();
        player1.setNombre("Jordi");
        player1.setAsistenciasTotales(25);
        player1.setCanastasTotales(99);
        player1.setRebotesTotales(99);
        player1.setPosicionCampo("base");
        Calendar cal=Calendar.getInstance();
        cal.set(1990, Calendar.FEBRUARY, 2);
        Date birthDate = cal.getTime();
        player1.setFechaNacimiento(birthDate);
        jugadorRepository.save(player1);

        Jugador player2 = new Jugador();
        player2.setNombre("Joan");
        player2.setAsistenciasTotales(52);
        player2.setCanastasTotales(89);
        player2.setRebotesTotales(55);
        player2.setPosicionCampo("escolta");
        cal=Calendar.getInstance();
        cal.set(1991, Calendar.MARCH, 3);
        birthDate = cal.getTime();
        player2.setFechaNacimiento(birthDate);
        jugadorRepository.save(player2);

        Jugador player3 = new Jugador();
        player3.setNombre("Javi");
        player3.setAsistenciasTotales(76);
        player3.setCanastasTotales(66);
        player3.setRebotesTotales(33);
        player3.setPosicionCampo("alero");
        cal=Calendar.getInstance();
        cal.set(1993, Calendar.APRIL, 4);
        birthDate = cal.getTime();
        player3.setFechaNacimiento(birthDate);
        jugadorRepository.save(player3);

        Jugador player4 = new Jugador();
        player4.setNombre("Jose");
        player4.setAsistenciasTotales(23);
        player4.setCanastasTotales(102);
        player4.setRebotesTotales(20);
        player4.setPosicionCampo("ala-pivot");
        cal=Calendar.getInstance();
        cal.set(1994, Calendar.MAY, 5);
        birthDate = cal.getTime();
        player4.setFechaNacimiento(birthDate);
        jugadorRepository.save(player4);

        Jugador player5 = new Jugador();
        player5.setNombre("Ramon");
        player5.setAsistenciasTotales(78);
        player5.setCanastasTotales(87);
        player5.setRebotesTotales(56);
        player5.setPosicionCampo("pivot");
        cal=Calendar.getInstance();
        cal.set(1995, Calendar.JUNE, 6);
        birthDate = cal.getTime();
        player5.setFechaNacimiento(birthDate);
        jugadorRepository.save(player5);

        System.out.println(jugadorRepository.findBynombreStartingWith("J"));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqual(70));
        System.out.println(jugadorRepository.findByasistenciasTotalesBetween(60, 150));
        System.out.println(jugadorRepository.findByposicionCampoIs("pivot"));
        System.out.println(jugadorRepository.findByfechaNacimientoBefore(cal.getTime()));
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(87,cal.getTime()));

    }
}
