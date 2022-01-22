package com.example.gui_basic;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void isLeapYear() throws Exception {
        assertFalse(tapSystemOut(() -> { LeapYear.isLeapYear(2000);}).contains("Non"), "Input: 2000");
    }
}

