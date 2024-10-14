package com.dev.WorkoutWise.models.dto;


import com.dev.WorkoutWise.models.entities.PlanoTreino;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanoTreinoDTO {

    private Long id;
    private String nome;
    private Set<TreinoDTO> treinos;
    private Long usuarioId;

    public PlanoTreinoDTO(PlanoTreino entity) {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.usuarioId = entity.getUsuario().getId();
        this.treinos = entity.getTreinos().stream()
                .map(TreinoDTO::new)
                .collect(Collectors.toSet());
    }
}
