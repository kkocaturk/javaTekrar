package day25_passByValue_ImmutableClasses;

public class C03_ImmutableClasses {
    public static void main(String[] args) {
        /*
            Java'da bir class ve oclass'dan olusturulan objeler
            ya mutable'dir, ya da immutable'dir.

            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur
            String  --- immutable
            StringBuilder --- mutable
            StringBuffer --- mutable

            immutable bir class'dan olusturulan objeler de immutable'dir
            String immutable oldugundan
            ayni str objesine yeni deger atandiginda Java eski degeri DEGISTIREMEZ
            bunun yerine istenen yeni degere sahip yeni bir obje olusturur
            ve str 'in pointer'ini yeni objeye yoneltir.

            kullanilmayan eski objeler
            Garbage Collector tarafindan toplanmak uzere beklerler
         */

        String str = "Java candir";

        str = str.toLowerCase();

        System.out.println(str); // java candir

        str= str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        // Asagidaki kod calistiginda
        // Java kac obje olusturur ?

        String s = "Hava";

        for (int i = 0; i <100 ; i++) {
            s= s + ".";
        }

        System.out.println(s);
    }
}
/*
Bu program, Java'da immutable (değiştirilemez) ve mutable (değiştirilebilir) sınıflar arasındaki farkı göstermektedir
ve özellikle String, StringBuilder ve StringBuffer sınıflarını ele almaktadır.


İlk olarak, programda String sınıfı kullanılarak str adında bir değişken oluşturulur ve "Java candir" metnini içerir.
String sınıfı immutable olduğundan, mevcut bir String nesnesine yeni bir değer atandığında, Java eski değeri değiştiremez.
Bunun yerine, istenen yeni değere sahip yeni bir String nesnesi oluşturulur ve str değişkeni bu yeni nesneye yönlendirilir.
Bu nedenle, str.toLowerCase() ifadesi, str'nin küçük harfli bir kopyasını döndürür ve orijinal str değişmez.
Aynı şekilde, str.toUpperCase() ifadesi de str'nin büyük harfli bir kopyasını döndürür ve orijinal str değişmez.


Daha sonra, String sınıfının farklı bir örneği olan s adında bir değişken oluşturulur ve "Hava" metnini içerir.
Ardından, bir döngü yardımıyla bu metnin sonuna "." karakterini eklenir.
Ancak, her bir ekleme işlemi, bir immutable String nesnesinin kopyasını oluşturur ve bu nedenle bellekte yeni bir String nesnesi yaratılır.
Bu, her döngü adımında yeni bir String nesnesi oluşturulduğu anlamına gelir. Sonuç olarak, döngü tamamlandığında toplamda 101 adet String nesnesi oluşur.
Bu durumda, s değişkeni en son döngü adımındaki değeriyle güncellenir ve sonucunda "Hava.........." metnini içerir.

Bu örnek, String sınıfının immutable olduğunu ve her değişikliğin yeni bir String nesnesi oluşturduğunu göstermektedir.
Bu, bellek kullanımı ve performans açısından dikkate alınması gereken bir durumdur.
Bu nedenle, metinsel ifadeler üzerinde sık sık değişiklik yapmanız gerekiyorsa,
StringBuilder veya StringBuffer sınıflarını tercih etmek daha verimli olabilir,
çünkü bunlar mutable (değiştirilebilir) sınıflardır ve mevcut nesneleri değiştirirler, yeni nesneler oluşturmak yerine.

 */