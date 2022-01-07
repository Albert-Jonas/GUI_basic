package com.example.gui_basic;

import java.util.Scanner;


public class ifSorozat {


    public static void main(String[] args) {
        ifSorozat_Util iutil = new ifSorozat_Util();

        String bekerSzoveg, text;
        int szam;

        bekerSzoveg = bekeres();
        System.out.println("bekerSzoveg = " + bekerSzoveg);
        //System.out.println("A bekért szöveg : " + bekerSzoveg);
        text = textSzetvalaszt(bekerSzoveg);
        szam = szamSzetvalszt(bekerSzoveg);
        System.out.println("text = " + text);
        System.out.println("szam = " + szam);
        iutil.szam(szam);
        iutil.betu(text);
    }

    private static int szamSzetvalszt(String bekerSzoveg) {
        StringBuilder karakterek = new StringBuilder();
        char[] k = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < bekerSzoveg.length(); i++) {
            Boolean isB = false;
            for (int j = 0; j < k.length; j++) {
                if (bekerSzoveg.charAt(i) == k[j]){
                    isB = true;
                }
            }
            karakterek.append(isB ? bekerSzoveg.charAt(i) : "");
        }
        return Integer.parseInt(karakterek.toString());}



    private static String textSzetvalaszt(String bekerSzoveg) {
        StringBuilder karakterek = new StringBuilder();
        char[] k = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < bekerSzoveg.length(); i++) {
            Boolean isB = false;
            for (int j = 0; j < k.length; j++) {
                if (bekerSzoveg.charAt(i) == k[j]){
                    isB = true;
            }
            }
            karakterek.append(!isB ? bekerSzoveg.charAt(i) : "");
        }
    return karakterek.toString();}

    private static String bekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy karaktarlácot(Csaz 0-9 aA-zZ) : ");
        return sc.nextLine();
    }

}
