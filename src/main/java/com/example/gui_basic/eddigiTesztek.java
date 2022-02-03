package com.example.gui_basic;

public class eddigiTesztek {
    public static void main(String[] args) {
        int szam;
        boolean isvissza;
        szam = osszeadas(10, 10);
        isvissza = nagyobbE(szam, 100);
    }

    static boolean nagyobbE(int szam, int i) {
        if (szam > i) {
            return true;
        }

        return false;
    }

    static int osszeadas(int i, int i1) {
        return i + i1;
    }


}
