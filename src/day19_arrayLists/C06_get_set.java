package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

/**
 * List<Integer> sayilar = new ArrayList<>(); içinde get() ve set() kullanımı
 *
 *  System.out.println(sayilar.get(0)); // 3
 *  System.out.println(sayilar.set(2, 12)); // 2 --> [3, 5, 2]idi 2. index'i 12 yaptık [3, 5, 12] oldu. değiştirdiği 2. indexteki değer olan 2'yi döner
 */

public class C06_get_set {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        System.out.println(sayilar.get(0)); // 3

        // son elementi yazdirin

        System.out.println(sayilar.get(sayilar.size() - 1)); // 2

        // 2 elementini 12 yapin

        System.out.println(sayilar.set(2, 12)); // 2

        // 5'i 7 yapalim

        System.out.println(sayilar.set(1, 7)); // 5

        System.out.println(sayilar); // [3, 7, 12]


    }
}
