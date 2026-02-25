package com.myfusie.agenda.clientService.dto;

import lombok.Data;

import java.util.List;

@Data
public class AgendaResponseDTO {
    private Long id;

    private String title;
    private String description;
    private List<AgendaPageResponseDTO> pages;

}
