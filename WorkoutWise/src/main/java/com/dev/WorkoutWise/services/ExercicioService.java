package com.dev.WorkoutWise.services;

import com.dev.WorkoutWise.Mapper.ExercicioMapper;
import com.dev.WorkoutWise.models.dto.ExercicioDTO;
import com.dev.WorkoutWise.models.entities.Exercicio;
import com.dev.WorkoutWise.repositories.CategoriaExercicioRepository;
import com.dev.WorkoutWise.repositories.ExercicioRepository;
import com.dev.WorkoutWise.repositories.GrupoMuscularRepository;
import com.dev.WorkoutWise.services.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ExercicioService {

    private final ExercicioRepository exercicioRepository;
    private final CategoriaExercicioRepository categoriaExercicioRepository;
    private final GrupoMuscularRepository grupoMuscularRepository;

    public ExercicioDTO buscarExercicioPorId(Long id) {
        Exercicio exercicio = exercicioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Exercício não encontrado"));
        return ExercicioMapper.INSTANCE.toDTO(exercicio);
    }

    public ExercicioDTO salvarExercicio(ExercicioDTO exercicioDTO) {
        Exercicio exercicio = ExercicioMapper.INSTANCE.toEntity(exercicioDTO, categoriaExercicioRepository, grupoMuscularRepository);
        exercicio = exercicioRepository.save(exercicio);
        return ExercicioMapper.INSTANCE.toDTO(exercicio);
    }

    public List<Exercicio> buscarExerciciosPorNome(String nome) {
        return exercicioRepository.findByNomeContaining(nome);
    }
}
