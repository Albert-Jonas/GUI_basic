package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dogTest = null;

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
}
