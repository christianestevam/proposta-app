package com.br.gump.propostaapp.controller;

import com.br.gump.propostaapp.dto.PropostaRequestDTO;
import com.br.gump.propostaapp.dto.PropostaResponseDTO;
import com.br.gump.propostaapp.service.PropostaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/proposta")
public class PropostaController {

    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDTO> criar(@RequestBody PropostaRequestDTO requestDTO){
        PropostaResponseDTO response = propostaService.criar(requestDTO);
       return ResponseEntity.ok(response);
    }
}
