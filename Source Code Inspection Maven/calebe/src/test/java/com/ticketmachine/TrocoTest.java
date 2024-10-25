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
    public void testTroco() {
        //Verificar se o troco está funcionando corretamente
        Troco troco = new Troco(186);

        assertEquals(1, troco.papeisMoeda[5].getQuantidade());  // 100
        assertEquals(1, troco.papeisMoeda[4].getQuantidade());  // 50
        assertEquals(1, troco.papeisMoeda[3].getQuantidade());  // 20
        assertEquals(1, troco.papeisMoeda[2].getQuantidade());  // 10
        assertEquals(1, troco.papeisMoeda[1].getQuantidade());  // 5
        assertEquals(3, troco.papeisMoeda[0].getQuantidade());  // 2
    }

    @Test
    public void testTrocoIterator() {
        // Test the iterator
        Troco troco = new Troco(186);
        Iterator<PapelMoeda> iterator = troco.getIterator();
        
        assertTrue(iterator.hasNext());  // There should be at least one note
        
        // Iterate through all the notes
        while (iterator.hasNext()) {
            PapelMoeda papelMoeda = iterator.next();
            assertNotNull(papelMoeda);  // Ensure we get a valid note
        }

        assertFalse(iterator.hasNext());  // After iteration, should return false
    }
}