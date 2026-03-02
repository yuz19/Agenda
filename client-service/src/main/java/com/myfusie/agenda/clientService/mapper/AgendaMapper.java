package com.myfusie.agenda.clientService.mapper;

import com.myfusie.agenda.clientService.dto.AgendaPageResponseDTO;
import com.myfusie.agenda.clientService.dto.AgendaRequestDTO;
import com.myfusie.agenda.clientService.dto.AgendaResponseDTO;
import com.myfusie.agenda.clientService.model.Agenda;

import javax.validation.constraints.NotNull;

public class AgendaMapper {
    public static AgendaResponseDTO toDto(Agenda agenda){
        AgendaResponseDTO agendaResponseDTO=new AgendaResponseDTO();
//        @NotNull
//        private String title;
//        @NotNull
//        private String description;
//        @NotNull
//        private String creationDate;
        agendaResponseDTO.setTitle(agenda.getTitle());
        agendaResponseDTO.setDescription(agenda.getDescription());

//        agendaResponseDTO.setPages(agenda.getPages());
        return  agendaResponseDTO;
    }
    public static Agenda toModel(AgendaRequestDTO agendaRequestDTO){
        Agenda agenda=new Agenda();
//        @NotNull
//        private String title;
//        @NotNull
//        private String description;
//        @NotNull
//        private String creationDate;
        agenda.setTitle(agendaRequestDTO.getTitle());
        agenda.setDescription(agendaRequestDTO.getDescription());
        agenda.setCreationDate(agendaRequestDTO.getCreationDate());
//        agendaResponseDTO.setPages(agenda.getPages());
        return  agenda;
    }
}
