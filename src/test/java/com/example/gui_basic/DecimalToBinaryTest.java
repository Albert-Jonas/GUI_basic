package com.example.gui_basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    DecimalToBinary DecimalToBinary = null;

    @BeforeEach
    void setUp() {
        DecimalToBinary = new DecimalToBinary();
    }

    @Test
    void decToBinary() throws Exception {
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(5); }).contains("101"), "n = 5");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(17); }).contains("10001"), "n = 17");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(23); }).contains("10111"), "n = 23");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(42); }).contains("101010"), "n = 42");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(68); }).contains("1000100"), "n = 68");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(114); }).contains("1110010"), "n = 114");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(259); }).contains("100000011"), "n = 259");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(1014); }).contains("1111110110"), "n = 1014");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(2543); }).contains("100111101111"), "n = 2543");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(9999); }).contains("10011100001111"), "n = 9999");
        assertTrue(tapSystemOut(() -> { DecimalToBinary.decToBinary(Integer.MAX_VALUE); }).contains("1111111111111111111111111111111"), "n = Integer.MAX_VALUE");
    }
}