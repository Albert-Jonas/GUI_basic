package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class ifSorozatTest {

    ifSorozat ifSorozat = null;
    InputStream sysInBackup = null;

    @BeforeEach
    void setUp() {
        ifSorozat = new ifSorozat();
        InputStream sysInBackup = System.in; // backup System.in to restore it later
    }

    @AfterEach
    void tearDown() {
        System.setIn(sysInBackup);
    }

    @Test
    @DisplayName("szám szétválasztó teszt")
    void szamSzetvalasztTeszt() {
        // át kellett írnom public-ra, private fv-re nem futott a teszt

    //számok legelől, egyben
        assertEquals(123, ifSorozat.szamSzetvalszt("123 pingponglabda"), "123 pingponglabda");
        assertEquals(-249, ifSorozat.szamSzetvalszt("-249 pont"), "-249 pont");
    // számok legelől is és máshol is
        assertEquals(761, ifSorozat.szamSzetvalszt("7 kutya, 6 macska és 1 ló"), "7 kutya, 6 macska és 1 ló");
        assertEquals(-85452, ifSorozat.szamSzetvalszt("-85 izé és 452 hogyishívják"), "-85 izé és 452 hogyishívják");
    // számok középen, több helyen
        assertEquals(11, ifSorozat.szamSzetvalszt("jobb ma 1 veréb, mint holnap 1 túzok"), "jobb ma 1 veréb, mint holnap 1 túzok");
        assertEquals(-643, ifSorozat.szamSzetvalszt("ez így -64 pont és 3 kutyafüle"), "ez így -64 pont");
    // számok a végén
        assertEquals(90210, ifSorozat.szamSzetvalszt("Beverly Hills 90210"), "Beverly Hills 90210");
        assertEquals(-624, ifSorozat.szamSzetvalszt("a végeredmény -624"), "a végeredmény -624");
    // min és max integer
        assertEquals(2147483647, ifSorozat.szamSzetvalszt("ushn2sev14hfg74s8f36jzhj4sdf7fhd"), "ushn2sev14hfg74s8f36jzhj4sdf7fhd");
        assertEquals(-2147483648, ifSorozat.szamSzetvalszt("erguh-21dg474dij8eg3drg64rg8ijgv"), "erguh-21dg474dij8eg3drg64rg8ijgv");
    // 0-val kezdődő számok
        assertEquals(11, ifSorozat.szamSzetvalszt("0 meg 0 meg 0 meg 1 az 1"), "0 meg 0 meg 0 meg 1 az 1");
    }

    @Test
    void main() {
        ByteArrayInputStream in = new ByteArrayInputStream("My string122".getBytes());
        System.setIn(in);
        ifSorozat.main(new String[] {"arg1", "arg2", "arg3"});
    }


}