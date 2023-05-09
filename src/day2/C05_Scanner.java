package day2;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini alın
        //girilen ismi büyük harfle yazdır
        //kullanıcıdan değer almak için 3 işlem gereklidir.
        //1. adım scanner objesi oluşturma
        Scanner scanner = new Scanner(System.in);

        //2.Kullanıcıya ne yapacağını söyleyin.

        System.out.println("isminizi giriniz: ");

        //3.adım kullanıcının gireceği değeri kaydedeceğiniz bir vairable oluşturun.
        //Scanner objesi ile ilgili method'u kullanarak kullanıcının girdiği değeri
        //oluşturduğunuz variable'a atayın.
        String girilenIsim = scanner.nextLine(); // bir kelime getirir. scanner.nextLine(); birden fazla kelime getirir.
        System.out.println(girilenIsim.toUpperCase());

    }
}
