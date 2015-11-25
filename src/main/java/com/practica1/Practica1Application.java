package com.practica1;

import com.practica1.Service.JugadorService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Practica1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Practica1Application.class, args);
        JugadorService servicePlayer = context.getBean(JugadorService.class);
        servicePlayer.creaPlayer();
    }
}
