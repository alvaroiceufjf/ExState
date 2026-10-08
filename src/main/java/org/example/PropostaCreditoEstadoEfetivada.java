package org.example;

public class PropostaCreditoEstadoEfetivada extends PropostaCreditoEstado {

    private PropostaCreditoEstadoEfetivada() {};
    private static PropostaCreditoEstadoEfetivada instance = new PropostaCreditoEstadoEfetivada();
    public static PropostaCreditoEstadoEfetivada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Efetivada";
    }
}
