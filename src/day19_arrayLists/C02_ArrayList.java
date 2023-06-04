package day19_arrayLists;

import day17_arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**        List<String> harfler = new ArrayList<>(); // bos bir list olusturur
 *         List<String> harfler = {""böyle","tanımlanmaz"}; //array tanımlama ile karıştırma böyle kullanılmaz
 *            harfler.add("eklenecekString"); // element ekler.
 *
 */
public class C02_ArrayList {

    public static void main(String[] args) {

        /*
            ArrayList, uzunlugu esnek bir listedir
            Array altyapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir --> arr[0], arr[1] ArrayList'de yok!!

            ArrayList'in tek dezavantaji var
            o da elementleri tek tek eklememiz gerekmesi
         */


        //önce eski yazdığımız yöntemi hatırlayalım --> yaklaşık olarak Araylist gibi çalışıyor.
        int[] arr ={3,4};
        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,5);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5]

        arr = C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,15);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 15]

                /*
                    List<String> harfler ={"böyle","tanımlama","yapılmaz","mutlaka","boş oluşturulur!!!" };
                    List<String> harfler = new ArrayList<>(); --> doğrusu bu!!
                */

        List<String> harfler = new ArrayList<>(); // bos bir list olusturur

        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // [s, l, a]


    }
}
