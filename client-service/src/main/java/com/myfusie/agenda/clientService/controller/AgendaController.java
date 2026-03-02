package com.myfusie.agenda.clientService.controller;

import com.myfusie.agenda.clientService.dto.AgendaPageResponseDTO;
import com.myfusie.agenda.clientService.dto.AgendaRequestDTO;
import com.myfusie.agenda.clientService.dto.AgendaResponseDTO;
import com.myfusie.agenda.clientService.dto.validators.CreateAgendaValidationGroup;
import com.myfusie.agenda.clientService.service.AgendaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.groups.Default;
import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
@RequestMapping("/api/v1/Agenda")
public class AgendaController {

    private final AgendaService agendaService;

    @PostMapping
    public ResponseEntity<AgendaResponseDTO> createAgenda(

           @Validated({Default.class, CreateAgendaValidationGroup.class}) @RequestBody AgendaRequestDTO agendaRequestDTO
    ){
        AgendaResponseDTO agendaResponseDTO=agendaService.createAgenda(agendaRequestDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(agendaResponseDTO);
    }

    @GetMapping
    public ResponseEntity<List<AgendaResponseDTO>> getAgendas(){
        List<AgendaResponseDTO> agendaResponseDTO=agendaService.getAgenda();

        return ResponseEntity.ok().body(agendaResponseDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgendaResponseDTO> updateAgenda(
            @PathVariable UUID id,
            @Validated({Default.class}) @RequestBody AgendaRequestDTO agendaRequestDTO
    ){
        AgendaResponseDTO agendaResponseDTO=agendaService.updateAgenda(id, agendaRequestDTO);

        return ResponseEntity.ok().body(agendaResponseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgenda(
            @PathVariable UUID id){
        agendaService.deleteAgenda(id);
        return ResponseEntity.noContent().build();
    }

}
