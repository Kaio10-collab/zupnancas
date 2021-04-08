package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.Enum.Status;
import br.com.zup.zupnancas.dto.FiltroContaDTO;
import br.com.zup.zupnancas.model.Conta;
import br.com.zup.zupnancas.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public Conta cadastrarConta(Conta conta){
        return contaRepository.save(conta);
    }

    public Conta atualizarConta(Conta conta){
        Conta objconta = new Conta();

        return objconta;
        }

    public Iterable<Conta> pesquisarContasPorStatus(FiltroContaDTO status){
        if(status.getStatus() == null){
            return contaRepository.findAll();
        }
        return contaRepository.findByAllStatus(status.getStatus());
    }
}
