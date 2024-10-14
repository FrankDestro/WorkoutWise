package com.dev.WorkoutWise.services;

import com.dev.WorkoutWise.Mapper.PlanoTreinoMapper;
import com.dev.WorkoutWise.models.dto.PlanoTreinoDTO;
import com.dev.WorkoutWise.models.entities.PlanoTreino;
import com.dev.WorkoutWise.models.entities.Usuario;
import com.dev.WorkoutWise.repositories.PlanoTreinoRepository;
import com.dev.WorkoutWise.repositories.UsuarioRepository;
import com.dev.WorkoutWise.services.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PlanoTreinoService {

    private final PlanoTreinoRepository planoTreinoRepository;
    private final PlanoTreinoMapper planoTreinoMapper;
    private final UsuarioRepository usuarioRepository;

    @Transactional(readOnly = true)
    public PlanoTreinoDTO getPlanoById (Long id) {
        PlanoTreino planoTreino = planoTreinoRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Plano de treino não encontrado"));
        return new PlanoTreinoDTO(planoTreino);

    }

    public PlanoTreinoDTO salvarPlanoTreino(PlanoTreinoDTO planoTreinoDTO) {
        PlanoTreino planoTreino = planoTreinoMapper.toPlanoTreinoEntity(planoTreinoDTO);
        Usuario usuario = usuarioRepository.findById(planoTreinoDTO.getUsuarioId())
                .orElseThrow(() -> new ResourceNotFoundException("id not found"));
        planoTreino.setUsuario(usuario);
        planoTreino = planoTreinoRepository.save(planoTreino);
        return planoTreinoMapper.toPlanoTreinoDTO(planoTreino);
    }
}
