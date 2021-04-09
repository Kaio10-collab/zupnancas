package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.dto.FiltroCategoriaDTO;
import br.com.zup.zupnancas.model.Conta;
import br.com.zup.zupnancas.model.Saldo;
import br.com.zup.zupnancas.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;

    public Saldo cadastrarSaldo(Saldo saldo){
        return saldoRepository.save(saldo);
    }

    public Iterable<Saldo> visualizarSaldo(FiltroCategoriaDTO saldo){
            if(saldo.getCpf() == null){
                return saldoRepository.findAll();
            }
            return saldoRepository.findByCPF(saldo.getCpf());
        }

        public void debitarSaldo(Conta conta){
        Optional<Saldo> optionalSaldo = saldoRepository.findById(conta.getSaldo().getCpf());
        Saldo saldoSalvo = optionalSaldo.get();
        Double atualizaConta = saldoSalvo.getValor() + saldoSalvo.getLimite();

        if(atualizaConta > conta.getValor()){
            double valorAtualizado = saldoSalvo.getValor() - atualizaConta;

            saldoSalvo.setValor(valorAtualizado);
            saldoRepository.save(saldoSalvo);
        }

    }
}