package day24_staticKeyword;

import java.util.Arrays;

public class C03_PassByValue {

    public static void main(String[] args) {

        int[] arr = {3,4,5};

        elementleriArtir(arr,4); // [7, 8, 9]

        System.out.println("Method call'dan sonra arr : " + Arrays.toString(arr)); // [7, 8, 9]

    }

    public static void elementleriArtir(int[] arr , int artisMiktari){


        for (int i = 0; i < arr.length; i++) {

            arr[i] += artisMiktari;
        }

        System.out.println("method'da array : " + Arrays.toString(arr));
    }
}
/*
atama yapmadığı halde neden arr değeri main metodda güncellendi?

ChatGPT

Bu durum, Java'da dizilerin ve nesnelerin referans türleri olduğu için gerçekleşir.
Java'da parametreler değeri kopyalamak yerine referansı kopyalar.
Bu nedenle, metoda geçirilen dizi, aynı referansı paylaşır ve dolayısıyla metod içinde yapılan değişiklikler orijinal diziyi etkiler.

Yani, elementleriArtir metodu, arr adlı bir dizi referansını ve artisMiktari adlı bir tamsayıyı parametre olarak alır.
Bu metot, arr dizisinin elemanlarını dolaşarak her bir elemanı artisMiktari kadar artırır.
Bu işlem, orijinal diziyi etkiler çünkü aynı dizi referansı paylaşılır.

Java'da diziler ve nesneler "pass-by-value" olarak geçirilir.
Ancak, bu "pass-by-value" referansı kopyalama anlamına gelir.
Yani, metoda geçirilen değer, kopyalanır ve bu kopya referansı üzerinden orijinal nesneye erişilir.
Bu nedenle, metot içinde yapılan değişiklikler, referansın işaret ettiği nesneyi etkiler.

Bu programdaki durumda, elementleriArtir metodu orijinal diziyi alır,
bu dizinin elemanlarını değiştirir ve bu değişiklikler orijinal diziyi etkiler.
Dolayısıyla, main metodu içinde, metottan sonra dizinin güncellenmiş değerini gösteren
System.out.println ifadesi kullanılarak bu değişiklikler görüntülenir.
 */