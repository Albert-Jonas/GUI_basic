package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddMatricesTest {

    AddMatrices addMatrices = null;

    int A[][] = { { 1, 1, 1, 1 },
            { 2, 2, 2, 2 },
            { 3, 3, 3, 3 },
            { 4, 4, 4, 4 } };

    int B[][] = { { 1, 1, 1, 1 },
            { 2, 2, 2, 2 },
            { 3, 3, 3, 3 },
            { 4, 4, 4, 4 } };

    int D[][] = { { 1, 1, 1 },
            { 2, 2, 2 },
            { 3, 3, 3 },
            { 4, 4, 4 } };

    int C[][] = { { 2, 2, 2, 2 },
            { 4, 4, 4, 4 },
            { 6, 6, 6, 6 },
            { 8, 8, 8, 8 } };

    @BeforeEach
    void setUp() {
        addMatrices = new AddMatrices();

    }

    @AfterEach
    void tearDown() {
        addMatrices = null;
    }

    @Test
    void tesztPrintMatrix() {
        addMatrices.printMatrix(A,4,4);
        System.out.println("*****");
        addMatrices.printMatrix(B,4,4);
        System.out.println("*****");
        addMatrices.printMatrix(D,3,3);

    }

    @Test
    void tesztAdd() {
        assertArrayEquals(C,addMatrices.add(A,B,4),"Cant add two of the same size");

        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> AddMatrices.add(A,D,5));
        String actualMessage = exception.getMessage();

        String expectedMessage = "Index 3 out of bounds for length 3";

        assertTrue(actualMessage.contains(expectedMessage),"Correct exception not thrown");
    }

    @Test
    void main() {
    }
}