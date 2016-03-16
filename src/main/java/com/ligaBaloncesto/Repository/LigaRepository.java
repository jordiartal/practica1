package com.ligaBaloncesto.Repository;

import com.ligaBaloncesto.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigaRepository extends PagingAndSortingRepository <Liga,Long>{
    Liga findByNombre(String liga1);
}
