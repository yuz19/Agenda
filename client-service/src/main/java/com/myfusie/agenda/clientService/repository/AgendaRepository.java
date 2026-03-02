package com.myfusie.agenda.clientService.repository;

import com.myfusie.agenda.clientService.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgendaRepository extends JpaRepository<Agenda, UUID>{
}
