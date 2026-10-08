package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropostaCreditoTest {

    private PropostaCredito proposta;

    @BeforeEach
    void setUp() {
        proposta = new PropostaCredito();
    }

    @Test
    void deveIniciarEmAnalise() {
        assertEquals("Em Análise", proposta.getNomeEstado());
    }

    @Test
    void deveAprovarPropostaEmAnalise() {
        assertTrue(proposta.aprovar());
        assertEquals("Aprovada", proposta.getNomeEstado());
    }

    @Test
    void devePendenciarPropostaEmAnalise() {
        assertTrue(proposta.pendenciar());
        assertEquals("Pendente", proposta.getNomeEstado());
    }

    @Test
    void deveRejeitarPropostaEmAnalise() {
        assertTrue(proposta.rejeitar());
        assertEquals("Rejeitada", proposta.getNomeEstado());
    }

    @Test
    void deveCancelarPropostaEmAnalise() {
        assertTrue(proposta.cancelar());
        assertEquals("Cancelada", proposta.getNomeEstado());
    }

    @Test
    void naoDeveEfetivarPropostaEmAnaliseDirectly() {
        assertFalse(proposta.efetivar());
        assertEquals("Em Análise", proposta.getNomeEstado());
    }

    // --- TESTES DE TRANSIÇÃO FLUXO COMPLETO ---

    @Test
    void deveEfetivarPropostaAposAprovacao() {
        proposta.aprovar();
        assertTrue(proposta.efetivar());
        assertEquals("Efetivada", proposta.getNomeEstado());
    }

    @Test
    void deveReanalisarPropostaPendenteEAprovar() {
        proposta.pendenciar();
        assertEquals("Pendente", proposta.getNomeEstado());

        assertTrue(proposta.analisar());
        assertEquals("Em Análise", proposta.getNomeEstado());

        assertTrue(proposta.aprovar());
        assertEquals("Aprovada", proposta.getNomeEstado());
    }

    @Test
    void naoDeveAlterarEstadoAposEfetivada() {
        proposta.aprovar();
        proposta.efetivar();

        assertFalse(proposta.aprovar());
        assertFalse(proposta.cancelar());
        assertFalse(proposta.rejeitar());
        assertEquals("Efetivada", proposta.getNomeEstado());
    }

    @Test
    void naoDeveAlterarEstadoAposRejeitada() {
        proposta.rejeitar();

        assertFalse(proposta.aprovar());
        assertFalse(proposta.analisar());
        assertEquals("Rejeitada", proposta.getNomeEstado());
    }
}