package org.example;

public class PropostaCredito {

    private String numero;
    private PropostaCreditoEstado estado;

    public PropostaCredito() {
        this.estado = PropostaCreditoEstadoEmAnalise.getInstance();
    }

    public void setEstado(PropostaCreditoEstado estado) {
        this.estado = estado;
    }

    public boolean analisar() {
        return estado.analisar(this);
    }

    public boolean aprovar() {
        return estado.aprovar(this);
    }

    public boolean pendenciar() {
        return estado.pendenciar(this);
    }

    public boolean rejeitar() {
        return estado.rejeitar(this);
    }

    public boolean efetivar() {
        return estado.efetivar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public PropostaCreditoEstado getEstado() {
        return estado;
    }
}