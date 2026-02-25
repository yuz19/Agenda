package com.myfusie.agenda.clientService.dto;

import com.myfusie.agenda.clientService.dto.validators.CreateAgendaValidationGroup;
import com.myfusie.agenda.clientService.model.AgendaPage;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;
@Data
public class AgendaRequestDTO {

    @NotBlank(message = "title is required")
    private String title;
    @NotBlank(message = "description is required")
    private String description;
    @NotBlank(groups = CreateAgendaValidationGroup.class,message = "Creation Date is required")
    private String creationDate;

    private List<AgendaPage> pages;
}
