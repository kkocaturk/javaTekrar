package day2;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        /*
        Bir dikdörtgenin 2 kenar uzunluğunu alıp dikdörtgenin alanını yazdırın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdörtgenin iki kenarını sırayla girin");
        double birinciKenar = scanner.nextDouble();
        double ikinciKenar = scanner.nextDouble();

        System.out.println("dikdörtgenin alanı " + birinciKenar*ikinciKenar);

    }
}
