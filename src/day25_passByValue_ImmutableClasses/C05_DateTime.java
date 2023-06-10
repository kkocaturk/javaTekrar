package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;
/*
 bu kod parçası mevcut saat ve zaman bilgisini alır,
 1'den 10.000'e kadar olan sayıları toplar
 ve bu işlemin süresini nanosaniye cinsinden hesaplar.
 Bir saniyede 1.000.000 nanosaniye bulunur.
 saniye altı işlemler için kullanmalı
 */

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 21:06:46.104554

        System.out.println(saat.getNano()); // 104554000


        // bir loop ile 1'den 10bin'e kadar olan sayilari toplayin
        // ve bu islemin kac nanosaniye surdugunu bulun

        long toplam=0;

        int basSuresiNano= saat.getNano();

        for (long i = 1; i <=10000 ; i++) {

            toplam += i;
        }

        LocalTime saatSon= LocalTime.now();
        int bitSuresiNano= saatSon.getNano();

        System.out.println(saatSon);
        System.out.println("Islem suresi : " +(bitSuresiNano-basSuresiNano));
        System.out.println("Islem suresi : " + (bitSuresiNano-basSuresiNano)/1000000000.0);

    }
}
