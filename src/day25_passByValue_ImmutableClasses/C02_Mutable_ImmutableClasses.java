package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses { //mutable -> kararsız, değişken    immutable -> sabit, değişmez

    public static void main(String[] args) {

        /*
            String ve Wrapper class'lar immutable olduklari icin degistirilemezler
            Ancak Array ve List mutable olduklari icin
            atama yapmasak da method kullaninca degerleri degisir.
         */

        String str= "Java gun gectikce daha da keyifli oluyor";

        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();

        System.out.println(str); // Java gun gectikce daha da keyifli oluyor


        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(5);
        sayilar.add(8);

        System.out.println(sayilar); // [5, 8]

        sayilar.set(0,7);
        sayilar.remove(1);

        System.out.println(sayilar); // [7]
    }
}
/*
Bu program, Java'da değiştirilebilir (mutable) ve değiştirilemez (immutable) sınıflar arasındaki farkı göstermektedir.

Programın başında, bir String ve bir ArrayList oluşturulur.
String sınıfı, değiştirilemez bir sınıftır, yani bir kez oluşturulduğunda içeriği değiştirilemez.
Bu nedenle, str değişkeninin üzerinde yapılan değişiklikler aslında yeni bir String nesnesi döndürür ve orijinal str değişmez.
Örneğin, str.substring(5) ifadesi, 5. karakterden başlayan bir alt dize döndürür, ancak orijinal str değişmez.
Benzer şekilde, str.startsWith("Java") ifadesi, str'nin "Java" ile başlayıp başlamadığını kontrol eder, ancak yine de orijinal str değişmez.


Ancak, ArrayList sınıfı değiştirilebilir bir sınıftır.
Bu nedenle, sayilar listesine yapılan değişiklikler doğrudan orijinal listeyi etkiler.
Örneğin, sayilar.set(0,7) ifadesi, listenin ilk elemanını 7 olarak değiştirir.
Benzer şekilde, sayilar.remove(1) ifadesi, listedeki ikinci elemanı kaldırır.
Bu değişiklikler, orijinal sayilar listesini etkiler ve sonuç olarak listeyi şu şekilde günceller: [7].

Bu program, değiştirilebilir ve değiştirilemez sınıflar arasındaki farkı göstermektedir.
Değiştirilemez sınıflar (ör. String, Integer, Boolean gibi Wrapper sınıflar) bir kez oluşturulduktan sonra değiştirilemezler.
Değiştirilebilir sınıflar (ör. ArrayList, StringBuilder gibi) ise içeriklerini değiştirebilirler.

 */