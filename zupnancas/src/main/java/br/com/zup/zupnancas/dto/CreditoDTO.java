package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.model.Categoria;
import br.com.zup.zupnancas.model.Credito;
import br.com.zup.zupnancas.model.Saldo;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class CreditoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valor_Dinheiro")
    private Double valor;

    private String descricao;
    private String cpf;
    private List<Categoria> categoriaList;

    public CreditoDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Credito converterCreditoModelParaDTO(Credito credito) {

        Credito objCredito = new Credito();
        Saldo saldo = new Saldo();
        saldo.setCpf(cpf);

        credito.setId(this.id);
        credito.setValor(this.valor);
        credito.setDescricao(this.descricao);
        credito.setSaldo(saldo);
        credito.setCategorias(this.categoriaList);

        return objCredito;
    }
}
