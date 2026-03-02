package com.myfusie.agenda.clientService.dto;

import com.myfusie.agenda.clientService.dto.validators.CreateAgendaValidationGroup;
import com.myfusie.agenda.clientService.model.AgendaPage;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
@Data
public class AgendaRequestDTO {

    @NotBlank(message = "title is required")
    private String title;
    @NotBlank(message = "description is required")
    private String description;
    @NotNull(groups = CreateAgendaValidationGroup.class,message = "Creation Date is required")
    private LocalDate creationDate;

//    private List<AgendaPage> pages;
}
