package com.ligaBaloncesto.Controller;


import com.ligaBaloncesto.Exception.EquipoException;
import com.ligaBaloncesto.Model.Equipo;
import com.ligaBaloncesto.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/equipos")
public class EquipoController {
    @Autowired
    private EquipoRepository equipoRepository;

    //PER A CREAR EL RECURS --->>>>>POST<<<<<-----
    @RequestMapping(value="/save", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo save(@RequestBody Equipo equipo){
        return equipoRepository.save(equipo);
    }

    //PER A LLEGIR EL RECURS --->>>>>GET<<<<<-----
    @RequestMapping(value="/findAll",method = RequestMethod.GET)
    public List<Equipo> findAll(){
        List<Equipo> equipos = new ArrayList<>();
        Iterator<Equipo> it = equipoRepository.findAll().iterator();
        while(it.hasNext()){
            equipos.add(it.next());
        }
        return equipos;
    }

    //PER A EDITAR COMPLETAMENT EL RECURS --->>>>>PUT<<<<<-----
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Equipo updateById(@PathVariable Long id, @RequestBody Equipo equipo) throws EquipoException {
        Equipo equipo1 = equipoRepository.findOne(id);
        if(equipo1 == null){
            throw new EquipoException(id);
        }
        return equipoRepository.save(equipo);
    }

    //PER A ESBORRAR EL RECURS --->>>>>DELETE<<<<<-----
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) throws EquipoException {
        Equipo equipo = equipoRepository.findOne(id);
        if(equipo == null){
            throw new EquipoException(id);
        }
        equipoRepository.delete(id);
    }
}
