package com.dev.WorkoutWise.repositories;

import com.dev.WorkoutWise.models.entities.CategoriaExercicio;
import com.dev.WorkoutWise.models.entities.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaExercicioRepository extends JpaRepository<CategoriaExercicio, Long> {


}
