package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.dto.CategoriaDTO;
import br.com.zup.zupnancas.model.Credito;
import br.com.zup.zupnancas.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    public Credito cadastrarCredito(Credito credito){
        return creditoRepository.save(credito);
    }

    public Iterable<Credito> pesquisarTodosCreditos(){
        return creditoRepository.findAll();

    }

        public Iterable<Credito> pesquisarCreditosPelaCategorias(CategoriaDTO credito){
            if(credito.getNome() == null){
                return creditoRepository.findAll();
            }
            return creditoRepository.findAllByCategoriasNome(credito.getNome());
        }
}