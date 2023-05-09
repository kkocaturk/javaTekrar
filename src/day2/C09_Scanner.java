package day2;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin
        girilen s1=10 s2=20 ise sonuçta s1=20 s2=10 yapın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı1 girin: ");
        int sayi1 = scanner.nextInt();
        System.out.println("sayı2 girin: ");
        int sayi2 = scanner.nextInt();

        // su kum boş kova

        int temp;

        //1.adım sayi2 temp'e ata

        temp=sayi2;

        //sayi1 'i sayi2'ye atayalım

        sayi2=sayi1;

        //temp değeri sayi1'e atayalım

        sayi1=temp;
        System.out.println("sayıların değerlerini yerdeğştirdim.");
        System.out.println("sayi1: " + sayi1);
        System.out.println("sayi2: " + sayi2);

    }
}
