package com.example.gui_basic;

import java.util.Random;

public class ifSorozat_Util {

//1
    public void szam(int szam) {
        if (szam > 0 ){
            System.out.println("A szám pozitív szam");
        }
//2
        if (szam == 0 ){
            System.out.println("A szám nulla");
        }
        else {
            System.out.println("A szám NEM egyenlő 0-val");
        }
//3
        if (szam*100 != 100000 ){
            System.out.println("Nem egyenlő 100000-el");
        }
//4
        if (szam > 3.14 ){
            System.out.println("A szám nagyobb, mint a PI értéke");
        }else if(szam == 3.14){
            kiiratas("A szám egyenló a PI értékével");
        }else if (szam < 3.14){
            kiiratas("A szám kisebb, mint a PI értéke");
        }
//5
        if (szam > 100){
            kiiratas("A szám nagyobb, mint 100");
        }else {
            kiiratas("A szám kisebb, mint 100");
        }
//6
        if (szam % 2 == 0){
            kiiratas( "A szám páros" );
        }

//  7
         if (szam == 13 || szam == 6){
             kiiratas("A szám egyenlő a T-Rex(Tyrannosaurus) magasságával, vagy csipőmagasságával");
            if (szam == 13){
                kiiratas("T-Rex magassága : "+ szam +"m");
            }
            if (szam == 6)
                kiiratas("T-Rex csipőmagassága : " +szam +"m" );

         }
//8
        int rm = (int)(Math.random() * 1000000) + 0;
        if(szam <= rm){

                kiiratas("A random szám nagyobb vagy egyenlő, mint a szám. Random :" + rm);
        }



    }

    public void betu(String text) {
//1
        if (text.length() < 10){
            kiiratas("Kevesebb betűből áll, mint 10");
        }else if (text.length() == 10){
            kiiratas("10 karakterből áll");
        }
        else {
            kiiratas("Több betüből áll, mit 10");
        }

//2
        char[] k = {'a','á','e','é','i','í','o','ó','ö','ő','u','ú','ü','ű'};
        boolean isMhngzok = false;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < k.length; j++) {
                if (text.charAt(i) == k[j]){
                    isMhngzok = true;
                }
            }
        }
        kiiratas("A szüveg "+(isMhngzok? "tartalmaz" : "Nem tartalmaz") + " kisbetűs magánhangzót"  );

//3


    }

    private void kiiratas(String s) {
        System.out.println(s);
    }
}
