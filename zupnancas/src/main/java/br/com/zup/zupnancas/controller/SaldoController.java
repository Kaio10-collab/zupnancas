package br.com.zup.zupnancas.controller;

import br.com.zup.zupnancas.model.Saldo;
import br.com.zup.zupnancas.service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saldos/")
public class SaldoController {

    @Autowired
    private SaldoService saldoService;

    @PostMapping
    public Saldo incluirSaldo(Saldo saldo){
        return saldoService.cadastrarSaldo(saldo);
    }

    @GetMapping
    public Saldo pesquisarSaldoPorCpf(Saldo saldo) {
        try {
            return saldoService.visualizarSaldoPorCPF(saldo);
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF não encontrado");
        }
    }
}
