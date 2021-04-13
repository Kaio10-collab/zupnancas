package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.model.Conta;
import br.com.zup.zupnancas.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("contas/")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @PutMapping
    public Conta atualizarConta(Conta conta) {
        try {
            return contaService.atualizarConta(conta);
        } catch (RuntimeException e) {
            throw new RuntimeException("Saldo não encontrado");
        }
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Conta> pesquisarStatus(Conta conta){
        return contaService.pesquisarContasPorStatus(conta);
    }
}
