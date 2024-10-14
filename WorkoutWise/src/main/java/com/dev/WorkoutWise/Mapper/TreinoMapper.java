package com.dev.WorkoutWise.Mapper;


import com.dev.WorkoutWise.models.dto.TreinoDTO;
import com.dev.WorkoutWise.models.entities.Treino;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel="spring")
public interface TreinoMapper {


    @Mapping(source = "planoDeTreino.id", target = "planoDeTreinoId")
    TreinoDTO toTreinoDTO (Treino treino);

    Treino toTreinoEntity (TreinoDTO treinoDTO);

}
