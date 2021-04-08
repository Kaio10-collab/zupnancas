package br.com.zup.zupnancas.service;

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
}
