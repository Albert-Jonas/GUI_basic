package com.example.gui_basic;

public class szokoEv {

    public static void main(String[] args) {
        boolean isev;
        //isev = ev(2000);

    }

    public static boolean ev(int szam) {
        Boolean isVissza = false;

        if (szam >= 1582 && szam % 4 == 0){
            isVissza = true;
            if (szam % 100 == 0) {
                isVissza = false;
                if (szam % 400 == 0) {
                    isVissza = true;
                }
            }
        }
        return isVissza;
    }
}
