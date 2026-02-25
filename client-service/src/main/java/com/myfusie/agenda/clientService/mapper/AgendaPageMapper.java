package com.myfusie.agenda.clientService.mapper;

import com.myfusie.agenda.clientService.dto.AgendaPageRequestDTO;
import com.myfusie.agenda.clientService.dto.AgendaPageResponseDTO;
import com.myfusie.agenda.clientService.dto.AgendaResponseDTO;
import com.myfusie.agenda.clientService.model.Agenda;
import com.myfusie.agenda.clientService.model.AgendaPage;

public class AgendaPageMapper {
    public static AgendaPageResponseDTO toDto(AgendaPage agendaPage){
        AgendaPageResponseDTO agendapageResponseDTO=new AgendaPageResponseDTO();

        agendapageResponseDTO.setTitle(agendaPage.getTitle());
        agendapageResponseDTO.setContent(agendaPage.getContent());

        return  agendapageResponseDTO;
    }
    public static AgendaPage toModel(AgendaPageRequestDTO agendaPageRequestDTO){
        AgendaPage agendaPage1=new AgendaPage();

        agendaPage1.setTitle(agendaPageRequestDTO.getTitle());
        agendaPage1.setContent(agendaPageRequestDTO.getContent());

        return  agendaPage1;
    }
}
