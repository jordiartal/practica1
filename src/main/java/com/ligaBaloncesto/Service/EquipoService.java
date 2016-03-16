package com.ligaBaloncesto.Service;

import com.ligaBaloncesto.Model.Equipo;
import com.ligaBaloncesto.Model.Jugador;
import com.ligaBaloncesto.Repository.EquipoRepository;
import com.ligaBaloncesto.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private JugadorRepository jugadorRepository;
    //per a la DATA
    Calendar cal = Calendar.getInstance();

    //CREACIO DE EQUIPS
    public void creaEquipos(){
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("equipo1");
        equipo1.setLocalidad("localidad1");
            cal.set(1900,Calendar.JANUARY,1);
        equipo1.setFechaCreacion(cal.getTime());
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("equipo2");
        equipo2.setLocalidad("localidad2");
            cal.set(1900,Calendar.JANUARY,1);
        equipo2.setFechaCreacion(cal.getTime());
        equipoRepository.save(equipo2);

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("equipo3");
        equipo3.setLocalidad("localidad3");
            cal.set(1900,Calendar.JANUARY,1);
        equipo3.setFechaCreacion(cal.getTime());
        equipoRepository.save(equipo3);

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("equipo4");
        equipo4.setLocalidad("localidad4");
            cal.set(1900,Calendar.JANUARY,1);
        equipo4.setFechaCreacion(cal.getTime());
        equipoRepository.save(equipo4);

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("equipo5");
        equipo5.setLocalidad("localidad5");
            cal.set(1900,Calendar.JANUARY,1);
        equipo5.setFechaCreacion(cal.getTime());
        equipoRepository.save(equipo5);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>EQUIPS CREATS<<<<<<<<<<<<<------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        //ASSIGNACIÓ DE JUGADORS ALS EQUIPS
        Jugador jugador1 = jugadorRepository.findBynombre("jugador1");
        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Jugador jugador2 = jugadorRepository.findBynombre("jugador2");
        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);

        Jugador jugador3 = jugadorRepository.findBynombre("jugador3");
        jugador3.setEquipo(equipo2);
        jugadorRepository.save(jugador3);

        Jugador jugador4 = jugadorRepository.findBynombre("jugador4");
        jugador4.setEquipo(equipo2);
        jugadorRepository.save(jugador4);

        Jugador jugador5 = jugadorRepository.findBynombre("jugador5");
        jugador5.setEquipo(equipo3);
        jugadorRepository.save(jugador5);

        Jugador jugador6 = jugadorRepository.findBynombre("jugador6");
        jugador6.setEquipo(equipo3);
        jugadorRepository.save(jugador6);

        Jugador jugador7 = jugadorRepository.findBynombre("jugador7");
        jugador7.setEquipo(equipo4);
        jugadorRepository.save(jugador7);

        Jugador jugador8 = jugadorRepository.findBynombre("jugador8");
        jugador8.setEquipo(equipo4);
        jugadorRepository.save(jugador8);

        Jugador jugador9 = jugadorRepository.findBynombre("jugador9");
        jugador9.setEquipo(equipo5);
        jugadorRepository.save(jugador9);

        Jugador jugador10 = jugadorRepository.findBynombre("jugador10");
        jugador10.setEquipo(equipo5);
        jugadorRepository.save(jugador10);

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>EQUIPS ASSIGNATS<<<<<<<<<<<<<------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    //CONSULTES
}