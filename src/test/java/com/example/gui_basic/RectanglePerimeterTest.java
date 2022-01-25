package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


import static org.junit.jupiter.api.Assertions.*;

class RectanglePerimeterTest {
    RectanglePerimeter rp;
    static RectanglePerimeter rectanglePerimeter = null;
    Scanner sc = new Scanner(System.in);

    @BeforeEach
    void setUp() {

        rp = new RectanglePerimeter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void perimeter() {
        assertEquals(80,rp.perimeter(20,20));
        assertEquals(60,rp.perimeter(10,20));
        assertEquals(70,rp.perimeter(15,20));
        assertEquals(90,rp.perimeter(25,20));

    }

    @Test
    public static void main() {
        ByteArrayInputStream in = new ByteArrayInputStream("perimeter".getBytes());
        System.setIn(in);
        rectanglePerimeter(new String[] {"perimeter"});
                //assertEquals(60,RectanglePerimeterTest(10,20,));
                //assertEquals(80,RectanglePerimeterTest(20,20,));

    ;}

    private static void rectanglePerimeter(String[] strings) {
    }
}