package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMatricesTest {
    @BeforeEach
    void setUp() {
        AddMatrices addMatrices = null;
        addMatrices = new AddMatrices();
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        int B[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printMatrix() {

    }

    @Test
    void add() {
    }

    @Test
    void main() {
    }
}