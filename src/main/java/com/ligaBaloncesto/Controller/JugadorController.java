package com.ligaBaloncesto.Controller;

import com.ligaBaloncesto.Exception.JugadorException;
import com.ligaBaloncesto.Model.Jugador;
import com.ligaBaloncesto.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {
    @Autowired
    JugadorRepository jugadorRepository;

    //PER A CREAR EL RECURS --->>>>>POST<<<<<-----
    @RequestMapping(value="post", method = RequestMethod.POST)
    public Jugador save(@RequestBody Jugador jugador){
        return jugadorRepository.save(jugador) ;
    }

    //PER A LLEGIR EL RECURS SENCER --->>>>>GET<<<<<-----
    @RequestMapping(value="/findAll",method = RequestMethod.GET)
    public List<Jugador> findAll(){
        List<Jugador> jugadores = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();
        while (iterator.hasNext()){
            jugadores.add(iterator.next());
        }
        return jugadores;
    }

    //PER A LLEGIR EL RECURS per ID --->>>>>GET<<<<<-----
    @RequestMapping (value = "/{id}",method = RequestMethod.GET)
    public Jugador getOne(@PathVariable Long id) throws JugadorException {
        Jugador jugador1 = jugadorRepository.findOne(id);
        if(jugador1 == null){
            throw new JugadorException(id);
        }
        return jugador1;
    }

    //PER A EDITAR COMPLETAMENT EL RECURS --->>>>>PUT<<<<<-----
    @RequestMapping(value = "put/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id,@RequestBody Jugador jugador) throws JugadorException {
        if (jugadorRepository.findOne(id) == null){
            throw new JugadorException(id);
        }
        return jugadorRepository.save(jugador);
    }

    //PER A ESBORRAR EL RECURS --->>>>>DELETE<<<<<-----
    @RequestMapping(value="/{id}")
    public void deleteById(@PathVariable Long id) throws JugadorException {
        Jugador jugador = jugadorRepository.findOne(id);
        if(jugador == null){
            throw new JugadorException(id);
        }
        jugadorRepository.delete(id);
    }
}