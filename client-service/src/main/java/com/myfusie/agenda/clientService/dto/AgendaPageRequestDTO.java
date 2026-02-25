package com.myfusie.agenda.clientService.dto;

import com.myfusie.agenda.clientService.dto.validators.CreateAgendaPageValidationGroup;
import com.myfusie.agenda.clientService.dto.validators.CreateAgendaValidationGroup;
import com.myfusie.agenda.clientService.model.Agenda;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;
@Data
public class AgendaPageRequestDTO {

    @NotBlank(message = "title is required")
    private String title;
    @NotBlank(message = "content is required")
    private String content;
    @NotBlank(groups = CreateAgendaPageValidationGroup.class,message = "Agenda parent is required")
    private Agenda agenda;
}
