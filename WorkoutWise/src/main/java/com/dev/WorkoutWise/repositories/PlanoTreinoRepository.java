package com.dev.WorkoutWise.repositories;

import com.dev.WorkoutWise.models.entities.PlanoTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoTreinoRepository extends JpaRepository<PlanoTreino, Long> {


}
