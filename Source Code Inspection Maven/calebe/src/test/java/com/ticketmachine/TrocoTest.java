package com.ticketmachine;

import com.ticketmachine.core.Troco;
import com.ticketmachine.core.PapelMoeda;
import com.ticketmachine.core.TicketMachine;

import com.ticketmachine.exception.PapelMoedaInvalidaException;
import com.ticketmachine.exception.SaldoInsuficienteException;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;

public class TrocoTest {

    @Test
    public void testPapelMoeda() {
        // verificar se o valor está sendo obtido corretamente pela inicializacao
        PapelMoeda papelMoeda = new PapelMoeda(100, 5);

        assertEquals(100, papelMoeda.getValor());
        assertEquals(5, papelMoeda.getQuantidade());
    }

    @Test
    public void testPapelMoedaGetValor() {
        // verificar somente o valor
        PapelMoeda papelMoeda = new PapelMoeda(50, 2);
        assertEquals(50, papelMoeda.getValor());
    }

    @Test
    public void testPapelMoedaGetQuantidade() {
        // verificar somente a quantidade
        PapelMoeda papelMoeda = new PapelMoeda(20, 3);

        assertEquals(3, papelMoeda.getQuantidade());
    }
}