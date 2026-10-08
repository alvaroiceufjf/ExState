package org.example;


public class PropostaCreditoEstadoAprovada extends PropostaCreditoEstado {

    private PropostaCreditoEstadoAprovada() {};
    private static PropostaCreditoEstadoAprovada instance = new PropostaCreditoEstadoAprovada();
    public static PropostaCreditoEstadoAprovada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovada";
    }

    public boolean efetivar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoEfetivada.getInstance());
        return true;
    }

    public boolean cancelar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoCancelada.getInstance());
        return true;
    }
}