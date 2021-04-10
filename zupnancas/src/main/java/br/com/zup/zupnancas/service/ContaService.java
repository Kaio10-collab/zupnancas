package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.Enum.Status;
import br.com.zup.zupnancas.dto.ContaDTO;
import br.com.zup.zupnancas.model.Conta;
import br.com.zup.zupnancas.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private SaldoService saldoService;

    public Conta cadastrarConta(Conta conta){
        return contaRepository.save(conta);
    }

    public Conta atualizarConta(Conta conta){
        if (contaRepository.existsById(conta.getId())){
           Conta objConta = cadastrarConta(conta);
           return objConta;
        }
       throw new RuntimeException("Conta não localizada!");
   }

    public Iterable<Conta> pesquisarContasPorStatus(ContaDTO status){
        if(status.getStatus() == null){
            return contaRepository.findAll();
        }
        return contaRepository.findByAllStatus(status.getStatus());
    }

    public Conta adicionarSaldo(Conta conta){
        if(conta.getStatusEnum().equals((Status.PAGO))){
            saldoService.debitarSaldo(conta);
            contaRepository.save(conta);
        }
        return contaRepository.save(conta);
    }
}