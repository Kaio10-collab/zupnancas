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

    public Categoria converterDTOParaModel(){

        Categoria categoria = new Categoria();

        categoria.setNome(this.nome);
        categoria.setId(this.id);

        return categoria;
    }

}