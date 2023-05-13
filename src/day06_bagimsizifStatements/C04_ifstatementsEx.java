package day06_bagimsizifStatements;

import java.util.Scanner;

public class C04_ifstatementsEx {
    public static void main(String[] args) {
        //kullanıcıdan not alın 50den büyükse "Sınıfı geçtin"
        //50'den küçükse "Maalesef kaldın"
        /*
        if bloğu bir satırsa {} ---> kullanılmasa da olur.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("notu giriniz: ");

        double not = scanner.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("Sınıfı geçtin");
        }
        if (not < 50 && not >= 0) {
            System.out.println("maalesef kaldın");
        }
    }
}
