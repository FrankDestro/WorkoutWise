package com.dev.WorkoutWise.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class ExercicioDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Long categoriaId;
    private Long grupoMuscularId;

}
