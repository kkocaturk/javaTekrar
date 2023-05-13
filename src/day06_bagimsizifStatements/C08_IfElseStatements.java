package day06_bagimsizifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir karakter isteyin
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdırın
        yoksa girilen karakteri yazdırın
         */

        for (int i = 0; i < 10; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("lütfen bir karakter giriniz: ");
            char krk = scanner.next().charAt(0);

            if ('a' <= krk && 'z' >= krk) {
                System.out.println(Character.toUpperCase(krk));
            } else {
                System.out.println(krk);
            }
        }

    }
}
