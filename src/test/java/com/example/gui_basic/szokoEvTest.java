package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class szokoEvTest {
        szokoEv szEv;
    @BeforeEach
    void setUp() {
        szEv = new szokoEv();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void main() {
    }

    @Test
    @DisplayName("Hívás évszámmal")
    void ev() {
        assertFalse(szEv.ev(1581));
        assertTrue(szEv.ev(2000));
        assertTrue(szEv.ev(2004));
        assertTrue(szEv.ev(1600));
        assertFalse(szEv.ev(1700));
    }
}