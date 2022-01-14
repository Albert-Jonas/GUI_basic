package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ifSorozat_UtilTest {

    ifSorozat_Util ifSorozat_util = null;


    @BeforeEach
    void ifsoroszatsetUp() {
        ifSorozat_util = new ifSorozat_Util();


    }

    @AfterEach
    void tearDown() {
    }
//6
    @Test
    @DisplayName("A szám páros")
    void aSzamParosTeszt() throws Exception {
       // assertTrue(tapSystemOut(() -> { ifSorozat_Util.szam(4); }).contains("A szám páros"), "Input: 4");
       // assertFalse(tapSystemOut(() -> { ifSorozat_Util.szam(5); }).contains("A szám páros"), "Input: 5");

    }

    @Test
    void betu() {
    }
}