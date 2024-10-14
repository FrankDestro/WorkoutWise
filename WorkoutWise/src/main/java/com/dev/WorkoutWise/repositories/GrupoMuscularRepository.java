package com.dev.WorkoutWise.repositories;

import com.dev.WorkoutWise.models.entities.GrupoMuscular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoMuscularRepository extends JpaRepository<GrupoMuscular, Long> {


}
