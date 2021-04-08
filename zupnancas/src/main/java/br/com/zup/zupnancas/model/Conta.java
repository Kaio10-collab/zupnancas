package br.com.zup.zupnancas.model;

import br.com.zup.zupnancas.Enum.Status;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "contas")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Double valor;
    private String descricao;
    private LocalDate dataDeEntrada;
    private LocalDate dataDeVencimento;
    private Status statusEnum;

    public Conta() {
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

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Status getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(Status statusEnum) {
        this.statusEnum = statusEnum;
    }
}