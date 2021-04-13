package br.com.zup.zupnancas.service;

import br.com.zup.zupnancas.model.Categoria;
import br.com.zup.zupnancas.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria(Categoria categoria){
        Categoria objCategoria = categoriaRepository.save(categoria);
        return  objCategoria;
    }

    public Categoria visualizarCategoriasCadastradas(Categoria categoria){
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(categoria.getId());
        if (optionalCategoria == null) {
            throw new RuntimeException("Categoria não localizada");
        }
        return optionalCategoria.get();
    }

    public void deletarCategoria(int id){
        categoriaRepository.deleteById(id);
    }
}