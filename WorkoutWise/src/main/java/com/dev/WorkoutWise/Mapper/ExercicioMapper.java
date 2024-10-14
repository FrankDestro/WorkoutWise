package com.dev.WorkoutWise.Mapper;

import com.dev.WorkoutWise.models.dto.ExercicioDTO;
import com.dev.WorkoutWise.models.entities.CategoriaExercicio;
import com.dev.WorkoutWise.models.entities.Exercicio;
import com.dev.WorkoutWise.models.entities.GrupoMuscular;
import com.dev.WorkoutWise.repositories.CategoriaExercicioRepository;
import com.dev.WorkoutWise.repositories.GrupoMuscularRepository;
import jakarta.persistence.EntityNotFoundException;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel="spring")
public interface ExercicioMapper {

    ExercicioMapper INSTANCE = Mappers.getMapper(ExercicioMapper.class);

    @Mapping(source = "categoria.id", target = "categoriaId")
    @Mapping(source = "grupoMuscular.id", target = "grupoMuscularId")
    ExercicioDTO toDTO(Exercicio exercicio);

    @Mapping(target = "categoria", expression = "java(buscarCategoria(exercicioDTO.getCategoriaId(), categoriaExercicioRepository))")
    @Mapping(target = "grupoMuscular", expression = "java(buscarGrupoMuscular(exercicioDTO.getGrupoMuscularId(), grupoMuscularRepository))")
    Exercicio toEntity(ExercicioDTO exercicioDTO,
                       @Context CategoriaExercicioRepository categoriaExercicioRepository,
                       @Context GrupoMuscularRepository grupoMuscularRepository);


    default CategoriaExercicio buscarCategoria(Long categoriaId, @Context CategoriaExercicioRepository categoriaExercicioRepository) {
        return categoriaExercicioRepository.findById(categoriaId)
                .orElseThrow(() -> new EntityNotFoundException("Categoria não encontrada para o ID: " + categoriaId));
    }

    default GrupoMuscular buscarGrupoMuscular(Long grupoMuscularId, @Context GrupoMuscularRepository grupoMuscularRepository) {
        return grupoMuscularRepository.findById(grupoMuscularId)
                .orElseThrow(() -> new EntityNotFoundException("Grupo muscular não encontrado para o ID: " + grupoMuscularId));
    }



}
