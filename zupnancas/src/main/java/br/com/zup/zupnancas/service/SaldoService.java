package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.dto.FiltroCategoriaDTO;
import br.com.zup.zupnancas.model.Saldo;
import br.com.zup.zupnancas.repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            return saldoRepository.findByNome(saldo.getCpf());
        }
}