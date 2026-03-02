package com.myfusie.agenda.clientService.service;

import com.myfusie.agenda.clientService.dto.AgendaRequestDTO;
import com.myfusie.agenda.clientService.dto.AgendaResponseDTO;
import com.myfusie.agenda.clientService.exception.AgendaNotFoundException;
import com.myfusie.agenda.clientService.mapper.AgendaMapper;
import com.myfusie.agenda.clientService.model.Agenda;
import com.myfusie.agenda.clientService.repository.AgendaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AgendaService {
    private AgendaRepository agendaRepository;

    public AgendaResponseDTO createAgenda(AgendaRequestDTO agendaRequestDTO){
        Agenda agenda=agendaRepository.save(AgendaMapper.toModel(agendaRequestDTO));

        return AgendaMapper.toDto(agenda);

    }

    public List<AgendaResponseDTO> getAgenda(){
        List<Agenda> agendas=agendaRepository.findAll();
//        List<AgendaResponseDTO> agendaResponseDTOS=agendas.stream().map(AgendaMapper::toDto).toList();

        return agendas.stream().map(AgendaMapper::toDto).toList();
    }

    public AgendaResponseDTO updateAgenda(UUID id, AgendaRequestDTO agendaRequestDTO){
        Agenda agenda=agendaRepository.findById(id).orElseThrow(()->new AgendaNotFoundException("Agenda not found : "+ id));

        agenda.setTitle(agendaRequestDTO.getTitle());
        agenda.setDescription(agendaRequestDTO.getDescription());

        return AgendaMapper.toDto(agendaRepository.save(agenda));
    }

    public void deleteAgenda(UUID id){
        agendaRepository.deleteById(id);

    }
}
