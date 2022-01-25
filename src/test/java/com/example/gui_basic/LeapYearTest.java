package com.example.gui_basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    LeapYear Ly;


    @Test
    void isLeapYear() throws Exception {
        assertFalse(tapSystemOut(() -> { LeapYear.isLeapYear(2000);}).contains("Non"), "Input: 2000");
        assertTrue(tapSystemOut(() -> { LeapYear.isLeapYear(2001);}).contains("Non"), "Input: 2001");
        assertTrue(tapSystemOut(() -> { LeapYear.isLeapYear(2002);}).contains("Non"), "Input: 2002");
        assertFalse(tapSystemOut(() -> { LeapYear.isLeapYear(2004);}).contains("Non"), "Input: 2004");
        assertTrue(tapSystemOut(() -> { LeapYear.isLeapYear(Integer.MAX_VALUE-1);}).contains("Non"), "Input: Max_Value");
        assertTrue(tapSystemOut(() -> { LeapYear.isLeapYear(Integer.MAX_VALUE);}).contains("Non"), "Input: Max_Value");
        assertTrue(tapSystemOut(() -> { LeapYear.isLeapYear(Integer.MIN_VALUE+1);}).contains("Non"), "Input: Max_Value");
        assertFalse(tapSystemOut(() -> { LeapYear.isLeapYear(Integer.MIN_VALUE);}).contains("Non"), "Input: Max_Value");
    }


    @Test
    void main() {

    }
}


