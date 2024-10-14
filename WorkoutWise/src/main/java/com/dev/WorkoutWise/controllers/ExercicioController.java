package com.dev.WorkoutWise.controllers;

import com.dev.WorkoutWise.models.dto.ExercicioDTO;
import com.dev.WorkoutWise.models.entities.Exercicio;
import com.dev.WorkoutWise.services.ExercicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/exercicio")
public class ExercicioController {

    private final ExercicioService exercicioService;

    @GetMapping("/{id}")
    public ResponseEntity<ExercicioDTO> buscarExercicioPorId(@PathVariable Long id) {
        ExercicioDTO exercicioDTO = exercicioService.buscarExercicioPorId(id);
        return ResponseEntity.ok(exercicioDTO);
    }

    @PostMapping
    public ResponseEntity<ExercicioDTO> criarExercicio(@RequestBody ExercicioDTO exercicioDTO) {
        ExercicioDTO createdExercicio = exercicioService.salvarExercicio(exercicioDTO);
        return ResponseEntity.status(201).body(createdExercicio);
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Exercicio>> buscarExerciciosPorNome(@RequestParam String nome) {
        List<Exercicio> exercicios = exercicioService.buscarExerciciosPorNome(nome);
        return ResponseEntity.ok(exercicios);
    }
}
