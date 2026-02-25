package com.myfusie.agenda.clientService.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
@Entity
@Data
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String creationDate;
//    @JsonManagedReference
    @OneToMany(mappedBy = "agenda",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<AgendaPage> pages;
}
