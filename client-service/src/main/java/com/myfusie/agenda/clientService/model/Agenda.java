package com.myfusie.agenda.clientService.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private LocalDate creationDate;
//    @JsonManagedReference
    @OneToMany(mappedBy = "agenda",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<AgendaPage> pages;
}
