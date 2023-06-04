package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;
/**
@author kerim
- List<Integer> sayilar = new ArrayList<>(); tanımlama
- sayilar.add(3);
- sayilar.add(1,3);
- sayilar.addAll(ekler);
- sayilar.addAll(2,ekler);
@version 1.0
 */
public class C03_add {
    public static void main(String[] args) {
        /*
            List data turu olarak primitive kabul etmez
            List<int> sayilar2=new ArrayList<>(); // kullanılamaz! <Integer> olmalı
         */

        List<Integer> sayilar = new ArrayList<>();

        //elementler tek tek eklenir.
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        // 3 ile 5 arasina element olarak 7 ekleyin

        sayilar.add(1,7);

        System.out.println(sayilar); // [3, 7, 5, 2]

        List<Integer> ekler = new ArrayList<>();
        ekler.add(4);
        ekler.add(6);

        System.out.println(ekler); // [4, 6]

        sayilar.addAll(ekler);

        System.out.println(sayilar); // [3, 7, 5, 2, 4, 6]

        // 7 ile 5 arasina ekler'i ekleyin

        sayilar.addAll(2,ekler);

        System.out.println(sayilar); // [3, 7, 4, 6, 5, 2, 4, 6]

        System.out.println("-----benim örnekler↓↓↓--------");

        List<Integer> myArrayList=new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        System.out.println(myArrayList); //[1, 2, 3]


        myArrayList.add(1,10);
        myArrayList.add(2,20);
                // myArrayList.add(7,70); IndexOutOfBoundsException
        myArrayList.add(3,30);

        System.out.println(myArrayList);//[1, 10, 20, 30, 2, 3]

        //yeni myNewArrayList oluşturdum.

        List<Integer> myNewArrayList=new ArrayList<>();
        myNewArrayList.add(100);
        myNewArrayList.add(200);
        myNewArrayList.add(300);

        System.out.println(myNewArrayList); //[100, 200, 300]

        //myArrayList'e myNewArrayList ekleyeceğim

        myArrayList.addAll(myNewArrayList);
        System.out.println(myArrayList); //[1, 10, 20, 30, 2, 3, 100, 200, 300] --> sona ekledi

        //yeni arrayList
        List<Integer> lastArrayList=new ArrayList<>();
        lastArrayList.add(3000);
        lastArrayList.add(2000);
        lastArrayList.add(1000);
        lastArrayList.add(-1000);
        lastArrayList.add(-2000);
        System.out.println(lastArrayList); //[3000, 2000, 1000,-1000,-2000]

        //belirlenen index'e diğer bir List ekleme
        //lastArrayList'in 2. index'ine myArrayList'i ekle

        lastArrayList.addAll(2,myArrayList);
        System.out.println(lastArrayList); // [3000, 2000, 1, 10, 20, 30, 2, 3, 100, 200, 300, 1000, -1000, -2000]




    }
}
