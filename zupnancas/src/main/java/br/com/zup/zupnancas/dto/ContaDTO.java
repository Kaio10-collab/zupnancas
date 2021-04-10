package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.Enum.Status;

public class ContaDTO {

    private Status status;

    public ContaDTO() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
