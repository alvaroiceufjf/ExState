package org.example;


public class PropostaCreditoEstadoRejeitada extends PropostaCreditoEstado {

    private PropostaCreditoEstadoRejeitada() {};
    private static PropostaCreditoEstadoRejeitada instance = new PropostaCreditoEstadoRejeitada();
    public static PropostaCreditoEstadoRejeitada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Rejeitada";
    }
}
