package org.programa;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MicroorganismoTest {
    private int vidaMax = 500;
    private Microorganismo micro = new Microorganismo(vidaMax, "MicroPrueba");

    @Test
    void TestOrgano(){
        int vida = micro.getVida();
        micro.estatus("boca");
        assertFalse(micro.getVida() < vida);
    }

    @ParameterizedTest
    @ValueSource(strings = {"boca","higado", "cerebro", "higado", "estomago"})
    void TestLugares(String lugares){
        micro.setVida();
        micro.estatus(lugares);
        assertEquals(true, micro.isAlive());
    }

    @RepeatedTest(10)
    void TestBajarVida(){
        micro.setVida();
        assertTrue(!micro.isDamage("Higado"));
    }

    @Test
    void getVida() {
    }

    @Test
    void setVida() {
    }

    @Test
    void isDamage() {
    }

    @Test
    void estatus() {
    }
}