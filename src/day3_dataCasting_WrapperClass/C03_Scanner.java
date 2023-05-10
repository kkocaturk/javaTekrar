package day3_dataCasting_WrapperClass;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //İki sayının değerini değiştirmek için üçüncü bir değişken kullanmadan yapın
        //1.yol

        Scanner scanner=new Scanner(System.in);
        System.out.println("a sayısını girin: ");
        int a = scanner.nextInt();

        System.out.println("b sayısını girin: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //2.yol

    // binary sistemi ile yapar
        int xa = 10; // binary 1010
        int xb = 5; //          101
        /*
        ön bilgi XOR işlemi
        1 ^ 1 = 0
        0 ^ 0 = 0
        1 ^ 0 = 1
        0 ^ 1 = 1
         */

        xa = xa ^ xb; // 1010 ^ 101  --> xa = 1111
        xb = xa ^ xb; // 1111 ^ 101  --> xb = 1010
        xa = xa ^ xb; // 1111 ^ 1010 --> xa =  101

        System.out.println("xa: " + xa);
        System.out.println("xb: " + xb);

        //3. yol

        int xax = 10; // binary 1010
        int xbx = 5; //          101

        xbx ^= ( xax ^= xbx);
        xax ^= xbx;

        System.out.println("xax: " + xax);
        System.out.println("xbx: " + xbx);

    }
}
