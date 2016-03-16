package com.ligaBaloncesto.Service;

import com.ligaBaloncesto.Repository.LigaRepository;
import com.ligaBaloncesto.Repository.TemporadaRepository;
import com.ligaBaloncesto.Model.Liga;
import com.ligaBaloncesto.Model.Temporada;
import com.ligaBaloncesto.Repository.LigaRepository;
import com.ligaBaloncesto.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;

    public void creaLiga(){
        Liga liga1 = new Liga();
        liga1.setNombre("Liga Basquet");
        ligaRepository.save(liga1);

        Temporada temporada1 = temporadaRepository.findByNombre("2015");
        Temporada temporada2 = temporadaRepository.findByNombre("2016");

        temporada1.setLiga(liga1);
        temporada2.setLiga(liga1);

        temporadaRepository.save(temporada1);
        temporadaRepository.save(temporada2);

    }
}
