package day4_DataCasting_wrapperClass;

import java.util.Scanner;

public class C02_ASCIITable {
    public static void main(String[] args) {
        // kullanıcıdan bir harf alın ve alfabede o harften sonraki üç harfi yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz: ");

        char girilenHarf = scanner.next().charAt(0);

       /*  ↓ böyle olmaz cast edilmeli
       System.out.println("girilen harf: " + girilenHarf +
                "\n Girilen harften sonraki 3 harf " +
                girilenHarf + 1 + ", " +
                girilenHarf + 2 + ", " +
                girilenHarf + 3  );
                */

        System.out.println("girilen harf: " + girilenHarf +
                "\n Girilen harften sonraki 3 harf " +
                (char)(girilenHarf + 1) + ", " +
                (char)(girilenHarf + 2) + ", " +
                (char)(girilenHarf + 3)  );
    }
}
