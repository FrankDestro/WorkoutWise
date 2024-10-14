package com.dev.WorkoutWise.Mapper;

import com.dev.WorkoutWise.models.dto.TreinoExercicioDTO;
import com.dev.WorkoutWise.models.entities.TreinoExercicio;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface TreinoExercicioMapper {

    @Mapping(source = "id.treino.id", target = "treinoId")
    @Mapping(source = "id.exercicio.id", target = "exercicioId")
    @Mapping(source = "id.exercicio.nome", target = "nomeExercicio")
    TreinoExercicioDTO toTreinoExercicioDTO (TreinoExercicio treinoExercicio);

    TreinoExercicio toTreinoExercicioEntity (TreinoExercicioDTO treinoExercicioDTO);
}
