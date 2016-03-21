package com.ligaBaloncesto.Exception;

/**
 * Created by usuario on 21/3/2016.
 */
public class JugadorException extends Throwable {
    public JugadorException(Long id) {
        super("NO EXISTE EL JUGADOR CON ESTA ID: "+id);
    }
}
