package com.ligaBaloncesto.Service;

import com.ligaBaloncesto.Model.Jugador;
import com.ligaBaloncesto.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;


@Service
@Transactional
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;
    //per la DATA
    Calendar cal=Calendar.getInstance();

    public void creaJugadores() {
        Jugador jugador1 = new Jugador();
        jugador1.setNombre("jugador1");
        jugador1.setAsistenciasTotales(25);
        jugador1.setCanastasTotales(99);
        jugador1.setRebotesTotales(99);
        jugador1.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador1.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador1);


        Jugador jugador2 = new Jugador();
        jugador2.setNombre("jugador2");
        jugador2.setAsistenciasTotales(25);
        jugador2.setCanastasTotales(99);
        jugador2.setRebotesTotales(99);
        jugador2.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador2.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador2);


        Jugador jugador3 = new Jugador();
        jugador3.setNombre("jugador3");
        jugador3.setAsistenciasTotales(25);
        jugador3.setCanastasTotales(99);
        jugador3.setRebotesTotales(99);
        jugador3.setPosicionCampo("pivot");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador3.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador3);


        Jugador jugador4 = new Jugador();
        jugador4.setNombre("jugador4");
        jugador4.setAsistenciasTotales(25);
        jugador4.setCanastasTotales(99);
        jugador4.setRebotesTotales(99);
        jugador4.setPosicionCampo("pivot");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador4.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador4);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("jugador5");
        jugador5.setAsistenciasTotales(25);
        jugador5.setCanastasTotales(99);
        jugador5.setRebotesTotales(99);
        jugador5.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador5.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador5);

        Jugador jugador6 = new Jugador();
        jugador6.setNombre("jugador6");
        jugador6.setAsistenciasTotales(25);
        jugador6.setCanastasTotales(99);
        jugador6.setRebotesTotales(99);
        jugador6.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador6.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador6);

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("jugador7");
        jugador7.setAsistenciasTotales(25);
        jugador7.setCanastasTotales(99);
        jugador7.setRebotesTotales(99);
        jugador7.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador7.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador7);

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("jugador8");
        jugador8.setAsistenciasTotales(25);
        jugador8.setCanastasTotales(99);
        jugador8.setRebotesTotales(99);
        jugador8.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador8.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador8);

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("jugador9");
        jugador9.setAsistenciasTotales(25);
        jugador9.setCanastasTotales(99);
        jugador9.setRebotesTotales(99);
        jugador9.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador9.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador9);

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("jugador10");
        jugador10.setAsistenciasTotales(25);
        jugador10.setCanastasTotales(99);
        jugador10.setRebotesTotales(99);
        jugador10.setPosicionCampo("base");
        cal.set(1990, Calendar.FEBRUARY, 2);
        jugador10.setFechaNacimiento(cal.getTime());
        jugadorRepository.save(jugador10);
    }

    public void jugadorNom(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA ELS QUE COMENCIN PER 'JUG'<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findBynombreStartingWith("Jug"));
    }

    public void jugadorCanastas(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA CISTELLES TOTALS MAJORS QUE 70<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqual(70));
    }

    public void jugadorAssistencias(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA ASSISTENCIES TOTALS ENTRE 60-150<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findByasistenciasTotalesBetween(60, 150));
    }

    public void jugadorPosicion(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA PER POSICIÓ PIVOT<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findByposicionCampoIs("pivot"));
    }

    public void jugadorFecha(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA PER NAIXEMENT ANTERIOR A"+ cal.getTime() +"<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findByfechaNacimientoBefore(cal.getTime()));
    }

    public void jugadorCanastasFecha(){
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA PER CISTELLES TOTALS MAJORS O IGUALS QUE 87 <<<<<<<<<<<<<------------------");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>I DATA NAIXEMENT ABANS DE "+ cal.getTime() +"<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findBycanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(87,cal.getTime()));
    }

    public void jugadorMaxACanastas() {
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA PER MAXIM DE CISTELLES<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findTopByOrderByCanastasTotalesDesc());
    }

    public void jugadorTop5Assitencias() {
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA PER TOP 5 ASSIETNCIES<<<<<<<<<<<<<------------------");
        ArrayList list = jugadorRepository.findFirst5ByOrderByAsistenciasTotalesDesc();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
        list.clear();
    }

    /*public void jugadorTopCanastasEquipo() {
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>TROBA PER TOP 1 CISTELLES 'EQUIPO3'<<<<<<<<<<<<<------------------");
        System.out.println(jugadorRepository.findJugadorOrderByCanastasFromEquipo("equipo3").get(0));
    }*/
}