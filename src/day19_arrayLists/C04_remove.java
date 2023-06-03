package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kerim
 *         List<String> harfler = new ArrayList<>(); için
*          Object parametresiyle .remove() metodu kullanılırsa true, false döner
 *          harfler.remove("B") -> ilk bulunan "B" String'ini siler.
 *         index parametresiyle .remove() metodu kullanılırsa silinen element  döner
 */
public class C04_remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A, B, K]

        //Object parametresiyle .remove() metodu kullanılırsa true, false döner
        System.out.println(harfler.remove("B")); // true

        System.out.println(harfler); // [A, K]

        //index parametresiyle .remove() metodu kullanılırsa silinen element  döner
        System.out.println(harfler.remove(0)); // A

        System.out.println(harfler); // [K]


        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar); // [1, 3, 18, 2]
        /*
            Eger sayilardan olusan bir list varsa
            remove method'una yazacagimiz sayiyi index olarak kabul eder

            sayilar.remove()-> Integer ArrayList'i için silmek için Object parametreli kullanmak için önce objeye atanır sonra işlem yapılır.

            Eger sayiyi silmek isterseniz
            remove method'undan once o sayiyi bir objeye atayip
            remove method'unda obje ismini yazabiliriz
         */

        sayilar.remove(1);
        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi = 1; //değişkene atanmalı!!!

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [18, 2]



    }
}
