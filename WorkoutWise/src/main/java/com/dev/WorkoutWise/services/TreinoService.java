package com.dev.WorkoutWise.services;

import com.dev.WorkoutWise.Mapper.TreinoMapper;
import com.dev.WorkoutWise.models.dto.TreinoDTO;
import com.dev.WorkoutWise.models.entities.PlanoTreino;
import com.dev.WorkoutWise.models.entities.Treino;
import com.dev.WorkoutWise.repositories.PlanoTreinoRepository;
import com.dev.WorkoutWise.repositories.TreinoRepository;
import com.dev.WorkoutWise.services.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class TreinoService {

    private final TreinoRepository treinoRepository;
    private final TreinoMapper treinoMapper;
    private final PlanoTreinoRepository planoTreinoRepository;

    @Transactional
    public TreinoDTO criarTreino(TreinoDTO treinoDTO) {
        Treino treino = treinoMapper.toTreinoEntity(treinoDTO);
        PlanoTreino planoTreino = planoTreinoRepository.findById(treinoDTO.getPlanoDeTreinoId())
                .orElseThrow(() -> new ResourceNotFoundException("id not found"));
        treino.setPlanoDeTreino(planoTreino);
        treino = treinoRepository.save(treino);
        return treinoMapper.toTreinoDTO(treino) ;
    }
}
