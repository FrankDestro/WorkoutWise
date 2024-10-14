package com.dev.WorkoutWise.services;


import com.dev.WorkoutWise.Mapper.CategoriaExercicioMapper;
import com.dev.WorkoutWise.models.dto.CategoriaExercicioDTO;
import com.dev.WorkoutWise.models.entities.CategoriaExercicio;
import com.dev.WorkoutWise.repositories.CategoriaExercicioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CategoriaExercicioService {

    private final CategoriaExercicioRepository categoriaExercicioRepository;

    public CategoriaExercicioDTO salvarCategoriaExercicio(CategoriaExercicioDTO categoriaExercicioDTO) {
        CategoriaExercicio categoriaExercicio = CategoriaExercicioMapper.INSTANCE.toEntity(categoriaExercicioDTO);
        categoriaExercicio = categoriaExercicioRepository.save(categoriaExercicio);
        return CategoriaExercicioMapper.INSTANCE.toDTO(categoriaExercicio);
    }
}
