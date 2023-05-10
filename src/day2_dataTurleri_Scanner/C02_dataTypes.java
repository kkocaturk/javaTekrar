package day2_dataTurleri_Scanner;

public class C02_dataTypes {
    public static void main(String[] args) {

        boolean isFull = true;
        boolean isMarried = false;

        char aChar = 'a';
        char bChar = '$';
        //char cChar=' .'; tek char olmalı
        char cChar = 'w';

        long sayi = 752752741741741L;//int sınırından büyük bir değeri yazarsak yanına l veya L yazarız.
        byte sayi2 = 23;
        float sayi3 = 2.325324f; // java ondalıklı sayıları otomatik olarak double kabul eder.
        // float için f veya F yazılır.
        double sayi4 = 3.89465151;
        float a = 20f;
        float b = 6f;
        System.out.println(a / b); //3.3333333
        double aDouble = 20f;
        float bDouble = 6f;
        System.out.println(aDouble / bDouble); //3.3333333333333335
        //double 'la işlem yaparken 10d/2d işlem yapıldığında milyarda1 hatayla 4.999999999....9 veya 5.00000000...1 sonuç dönebilir

    }
}
