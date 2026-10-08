package org.example;

public class PropostaCreditoEstadoPendente extends PropostaCreditoEstado {

    private PropostaCreditoEstadoPendente() {};
    private static PropostaCreditoEstadoPendente instance = new PropostaCreditoEstadoPendente();
    public static PropostaCreditoEstadoPendente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pendente";
    }

    public boolean analisar(PropostaCredito proposta) {
        proposta.setEstado(PropostaCreditoEstadoEmAnalise.getInstance());
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
