package com.dev.WorkoutWise.controllers;

import com.dev.WorkoutWise.models.dto.PlanoTreinoDTO;
import com.dev.WorkoutWise.services.PlanoTreinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/planoTreino")
public class PlanoTreinoController {

    private final PlanoTreinoService planoTreinoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PlanoTreinoDTO> getPlanoTreinoById (@PathVariable Long id) {
        PlanoTreinoDTO PlanotreinoDTO = planoTreinoService.getPlanoById(id);
        return ResponseEntity.ok().body(PlanotreinoDTO);
    }

    @PostMapping
    public ResponseEntity<PlanoTreinoDTO> criarPlanoTreino(@RequestBody PlanoTreinoDTO planoTreinoDTO) {
        PlanoTreinoDTO createdPlanoTreino = planoTreinoService.salvarPlanoTreino(planoTreinoDTO);
        return ResponseEntity.status(201).body(createdPlanoTreino);
    }
}