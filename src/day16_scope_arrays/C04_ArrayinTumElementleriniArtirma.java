package day16_scope_arrays;

import java.util.Arrays;

public class C04_ArrayinTumElementleriniArtirma {
    public static void main(String[] args) {
        int[] fiyatlar={15,25,30,10,50};
        System.out.println("Arrays.toString(fiyatlar) = " + Arrays.toString(fiyatlar));

        //tüm ürünlere 3 lira fiyat düzenlemesi yapın.

        for (int i = 0; i < fiyatlar.length; i++) {
            fiyatlar[i] +=3;
        }
        System.out.println("Arrays.toString(fiyatlar) = " + Arrays.toString(fiyatlar));
        Arrays.sort(fiyatlar);
        System.out.println("Arrays.toString(fiyatlar) = " + Arrays.toString(fiyatlar));
    }
}
