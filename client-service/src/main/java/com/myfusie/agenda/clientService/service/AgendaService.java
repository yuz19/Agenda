package com.myfusie.agenda.clientService.service;

import com.myfusie.agenda.clientService.dto.AgendaRequestDTO;
import com.myfusie.agenda.clientService.dto.AgendaResponseDTO;
import com.myfusie.agenda.clientService.mapper.AgendaMapper;
import com.myfusie.agenda.clientService.model.Agenda;
import com.myfusie.agenda.clientService.repository.AgendaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgendaService {
    private AgendaRepository agendaRepository;

    public AgendaResponseDTO createAgenda(AgendaRequestDTO agendaRequestDTO){
        Agenda agenda=agendaRepository.save(AgendaMapper.toModel(agendaRequestDTO));

        return AgendaMapper.toDto(agenda);

    }
}
