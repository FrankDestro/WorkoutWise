package com.dev.WorkoutWise.models.dto;

import com.dev.WorkoutWise.models.entities.PlanoTreino;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private Set<PlanoTreino> planosTreino = new HashSet<>();

}
