package com.dev.WorkoutWise.controllers;


import com.dev.WorkoutWise.models.dto.CategoriaExercicioDTO;
import com.dev.WorkoutWise.services.CategoriaExercicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    private final CategoriaExercicioService categoriaExercicioService;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<CategoriaExercicioDTO> criarCategoria(@RequestBody CategoriaExercicioDTO categoriaExercicioDTO) {
        CategoriaExercicioDTO createdCategoriaExercicio = categoriaExercicioService.salvarCategoriaExercicio(categoriaExercicioDTO);
        return ResponseEntity.status(201).body(createdCategoriaExercicio);
    }
}
