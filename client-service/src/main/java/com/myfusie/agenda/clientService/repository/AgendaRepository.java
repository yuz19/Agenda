package com.myfusie.agenda.clientService.repository;

import com.myfusie.agenda.clientService.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda,Long>{
}
