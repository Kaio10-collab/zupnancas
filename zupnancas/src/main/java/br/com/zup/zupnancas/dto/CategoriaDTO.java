package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.model.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDTO {

    private String nome;

    public CategoriaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Categoria converterDTOParaModel(){

        Categoria categoria = new Categoria();

        categoria.setNome(this.nome);
        return categoria;
    }

    public static Iterable<CategoriaDTO> converterIterableModelParaDTO(Iterable<Categoria> categorias){
        List<CategoriaDTO> categoriaDTOS = new ArrayList<>();

        for (Categoria categoria:categorias){
            categoriaDTOS.add(converterModelParaDTO(categoria));
        }
        return categoriaDTOS;
    }

    public static CategoriaDTO converterModelParaDTO(Categoria categoria){
        CategoriaDTO categoriaDTO = new CategoriaDTO();
        categoriaDTO.setNome(categoria.getNome());
        return categoriaDTO;
    }
}