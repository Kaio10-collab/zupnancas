package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.model.Saldo;
import br.com.zup.zupnancas.service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("saldos/")
public class SaldoController {

    @Autowired
    private SaldoService saldoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Saldo incluirSaldo(Saldo saldo){
        return saldoService.cadastrarSaldo(saldo);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Saldo> pesquisarSaldo() {
            return saldoService.visualizarTodosOsSaldos();
    }
}