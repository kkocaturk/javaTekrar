package day2_dataTurleri_Scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        /*
      kullanıcıdan 1 double 1 int alıp toplamını ve çarpımını yazdırın

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("double gir");
        double girilenDouble = scanner.nextDouble();

        System.out.println("int gir");
        int girilenInt = scanner.nextInt();

        System.out.println("sayıların toplamı: " + (girilenInt + girilenDouble)  //paranteze almazsak String oalrak düşünüyor.
                          +  "\nsayıların çarpımı: " + (girilenInt * girilenDouble));


    }
}
