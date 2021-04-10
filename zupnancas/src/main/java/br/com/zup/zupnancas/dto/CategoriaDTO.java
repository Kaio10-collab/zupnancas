package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.model.Categoria;

public class CategoriaDTO {

    private String nome;
    private int id;

    public CategoriaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static CategoriaDTO converterDTOParaModel(Categoria categoria){
        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setNome(categoria.getNome());
        categoriaDTO.setId(categoria.getId());

        return categoriaDTO;
    }

}