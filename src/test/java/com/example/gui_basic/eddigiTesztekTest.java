package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    }

    @Test
    @DisplayName("Public test - visszatérési érték tesztelés")
    void osszeadas() {
        assertEquals(20, eddigiTesztek.osszeadas(10,10));

    }
}