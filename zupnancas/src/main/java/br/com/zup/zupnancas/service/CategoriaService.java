package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.model.Categoria;
import br.com.zup.zupnancas.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria(Categoria categoria){
        Categoria objCategoria = categoriaRepository.save(categoria);
        return  objCategoria;
    }

    public Iterable<Categoria> visualizarCategoriasCadastradas(FiltroCategoriaDTO filtro){
        if(filtro.getNome() == null){
            return  categoriaRepository.findAll();
        }
        return categoriaRepository.findByNome(filtro.getNome());
    }
}