package day7_genelTekrarIfelseStatements;

import java.util.Scanner;

public class C07_IfelseIf_ArtikYil {
    static boolean isContinue = true;

    public static void main(String[] args) {
          /*
          kullanıcadan artık yıl olup olmadığını kontrol etmek için yıl girmesini isteyin
          Kural1: 4 ile bölünemeyen yıllar artık yıl değildir
          Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllara artık yıldır.
          kural3: 4^ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece 400'ün katı olan yıllar artık yıldır.
           */

        do {
            artikYil();
            System.out.println("yeni değer hesaplamak ister misiniz(E/H)");
            Scanner scanner = new Scanner(System.in);
            char decision = scanner.next().charAt(0);
            if ( decision =='E' || decision == 'e'){
                isContinue = true;
            }else{
                isContinue = false;
            }

        } while (isContinue == true);


    }

    private static void artikYil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yıl giriniz: ");
        int yil = scanner.nextInt();
        if ((yil % 4) != 0) {
            System.out.println(yil + " artık yıl değildir.");
        } else if ((yil % 100) != 0) {
            System.out.println(yil + " artık yıldır.");
        } else if ((yil % 400) == 0) {
            System.out.println(yil + " artık yıldır.");
        }else{
            System.out.println(yil + " artık yıl değildir..");
        }
    }

}
