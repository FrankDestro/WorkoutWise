package com.dev.WorkoutWise.models.dto;

import com.dev.WorkoutWise.models.entities.Treino;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreinoDTO {

    private Long id;
    private String nome;
    private Set<TreinoExercicioDTO> exercicios;
    private Long planoDeTreinoId;

    public TreinoDTO(Treino entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.exercicios = entity.getTreinoExercicios().stream()
                .map(TreinoExercicioDTO:: new)
                .collect(Collectors.toSet());
    }
}
