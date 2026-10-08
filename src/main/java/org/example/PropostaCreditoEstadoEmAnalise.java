package org.example;


public class PropostaCreditoEstadoEmAnalise extends PropostaCreditoEstado {

    private PropostaCreditoEstadoEmAnalise() {};
    private static PropostaCreditoEstadoEmAnalise instance = new PropostaCreditoEstadoEmAnalise();
    public static PropostaCreditoEstadoEmAnalise getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Análise";
    }

    public boolean aprovar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoAprovada.getInstance());
        return true;
    }

    public boolean pendenciar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoPendente.getInstance());
        return true;
    }

    public boolean rejeitar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoRejeitada.getInstance());
        return true;
    }

    public boolean cancelar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoCancelada.getInstance());
        return true;
    }
}