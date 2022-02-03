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

        assertFalse(szEv.ev(1576));
        assertFalse(szEv.ev(1581));
        assertFalse(szEv.ev(1582));
        assertTrue(szEv.ev(2000));
        assertTrue(szEv.ev(2004));
        assertFalse(szEv.ev(2015));
        assertTrue(szEv.ev(1600));
        assertFalse(szEv.ev(1700));
        assertFalse(szEv.ev(Integer.MAX_VALUE));
        assertFalse(szEv.ev(Integer.MAX_VALUE-1));
    }
}