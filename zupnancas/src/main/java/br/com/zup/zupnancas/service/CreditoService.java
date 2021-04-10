package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.dto.CategoriaDTO;
import br.com.zup.zupnancas.model.Credito;
import br.com.zup.zupnancas.repository.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CreditoService {

    @Autowired
    private CreditoRepository creditoRepository;

    public Credito cadastrarCredito(Credito credito){
        return creditoRepository.save(credito);
    }

    public Credito pesquisarTodosCreditos (int id){
        Optional<Credito> optionalCredito = creditoRepository.findById(id);

        if (optionalCredito.isPresent()) {
            return optionalCredito.get();
        }
        throw new RuntimeException("Album não encontrado");
    }

        public Iterable<Credito> pesquisarCreditosPelaCategorias(CategoriaDTO credito){
            if(credito.getNome() == null){
                return creditoRepository.findAll();
            }
            return creditoRepository.findAllByCategoriasNome(credito.getNome());
        }
}