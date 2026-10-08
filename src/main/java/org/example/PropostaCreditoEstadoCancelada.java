package org.example;

public class PropostaCreditoEstadoCancelada extends PropostaCreditoEstado {

    private PropostaCreditoEstadoCancelada() {};
    private static PropostaCreditoEstadoCancelada instance = new PropostaCreditoEstadoCancelada();
    public static PropostaCreditoEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }
}
