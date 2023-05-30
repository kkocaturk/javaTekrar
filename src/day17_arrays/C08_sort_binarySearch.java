package day17_arrays;

import java.util.Arrays;

public class C08_sort_binarySearch {
    public static void main(String[] args) {

        // Verilen bir array'i natural order'a gore siralamak icin
        // Arrays.sort() kullanilir

        int[] arr1= {3,9,6,1,7};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"Hasan","Huseyin","Mehmet","Ali","Mesut","Mercan","ali"};
       // [Ali, Hasan, Huseyin, Mehmet, Mercan, Mesut, ali] / önce büyük harf sonra küçük harfler a ASCI değeri A dan büyük yani sonra gelir.

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // sort yapildiktan sonra
        // array'de bir elementin var oldugunu kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr2, "ali")); // 6
    }
}
