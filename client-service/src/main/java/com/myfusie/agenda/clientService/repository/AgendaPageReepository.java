package com.myfusie.agenda.clientService.repository;

import com.myfusie.agenda.clientService.model.AgendaPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgendaPageReepository extends JpaRepository<AgendaPage, UUID> {
}
