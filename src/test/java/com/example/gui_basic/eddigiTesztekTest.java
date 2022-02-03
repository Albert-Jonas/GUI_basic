package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class eddigiTesztekTest {
    eddigiTesztek edTesztek;

    @BeforeEach
    void setUp() {
        edTesztek = new eddigiTesztek();
    }

    @AfterEach
    void tearDown() {
        edTesztek = null;
    }

    @Test
    void main() {
        ByteArrayInputStream in = new ByteArrayInputStream("osszeadas".getBytes());
        System.setIn(in);
        eddigiTesztek.main(new String[] {"osszeadas"});

    }

    @Test
    @DisplayName("Static test - visszatérési érték tesztelés")
    void osszeadas() {
        assertEquals(20, eddigiTesztek.osszeadas(10,10));
        assertNotEquals(40, eddigiTesztek.osszeadas(10,10));
    }
    @Test
    @DisplayName("Static test - logikai visszatérési érték tesztelés")
    void nagyobbE(){
        assertFalse(edTesztek.nagyobbE(10,10));
        assertTrue(edTesztek.nagyobbE(200,10));

    }
}