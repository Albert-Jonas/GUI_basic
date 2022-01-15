package com.example.gui_basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import javax.xml.namespace.QName;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dogTest = null;
    Dog apa = null;
    Dog anya = null;
    Dog pup = null;

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
        assertEquals("Uszkár",dogTest.getBreed());
        assertEquals(0,dogTest.getAge());

        apa = new Dog("Morzsi", "Más", 3, "Fekete");
        anya = new Dog("Kuglóf", "Uszkár", 2, "Fekete");

        dogTest = new Dog (apa, anya, "Pup");

        assertEquals("Keverék",dogTest.getBreed());
    }

    @ParameterizedTest
    @CsvSource({
            "Fekete,Fekete,Fekete",
            "Fehér,Fekete,Szürke",
            "Szürke,Fekete,Szürke",
            "Barna,Fekete,Barna",
            "Fekete,Fehér,Szürke",
            "Fehér,Fehér,Fehér",
            "Szürke,Fehér,Szürke",
            "Barna,Fehér,Szürke",
            "Szürke,Fehér,Szürke",
            "Szürke,Fekete,Szürke",
            "Szürke,Szürke,Szürke",
            "Szürke,Barna,Szürke",
            "Fekete,Barna,Barna",
            "Fehér,Barna,Szürke",
            "Szürke,Barna,Szürke",
            "Barna,Barna,Barna" })
    @DisplayName("PároztatásParamterizálva")
    public void testParoztatasHappyPathParameters(String apaSzin, String anyaSzin, String pupSzin){

        apa = new Dog("Morzsi", "Uszkár", 3, apaSzin);
        anya = new Dog("Kuglóf", "Uszkár", 2, anyaSzin);

        pup = new Dog (apa, anya, "Pup");
        assertEquals(pupSzin,pup.getColor());

    }
}
