package com.dev.WorkoutWise.models.entities;

import com.dev.WorkoutWise.models.entities.PK.TreinoExercicioPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "treino_exercicio")
public class TreinoExercicio {

    @EmbeddedId
    private TreinoExercicioPK id = new TreinoExercicioPK();

    private int repeticoes;
    private int series;
    private double peso;

    public TreinoExercicio() {
    }

    public TreinoExercicio(Treino treino, Exercicio exercicio, Integer repeticoes, Integer series, Double peso) {
        id.setTreino(treino);
        id.setExercicio(exercicio);
        this.repeticoes = repeticoes;
        this.series = series;
        this.peso = peso;
    }

    public Treino getTreino() {
        return id.getTreino();
    }

    public void setTreino(Treino treino) {
        id.setTreino(treino);
    }

    public Exercicio getExercicio() {
        return id.getExercicio();
    }

    public void setExercicio(Exercicio exercicio) {
        id.setExercicio(exercicio);
    }
}
