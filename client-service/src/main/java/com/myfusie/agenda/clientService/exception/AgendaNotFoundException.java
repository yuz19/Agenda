package com.myfusie.agenda.clientService.exception;

public class AgendaNotFoundException extends RuntimeException {
    public AgendaNotFoundException(String message) {
        super(message);
    }
}
