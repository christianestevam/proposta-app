package com.br.gump.propostaapp.mapper;

import com.br.gump.propostaapp.dto.PropostaRequestDTO;
import com.br.gump.propostaapp.entity.Proposta;
import org.mapstruct.Mapper;

@Mapper
public interface PropostaMapper {

    Proposta convertDtoToProposta(PropostaRequestDTO propostaRequestDTO);
}
