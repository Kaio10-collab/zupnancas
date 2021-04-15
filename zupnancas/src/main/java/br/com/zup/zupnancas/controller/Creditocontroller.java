package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.model.Credito;
import br.com.zup.zupnancas.service.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("creditos/")
public class Creditocontroller {

    @Autowired
    private CreditoService creditoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Credito cadastrarCredito(@RequestBody Credito credito){
        return creditoService.cadastrarCredito(credito);
    }

    @GetMapping
    public Iterable<Credito> pesquisaTodosOsCreditos(){
        return creditoService.pesquisarTodosCreditos();
    }
}