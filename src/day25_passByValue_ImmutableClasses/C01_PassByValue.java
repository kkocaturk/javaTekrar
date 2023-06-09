package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar); // [3, 4, 5]

        elementleriArtir(sayilar);
        // elementleri artir methodunu calistirdiktan sonra
        System.out.println("element artir methodundan sonra "+ sayilar);

        yeniListeAta(sayilar);
        System.out.println("Yeni liste ata method'undan sonra : " + sayilar);
    }

    public static void elementleriArtir(List<Integer> sayilar){
        // tum elementleri 2 katina cikaralim

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i, 2*sayilar.get(i));
        }
        System.out.println("elementleri artir methodunda :" + sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){

        // sayilar listesine yeni bir list degeri atayip
        // sonra 1,2,3 elementlerini ekleyin

        sayilar = new ArrayList<>();   //burası önemli referans'ı değişti!!

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni liste ata methodunda : " + sayilar);

    }
}



/*
Bu program, Java'da "pass-by-value" (değerle aktarma) kavramını göstermek için oluşturulmuştur. İki farklı metod kullanarak bu kavramı açıklamaktadır.


Programın başında, sayilar adında bir ArrayList oluşturulur ve içine bazı sayılar eklenir.
İlk olarak, elementleriArtir adında bir metod tanımlanır ve bu metod sayilar listesini parametre olarak alır.
Bu metod, listedeki her bir sayıyı 2 ile çarparak orijinal listeyi değiştirir. Bu değişiklikler ana metodun içinde de yansır
ve sonuç olarak orijinal liste şu şekilde güncellenir: [6, 8, 10].


İkinci metod olan yeniListeAta, sayilar listesine yeni bir ArrayList atar ve bu yeni liste içerisine 1, 2 ve 3 sayılarını ekler.
Ancak, bu metodun içinde yapılan değişiklikler yalnızca metot içinde geçerlidir.
Yani, yeniListeAta metodundan sonra ana metotta sayilar listesi aynı kalır ve değişmez: [6, 8, 10].

Bu durum, Java'nın "pass-by-value" yaklaşımını yansıtır.
Metodlara geçirilen değerler, aslında değerlerin kendisi değil, değerlerin bir kopyasıdır.
Dolayısıyla, metod içinde yapılan değişiklikler, sadece kopya üzerinde etkili olur ve orijinal değeri değiştirmez.
Ancak, referans tipleri (nesneler gibi) değer olarak geçirildiğinde, kopyalanan değer aslında bir referanstır.
Bu nedenle, referansın kendisi aynı kalır ve orijinal nesneye erişilebilir.
Bu durumda, sayilar listesi bir referans türü olduğu için metod içinde yapılan değişiklikler ana metotta da görülebilir.
Ancak, yeniListeAta metodunda yapılan yeni bir atama, orijinal referansı değiştirir
ve bu nedenle ana metodun dışında kalıcı bir etkisi olmaz.
 */

















