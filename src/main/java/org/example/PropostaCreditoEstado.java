package org.example;

public abstract class PropostaCreditoEstado {

    public abstract String getEstado();

    public boolean analisar(PropostaCredito proposta) {
        return false;
    }

    public boolean aprovar(PropostaCredito proposta) {
        return false;
    }

    public boolean pendenciar(PropostaCredito proposta) {
        return false;
    }

    public boolean rejeitar(PropostaCredito proposta) {
        return false;
    }

    public boolean efetivar(PropostaCredito proposta) {
        return false;
    }

    public boolean cancelar(PropostaCredito proposta) {
        return false;
    }
}
