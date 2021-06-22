package br.com.zupacademy.natalia.transacao.controller;

import br.com.zupacademy.natalia.transacao.entities.CartaoEntity;
import br.com.zupacademy.natalia.transacao.entities.TransacaoEntity;
import br.com.zupacademy.natalia.transacao.repositories.CartaoRepository;
import br.com.zupacademy.natalia.transacao.repositories.TransacoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TransacoesCartaoController {

    @Autowired
    TransacoesRepository transacoesRepository;

    @Autowired
    CartaoRepository cartaoRepository;

    @GetMapping("/cartoes/{id}/transacoes")
    public ResponseEntity<?> transacoes(@PathVariable String id, @PageableDefault(page = 0, size = 10)
            Pageable paginacao) {
        Optional<CartaoEntity> encontrandoCartao = cartaoRepository.findById(id);
        if (encontrandoCartao.isPresent()) {
            Page<TransacaoEntity> transacaoEntities = transacoesRepository.findAll(paginacao);
            return ResponseEntity.ok().body(transacaoEntities);
        }
        return ResponseEntity.badRequest().body("Cartão não encontrado");
    }

}
