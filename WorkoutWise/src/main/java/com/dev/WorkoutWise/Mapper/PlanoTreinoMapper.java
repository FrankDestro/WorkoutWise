package com.dev.WorkoutWise.Mapper;

import com.dev.WorkoutWise.models.dto.PlanoTreinoDTO;
import com.dev.WorkoutWise.models.entities.PlanoTreino;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel="spring")
public interface PlanoTreinoMapper {

    @Mapping(source = "usuario.id", target = "usuarioId")
    PlanoTreinoDTO toPlanoTreinoDTO (PlanoTreino planoTreino);

    PlanoTreino toPlanoTreinoEntity (PlanoTreinoDTO planoTreinoDTO);
}
