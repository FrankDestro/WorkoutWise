package com.dev.WorkoutWise.repositories;

import com.dev.WorkoutWise.models.entities.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {

    List<Exercicio> findByNomeContaining(String nome);

}
