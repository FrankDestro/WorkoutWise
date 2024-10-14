package com.dev.WorkoutWise.services;

import com.dev.WorkoutWise.models.dto.TreinoExercicioDTO;
import com.dev.WorkoutWise.models.entities.Exercicio;
import com.dev.WorkoutWise.models.entities.Treino;
import com.dev.WorkoutWise.models.entities.TreinoExercicio;
import com.dev.WorkoutWise.repositories.ExercicioRepository;
import com.dev.WorkoutWise.repositories.TreinoExercicioRepository;
import com.dev.WorkoutWise.repositories.TreinoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class TreinoExercicioService {

    private final TreinoExercicioRepository treinoExercicioRepository;
    private final TreinoRepository treinoRepository;
    private final ExercicioRepository exercicioRepository;

    @Transactional
    public TreinoExercicioDTO associarTreinoExercicio(TreinoExercicioDTO treinoExercicioDTO) {

        if (treinoExercicioDTO.getExercicioId() == null) {
            throw new IllegalArgumentException("Exercicio ID não pode ser nulo.");
        }
        Exercicio exercicio = exercicioRepository.findById(treinoExercicioDTO.getExercicioId())
                .orElseThrow(() -> new EntityNotFoundException("Exercicio não encontrado"));

        if (treinoExercicioDTO.getTreinoId() == null) {
            throw new IllegalArgumentException("Treino ID não pode ser nulo.");
        }

        Treino treino = treinoRepository.findById(treinoExercicioDTO.getTreinoId())
                .orElseThrow(() -> new EntityNotFoundException("Treino não encontrado"));

        TreinoExercicio entity = new TreinoExercicio();
        entity.setExercicio(exercicio);
        entity.setTreino(treino);
        entity.setSeries(treinoExercicioDTO.getSeries());
        entity.setRepeticoes(treinoExercicioDTO.getRepeticoes());
        entity.setPeso(treinoExercicioDTO.getPeso());

        entity = treinoExercicioRepository.save(entity);

        return new TreinoExercicioDTO(entity);
    }
}
