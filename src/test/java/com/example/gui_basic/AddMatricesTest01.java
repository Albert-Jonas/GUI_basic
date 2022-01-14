package com.example.gui_basic;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class AddMatricesTest01 {
    AddMatrices aM;
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
        aM = new AddMatrices();
    }

    @AfterEach
    void tearDown() {
        aM = null;
    }

    @Test
    void testprintMatrix() {
        aM.printMatrix(A,4,4);
        System.out.println("-");
        aM.printMatrix(B,4,4);
        System.out.println("-");
        aM.printMatrix(D,4,3);

    }
@Test
     void testAdd(){
        assertArrayEquals(C,aM.add(A,B,4));

}




}

