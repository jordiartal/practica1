package com.ligaBaloncesto.Service;

import com.ligaBaloncesto.Model.Equipo;
import com.ligaBaloncesto.Model.Temporada;
import com.ligaBaloncesto.Repository.EquipoRepository;
import com.ligaBaloncesto.Repository.LigaRepository;
import com.ligaBaloncesto.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;


@Service
public class TemporadaService {
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private EquipoRepository equipoRepository;
    //PER A LA DATA
    Calendar cal=Calendar.getInstance();

    public void creaTemporadas(){
        //CREACIO TEMPORADES
        Temporada temporada1 = new Temporada();
        temporada1.setNombre("2015");
            cal.set(2015,Calendar.SEPTEMBER,1);
        temporada1.setFecha(cal.getTime());
        temporadaRepository.save(temporada1);

        Temporada temporada2 = new Temporada();
        temporada2.setNombre("2016");
            cal.set(2014,Calendar.SEPTEMBER,1);
        temporada2.setFecha(cal.getTime());
        temporadaRepository.save(temporada2);



        //ASSIGNACIO TEMPORADES-EQUIPS
        temporada1.getEquipos().add(equipoRepository.findByNombre("equipo1"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("equipo2"));
        temporada1.getEquipos().add(equipoRepository.findByNombre("equipo3"));
        temporadaRepository.save(temporada1);

        temporada2.getEquipos().add(equipoRepository.findByNombre("equipo4"));
        temporada2.getEquipos().add(equipoRepository.findByNombre("equipo5"));
        temporadaRepository.save(temporada2);



    }
}
