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
        else if (apa.getColor() == "Szürke" || anya.getColor() == "Szürke")
        {
            color = "Szürke";
        }
        else if ( ( apa.getColor() == "Fekete" || apa.getColor() == "Fehér" ) && ( anya.getColor() == "Fekete" || anya.getColor() == "Fehér" ))
        {
            color = "Szürke";
        }
        else if ( apa.getColor() == "Barna" || anya.getColor() == "Barna" )
        {
            if ( apa.getColor() == "Fekete" || anya.getColor() == "Fekete")
            {
                color = "Barna";
            }
            else if ( apa.getColor() == "Fehér" || anya.getColor() == "Fehér")
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