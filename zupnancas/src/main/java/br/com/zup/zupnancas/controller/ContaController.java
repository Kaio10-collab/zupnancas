package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.Enum.StatusEnum;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conta cadastroConta(@RequestBody Conta conta){
        return contaService.cadastrarConta(conta);
    }

    @PutMapping("{id}/")
    public Conta atualizarConta(@PathVariable Integer id, @RequestBody Conta conta) {
        try {
            return contaService.atualizarConta(id, conta);
        } catch (RuntimeException e) {
            throw new RuntimeException("Saldo não encontrado");
        }
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Conta> pesquisarStatus(StatusEnum conta){
        return contaService.pesquisarContasPorStatus(conta);
    }
}
