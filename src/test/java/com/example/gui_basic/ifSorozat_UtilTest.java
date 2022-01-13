package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;


class ifSorozat_UtilTest {

    ifSorozat_Util ifSorozat_Util = null;

    @BeforeEach
    void setUp() {
        ifSorozat_Util = new ifSorozat_Util();
    }

    @AfterEach
    void tearDown() {
    }

    // 1
    @Test
    @DisplayName("Pozitív? teszt")
    void pozitivVagyNemTeszt() throws Exception {
        assertFalse(tapSystemOut(() -> { ifSorozat_Util.szam(-1000); }).contains("A szám pozitív szam"), "Input: -1000");
        assertFalse(tapSystemOut(() -> { ifSorozat_Util.szam(-5); }).contains("A szám pozitív szam"), "Input: -5");
        assertFalse(tapSystemOut(() -> { ifSorozat_Util.szam(-1); }).contains("A szám pozitív szam"), "Input: -1");
        assertFalse(tapSystemOut(() -> { ifSorozat_Util.szam(0); }).contains("A szám pozitív szam"), "Input: 0");

        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1); }).contains("A szám pozitív szam"), "Input: 1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(5); }).contains("A szám pozitív szam"), "Input: 5");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1000); }).contains("A szám pozitív szam"), "Input: 1000");
    }

    // 2
    @Test
    @DisplayName("Nulla vagy nem? teszt")
    void nullaVagyNemTeszt() throws Exception {
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1000); }).contains("A szám NEM egyenlő 0-val"), "Input: -1000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-5); }).contains("A szám NEM egyenlő 0-val"), "Input: -5");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1); }).contains("A szám NEM egyenlő 0-val"), "Input: -1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(0); }).contains("A szám nulla"), "Input: 0");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1); }).contains("A szám NEM egyenlő 0-val"), "Input: 1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(5); }).contains("A szám NEM egyenlő 0-val"), "Input: 5");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1000); }).contains("A szám NEM egyenlő 0-val"), "Input: 1000");
    }

    // 3
    @Test
    @DisplayName("100000-rel egyenlő? teszt")
    void szazezerVagyNemTeszt() throws Exception {
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-100001); }).contains("Nem egyenlő 100000-el"), "Input: -100001");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-100000); }).contains("Nem egyenlő 100000-el"), "Input: -100000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-99999); }).contains("Nem egyenlő 100000-el"), "Input: -99999");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1); }).contains("Nem egyenlő 100000-el"), "Input: -1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(0); }).contains("Nem egyenlő 100000-el"), "Input: 0");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1); }).contains("Nem egyenlő 100000-el"), "Input: 1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(10); }).contains("Nem egyenlő 100000-el"), "Input: 10");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(100); }).contains("Nem egyenlő 100000-el"), "Input: 100");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1000); }).contains("Nem egyenlő 100000-el"), "Input: 1000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(10000); }).contains("Nem egyenlő 100000-el"), "Input: 10000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(99999); }).contains("Nem egyenlő 100000-el"), "Input: 99999");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(100001); }).contains("Nem egyenlő 100000-el"), "Input: 100001");

        assertFalse(tapSystemOut(() -> { ifSorozat_Util.szam(100000); }).contains("Nem egyenlő 100000-el"), "Input: -100001");
    }

    // 4
    @Test
    @DisplayName("PI-nél kisebb, nagyobb, egyenlő? teszt")
    void piTeszt() throws Exception {

        System.out.print("\n!!! a szam() függvény bemeneti értéke integer, PI-VEL EGYENLŐ SOSEM LEHET !!!\n");
        //  assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(3.14); }).contains("A szám egyenlő a PI értékével"), "Input: 3.14");

        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1000); }).contains("A szám kisebb, mint a PI értéke"), "Input: -1000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-5); }).contains("A szám kisebb, mint a PI értéke"), "Input: -5");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-4); }).contains("A szám kisebb, mint a PI értéke"), "Input: -4");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-3); }).contains("A szám kisebb, mint a PI értéke"), "Input: -3");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-2); }).contains("A szám kisebb, mint a PI értéke"), "Input: -2");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1); }).contains("A szám kisebb, mint a PI értéke"), "Input: -1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(0); }).contains("A szám kisebb, mint a PI értéke"), "Input: 0");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1); }).contains("A szám kisebb, mint a PI értéke"), "Input: 1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(2); }).contains("A szám kisebb, mint a PI értéke"), "Input: 2");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(3); }).contains("A szám kisebb, mint a PI értéke"), "Input: 3");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(4); }).contains("A szám nagyobb, mint a PI értéke"), "Input: 4");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(5); }).contains("A szám nagyobb, mint a PI értéke"), "Input: 5");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1000); }).contains("A szám nagyobb, mint a PI értéke"), "Input: 1000");
    }

    // 5
    @Test
    @DisplayName("100-nál kisebb vagy nagyobb? teszt")
    void szaznalKisebbVagyNagyobbTeszt() throws Exception {
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-100000); }).contains("A szám kisebb, mint 100"), "Input: -100000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-10000); }).contains("A szám kisebb, mint 100"), "Input: -10000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1000); }).contains("A szám kisebb, mint 100"), "Input: -1000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-101); }).contains("A szám kisebb, mint 100"), "Input: -101");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-100); }).contains("A szám kisebb, mint 100"), "Input: -100");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-99); }).contains("A szám kisebb, mint 100"), "Input: -99");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(-1); }).contains("A szám kisebb, mint 100"), "Input: -1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(0); }).contains("A szám kisebb, mint 100"), "Input: 0");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1); }).contains("A szám kisebb, mint 100"), "Input: 1");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(10); }).contains("A szám kisebb, mint 100"), "Input: 10");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(99); }).contains("A szám kisebb, mint 100"), "Input: 99");

        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(101); }).contains("A szám nagyobb, mint 100"), "Input: 101");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(1000); }).contains("A szám nagyobb, mint 100"), "Input: 1000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(10000); }).contains("A szám nagyobb, mint 100"), "Input: 10000");
        assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(100000); }).contains("A szám nagyobb, mint 100"), "Input: -100001");
    }


}