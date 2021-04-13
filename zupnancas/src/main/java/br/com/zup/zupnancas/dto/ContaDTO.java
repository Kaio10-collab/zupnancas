package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.Enum.StatusEnum;
import br.com.zup.zupnancas.model.Conta;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class ContaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valor_Dinheiro")
    private Double valor;

    private String descricao;
    private LocalDate dataDeVencimento;
    private StatusEnum statusEnum;

    public ContaDTO() {
    }

    public StatusEnum getStatus() {
        return statusEnum;
    }

    public void setStatus(StatusEnum status) {
        this.statusEnum = status;
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

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Conta converterContaDTOParaModel(Conta conta) {

        Conta objConta = new Conta();

        conta.setId(this.id);
        conta.setValor(this.valor);
        conta.setDescricao(this.descricao);
        conta.setDataDeVencimento(this.dataDeVencimento);
        conta.setStatusEnum(this.statusEnum);

        return objConta;
    }
}

    /**
     *
     * public Conta converterContaModelParaDto(Conta conta) {
     *
     *         Conta objetoConta = new Conta();
     *
     *         conta.setId(conta.getId());
     *         conta.setValor(conta.getValor());
     *         conta.setDescricao(conta.getDescricao());
     *         conta.setDataDeVencimento(conta.getDataDeVencimento());
     *         conta.setStatusEnum(conta.getStatusEnum());
     *
     *         //return objetoConta;
     *     }
     */

