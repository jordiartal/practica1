package com.ligaBaloncesto;

import com.ligaBaloncesto.Service.EquipoService;
import com.ligaBaloncesto.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Practica1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Practica1Application.class, args);

        JugadorService servicePlayer = context.getBean(JugadorService.class);
        servicePlayer.creaJugadores();

        EquipoService equipoService = context.getBean(EquipoService.class);
        equipoService.creaEquipos();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------------>>>>>>>>>>>>>>>>>>aplicació finalitzada<<<<<<<<<<<<<------------------");
    }
}