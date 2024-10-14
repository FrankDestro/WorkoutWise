package com.dev.WorkoutWise.controllers;


import com.dev.WorkoutWise.models.dto.TreinoExercicioDTO;
import com.dev.WorkoutWise.services.TreinoExercicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/treinoExercicio")
@RequiredArgsConstructor
public class TreinoExercicioController {

    private final TreinoExercicioService treinoExercicioService;

    @PostMapping
    public ResponseEntity<TreinoExercicioDTO> associarTreinoExercicio(@RequestBody TreinoExercicioDTO treinoExercicioDTO) {
        treinoExercicioDTO = treinoExercicioService.associarTreinoExercicio(treinoExercicioDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(treinoExercicioDTO.getExercicioId()).toUri();
        return ResponseEntity.created(uri).body(treinoExercicioDTO);
    }
}
