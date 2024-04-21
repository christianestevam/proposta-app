package com.br.gump.propostaapp.service;

import com.br.gump.propostaapp.dto.PropostaRequestDTO;
import com.br.gump.propostaapp.dto.PropostaResponseDTO;
import com.br.gump.propostaapp.entity.Proposta;
import org.springframework.stereotype.Service;
import com.br.gump.propostaapp.repository.PropostaRepository;


@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaService(PropostaRepository propostaRepository) {
        this.propostaRepository = propostaRepository;
    }

    public PropostaResponseDTO criar(PropostaRequestDTO requestDTO){
        propostaRepository.save(new Proposta());
        return null;
    }

}
