package com.banco.bancofinanceiro.controller;

import com.banco.bancofinanceiro.model.ContaModel;
import com.banco.bancofinanceiro.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContaController {
    @Autowired
    private ContaService contaService;

    @GetMapping(path = "/bancofinanceiro")
    public ResponseEntity<List<ContaModel>> buscarConta() {
        return ResponseEntity.ok(contaService.buscarConta());
    }

    @GetMapping(path = "/bancofinanceiro/{codigo}")
    public ResponseEntity<Optional<ContaModel>> buscarId(@PathVariable Long codigo) {
        return ResponseEntity.ok(contaService.buscarId(codigo));
    }

    @PostMapping(path = "/bancofinanceiro")
    public ResponseEntity<ContaModel> cadastrar(@RequestBody ContaModel contaModel) {
        ContaModel conta = contaService.cadastrar(contaModel);
        return new ResponseEntity<>(conta, HttpStatus.CREATED);
    }

    @PutMapping(path = "/bancofinanceiro/{codigo}")
    public ResponseEntity<ContaModel> alterar(@RequestBody ContaModel conta) {
        return ResponseEntity.ok(contaService.alterar(conta));
    }

    @DeleteMapping(path = "/bancofinanceiro/{codigo}")
    public void deletar(@PathVariable Long codigo) {
        contaService.deletar(codigo);
    }

}
