package com.ligaBaloncesto;

import com.ligaBaloncesto.Service.EquipoService;
import com.ligaBaloncesto.Service.JugadorService;
import com.ligaBaloncesto.Service.LigaService;
import com.ligaBaloncesto.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LigaBaloncestoSpringApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LigaBaloncestoSpringApplication.class, args);

        JugadorService jugadorService = context.getBean(JugadorService.class);
        jugadorService.creaJugadores();
        System.out.println("------------------>>>>>>>>>>>>>>>>>>CREA JUGADORES EXECUTAT<<<<<<<<<<<<<------------------");
        EquipoService equipoService = context.getBean(EquipoService.class);
        equipoService.creaEquipos();
        System.out.println("------------------>>>>>>>>>>>>>>>>>>CREA EQUIPOS EXECUTAT<<<<<<<<<<<<<------------------");
        TemporadaService temporadaService = context.getBean(TemporadaService.class);
        temporadaService.creaTemporadas();
        System.out.println("------------------>>>>>>>>>>>>>>>>>>CREA TEMPORADES EXECUTAT<<<<<<<<<<<<<------------------");
        LigaService ligaService = context.getBean(LigaService.class);
        ligaService.creaLiga();
        System.out.println("------------------>>>>>>>>>>>>>>>>>>CREA LLIGUES EXECUTAT<<<<<<<<<<<<<------------------");

        //CONSULTES JUGADOR
        jugadorService.jugadorNom();
        jugadorService.jugadorCanastas();
        jugadorService.jugadorAssistencias();
        jugadorService.jugadorPosicion();
        jugadorService.jugadorFecha();
        jugadorService.jugadorCanastasFecha();
        jugadorService.jugadorMaxACanastas();
        jugadorService.jugadorTop5Assitencias();
        /*jugadorService.jugadorTopCanastasEquipo();*/

        //CONSULTES EQUIP
        equipoService.equipsLocalitat();
        equipoService.equipsNom();
        equipoService.equipsNomPosicio();

        System.out.println();
        System.out.println();
        System.out.println("------------------>>>>>>>>>>>>>>>>>>APLICACIO FINALITZADA<<<<<<<<<<<<<------------------");
    }
}