package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dogTest = null;
    Dog apa = null;
    Dog anya = null;

    @BeforeEach
    public void init() {
        dogTest = new Dog("Tokió", "Juhász", 10, "Szürke");
    }

    @AfterEach
            public void after(){

    }

   @Test
   @DisplayName("a kutya neve")
   public void testGetName(){

       assertEquals("Tokió",dogTest.getName());// @Test//@DisplayName(value = "a kutya fajtája")
       assertEquals("Juhász",dogTest.getBreed());//@Test//@DisplayName("a kutya életkora")
       assertEquals(10,dogTest.getAge());//@Test//@DisplayName("a kutya színe")
       assertEquals("Szürke",dogTest.getColor());

   }

    @Test
    @DisplayName("a kiírató függvény")
    public void testToString(){
        assertEquals(dogTest.toString(),
                "Hi my name is "+ "Tokió"+
                ".\nMy breed,age and color are " +
                "Juhász"+"," + "10"+
                ","+ "Szürke");
    }

    @Test
    @DisplayName("Pároztatás")
    public void testParoztatasHappyPath(){

        apa = new Dog("Morzsi", "Uszkár", 3, "Fekete");
        anya = new Dog("Kuglóf", "Uszkár", 2, "Fekete");

        dogTest = new Dog (apa, anya, "Pup");
        assertEquals("Fekete",dogTest.getColor());
        assertEquals(0,dogTest.getAge());


        apa = new Dog("Morzsi", "Uszkár", 3, "Fekete");
        anya = new Dog("Kuglóf", "Uszkár", 2, "Fehér");

        dogTest = new Dog (apa, anya, "Pup");
        assertEquals("Szürke",dogTest.getColor());


        apa = new Dog("Morzsi", "Uszkár", 3, "Fekete");
        anya = new Dog("Kuglóf", "Uszkár", 2, "Szürke");

        dogTest = new Dog (apa, anya, "Pup");
        assertEquals("Szürke",dogTest.getColor());
    }
}
