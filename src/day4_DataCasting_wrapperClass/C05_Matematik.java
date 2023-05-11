package day4_DataCasting_wrapperClass;

import java.util.Scanner;

public class C05_Matematik {
    public static void main(String[] args) {
        // kullanıcıdan 3 basamaklı sayı al,sayının rakamlar toplamının bulma
        Scanner scanner=new Scanner(System.in);
        System.out.println("3 basamaklı sayı girin");
        int girilenSayi=scanner.nextInt();
        int bas1=girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int bas2= girilenSayi%10;
        girilenSayi=girilenSayi/10;
        int bas3=girilenSayi%10;
        System.out.println("1. basamağı: " + bas1+
                "\n2. basamak: "+ bas2+
                "\n3. basamak: " +bas3);
        System.out.println("rakamlar toplamı: " + (bas1+bas2+bas3));


//---------kaç basamak olursa olsun verilen sayının basamak değerlerini toplama
        System.out.println("----1--");
        System.out.println("basamak değerlerini toplamak istediğiniz sayıyı giriniz: ");
        int girilenSayi2=scanner.nextInt();
        System.out.println("girilen sayı rakamlar toplamı: " + hesap(girilenSayi2));
        System.out.println("----2----");


    }

    private static int hesap(int girilenSayi) {
        int say=0;
        int stop=basamakSay(girilenSayi);
        for (int i = 0; i < stop; i++) {

            say = say + girilenSayi%10;
            girilenSayi=girilenSayi/10;

        }
        return say;
    }

    private static int basamakSay(int girilenSayi) {
        int basamak=0;
        while (girilenSayi != 0) {
            girilenSayi /= 10;
            basamak++;
        }
        return basamak;
    }
}
