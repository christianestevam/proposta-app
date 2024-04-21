package com.br.gump.propostaapp.repository;

import com.br.gump.propostaapp.entity.Proposta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta, Long>{

}
