package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.model.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDTO {

    private String nome;
    private Integer id;

    public CategoriaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Categoria converterDTOParaModel(){

        Categoria categoria = new Categoria();

        categoria.setNome(this.nome);
        categoria.setId(this.id);

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
        categoriaDTO.setId(categoria.getId());
        categoriaDTO.setNome(categoria.getNome());
        return categoriaDTO;
    }
}