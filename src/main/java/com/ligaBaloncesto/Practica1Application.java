package com.ligaBaloncesto;

import com.ligaBaloncesto.Service.EquipoService;
import com.ligaBaloncesto.Service.JugadorService;
import com.ligaBaloncesto.Service.LigaService;
import com.ligaBaloncesto.Service.TemporadaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Practica1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Practica1Application.class, args);

        JugadorService servicePlayer = context.getBean(JugadorService.class);
        servicePlayer.creaJugadores();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>CREA JUGADORES EXECUTAT<<<<<<<<<<<<<------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        EquipoService equipoService = context.getBean(EquipoService.class);
        equipoService.creaEquipos();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>CREA EQUIPOS EXECUTAT<<<<<<<<<<<<<------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        TemporadaService temporadaService = context.getBean(TemporadaService.class);
        temporadaService.creaTemporadas();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>APLICACIÓ FINALITZADA<<<<<<<<<<<<<------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        LigaService ligaService = context.getBean(LigaService.class);
        ligaService.creaLiga();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>APLICACIÓ FINALITZADA<<<<<<<<<<<<<------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}