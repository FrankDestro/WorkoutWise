package com.dev.WorkoutWise.controllers;

import com.dev.WorkoutWise.models.dto.TreinoDTO;
import com.dev.WorkoutWise.services.TreinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/treino")
@RequiredArgsConstructor
public class TreinoController {

    private final TreinoService treinoService;

    @PostMapping(value = "/criar")
    public ResponseEntity<TreinoDTO> criarTreino(@RequestBody TreinoDTO treinoDTO) {
        TreinoDTO treino = treinoService.criarTreino(treinoDTO);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(treino.getId()).toUri();
        return ResponseEntity.created(uri).body(treino);
    }
}
