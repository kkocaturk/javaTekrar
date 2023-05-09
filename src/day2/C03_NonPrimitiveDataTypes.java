package day2;

import java.util.Locale;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {


        String str="Java candır";
        int sayi=10;
        //primitve data türlerinin hazır metotları yoktur.
        //non-primitve data türlerinin önceden hazırlanmış bizim kullanacağımız metotları olur.

        System.out.println(sayi); //10
        System.out.println(str.toLowerCase()); //java candır
        System.out.println(str); //Java candır
        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println("str.isBlank() = " + str.isBlank());
        System.out.println("str.isEmpty() = " + str.isEmpty());


    }
}
