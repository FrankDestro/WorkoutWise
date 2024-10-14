package com.dev.WorkoutWise.Mapper;

import com.dev.WorkoutWise.models.dto.CategoriaExercicioDTO;
import com.dev.WorkoutWise.models.entities.CategoriaExercicio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel="spring")
public interface CategoriaExercicioMapper {

    CategoriaExercicioMapper INSTANCE = Mappers.getMapper(CategoriaExercicioMapper.class);

    CategoriaExercicioDTO toDTO (CategoriaExercicio categoriaExercicio);

    CategoriaExercicio toEntity (CategoriaExercicioDTO categoriaExercicioDTO);

}
