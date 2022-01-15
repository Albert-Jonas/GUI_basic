package com.example.gui_basic;

// Class Declaration

public class Dog
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;

    public Dog(Dog apa, Dog anya, String nameToGive)
    {
        age = 0;
        name = nameToGive;

        if (apa.getBreed() == anya.getBreed())
        {
            breed = apa.getBreed();
        }
        else
        {
            breed = "Keverék";
        }

        if (apa.getColor().equals(anya.getColor()))
        {
            color = apa.getColor();
        }
        else if (apa.getColor().equals("Szürke") || anya.getColor().equals("Szürke"))
        {
            color = "Szürke";
        }
        else if ( ( apa.getColor().equals("Fekete") || apa.getColor().equals("Fehér")) && ( anya.getColor().equals("Fekete") || anya.getColor().equals("Fehér")))
        {
            color = "Szürke";
        }
        else if ( apa.getColor().equals("Barna") || anya.getColor().equals("Barna"))
        {
            if ( apa.getColor().equals("Fekete") || anya.getColor().equals("Fekete"))
            {
                color = "Barna";
            }
            else if ( apa.getColor().equals("Fehér") || anya.getColor().equals("Fehér"))
            {
                color = "Szürke";
            }
            else
            {
                color = "Barna";
            }
        }
    }


    // Constructor Declaration of Class
    public Dog(String name, String breed,
               int age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // method 1
    public String getName()
    {
        return name;
    }

    // method 2
    public String getBreed()
    {
        return breed;
    }

    // method 3
    public int getAge()
    {
        return age;
    }

    // method 4
    public String getColor()
    {
        return color;
    }

    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
                ".\nMy breed,age and color are " +
                this.getBreed()+"," + this.getAge()+
                ","+ this.getColor());
    }

    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}