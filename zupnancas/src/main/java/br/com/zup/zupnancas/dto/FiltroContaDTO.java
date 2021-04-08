package br.com.zup.zupnancas.dto;

import br.com.zup.zupnancas.Enum.Status;

public class FiltroContaDTO {

    private Status status;

    public FiltroContaDTO() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
