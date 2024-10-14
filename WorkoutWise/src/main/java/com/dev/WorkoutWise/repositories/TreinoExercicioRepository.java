package com.dev.WorkoutWise.repositories;

import com.dev.WorkoutWise.models.entities.TreinoExercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoExercicioRepository extends JpaRepository<TreinoExercicio, Long> {


}
