package com.dev.WorkoutWise.models.dto;

import com.dev.WorkoutWise.models.entities.TreinoExercicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreinoExercicioDTO {

    private Long treinoId;
    private Long exercicioId;
    private int repeticoes;
    private String nomeExercicio;
    private int series;
    private double peso;

    public TreinoExercicioDTO(TreinoExercicio treinoExercicio) {
        this.treinoId = treinoExercicio.getTreino().getId();
        this.exercicioId = treinoExercicio.getExercicio().getId();
        this.nomeExercicio = treinoExercicio.getExercicio().getNome();
        this.repeticoes = treinoExercicio.getRepeticoes();
        this.series = treinoExercicio.getSeries();
    }
}
