package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class AddMatricesTest {
    AddMatrices aMatris;
    int A[][] = {{1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};

    int B[][] = {{1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}};

    int D[][] = {{1, 1, 1},
            {2, 2, 2},
            {3, 3, 3},
            {4, 4, 4}};

    int C[][] = {{2, 2, 2, 2},
            {4, 4, 4, 4},
            {6, 6, 6, 6},
            {8, 8, 8, 8}};

    @BeforeEach
    void setUp() {
        aMatris = new AddMatrices();
    }

    @AfterEach
    void tearDown() {
        aMatris = null;
    }

    @Test
    void printMatrix() {
        aMatris.printMatrix(A,4,4);
    }

    @Test
    void add() {
        assertArrayEquals(C, aMatris.add(A,B,4));
    }

    @Test
    void main() {
        ByteArrayInputStream in = new ByteArrayInputStream("printMatrix".getBytes());
        System.setIn(in);
        AddMatrices.main(new String[] {"printMatrix"});
    }
}