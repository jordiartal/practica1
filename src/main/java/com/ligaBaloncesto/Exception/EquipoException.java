package com.ligaBaloncesto.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EquipoException extends Throwable {
    public EquipoException(Long id) {
        super("NO EXISTE EL EQUIPO CON ESTA ID: "+id);
    }
}
