package day06_bagimsizifStatements;

import java.util.Scanner;

public class C02_ifStatementsEx {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın 5'e bölünüyorsa 5'in katı yazın
        Scanner scanner = new Scanner(System.in);

        System.out.println("bir sayı girin");

        int gSayi = scanner.nextInt();

        if (gSayi % 5 == 0){
            System.out.println( gSayi + " sayı 5 'in katıdır.");
        }
        if (gSayi % 3 == 0){
            System.out.println( gSayi + " sayı 3 'in katıdır.");
        }
    }
}
