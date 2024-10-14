package com.dev.WorkoutWise.repositories;

import com.dev.WorkoutWise.models.entities.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {


}
