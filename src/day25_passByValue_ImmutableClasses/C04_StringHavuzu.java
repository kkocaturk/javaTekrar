package day25_passByValue_ImmutableClasses;

public class C04_StringHavuzu {

    public static void main(String[] args) {

        String str1= "Java";
        String str2= "Java";
        String str3= new String("Java");
        String str4= "Ja" + "va"; // Java
        String s   = "Ja";
        String t   = "va";
        String str5= s.concat(t); // Java

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true

        System.out.println("=========");

        System.out.println(str1 == str2 ); // true
        System.out.println(str1 == str3 ); // false
        System.out.println(str1 == str4 ); // true
        System.out.println(str1 == str5 ); // false

        System.out.println(str1=="Java"); // true

        /*
            == hem referansi, hem de degeri karsilastirir
            equals() ise sadece degerleri karsilastirir

            eger String havuzunda olup, hem referansi hem degeri ayni olan String'ler
            == ile karsilastirilirlarsa sonuc TRUE olur

            ancak new keyword kullanilarak olusturulan veya method kullanilan String'ler
            == ile karsilastirilirlarsa sonuc FALSE olur
         */

    }
}
/*
Bu program, String veri türünün == ve equals() operatörlerinin nasıl çalıştığını göstermektedir.

Öncelikle, str1, str2, str3, str4 ve str5 adında beş farklı String değişkeni tanımlanmıştır.

str1 ve str2 direkt olarak "Java" metnini içerirken, str3 new String("Java") şeklinde tanımlanmıştır.
str4, "Ja" + "va" ifadesi ile derleme zamanında "Java" olarak birleştirilirken,
s ve t değişkenleri ayrı ayrı "Ja" ve "va" değerlerini içerir ve str5 bu değerlerin concat() metoduyla birleştirilmesiyle elde edilir.

equals() metodunun kullanımıyla str1 ile diğer değişkenlerin karşılaştırılması yapılmıştır.
equals() metodu, String nesnelerinin değerlerini karşılaştırır. Dolayısıyla, tüm karşılaştırmalar true değerini verir.

Daha sonra, == operatörünün kullanımıyla aynı değişkenlerin karşılaştırılması yapılmıştır.
== operatörü, hem referansları hem de değerleri karşılaştırır. Bu durumda, str1 ve str2 aynı metni içerdiği için true döndürürken,
str3 ve str5 yeni String nesneleri olduğu için false döndürür.
str4, derleme zamanında "Java" olarak birleştirildiği için str1 ile aynı metni içerir ve referansları da aynı olduğu için true döndürür.

Son olarak, "Java" metnini doğrudan içeren bir String ile str1'i == ile karşılaştırıldığında true döner.

Bu örnekte, == operatörü hem referansları hem de değerleri karşılaştırdığı için bazı durumlarda beklenmedik sonuçlar verebilir.
Bu nedenle, String nesnelerini karşılaştırmak için equals() metodu kullanılması genellikle daha güvenlidir.



-- User
str5 neden yeni bir nesne oluşturur

--ChatGPT
str5 değişkeni, s.concat(t) ifadesiyle "Java" metnini oluşturur.
Ancak concat() metodu, birleştirilen metinleri yeni bir String nesnesi olarak döndürür.
Bu nedenle, s.concat(t) ifadesi çalıştığında, str5 referansı, "Java" metnini içeren yeni bir String nesnesine atanır.

Bu durum, String sınıfının immutable (değiştirilemez) olmasından kaynaklanır.
Immutable sınıflar, bir kez oluşturulduktan sonra içerikleri değiştirilemez.
Yani, String nesneleri üzerinde gerçekleştirilen herhangi bir değişiklik, yeni bir String nesnesi oluşturulmasını gerektirir.
Bu nedenle, concat() metodu kullanıldığında, mevcut s ve t metinleri birleştirilerek yeni bir String nesnesi oluşturulur ve str5 bu yeni nesneye atılır.

Bu davranış, String sınıfının performans ve güvenlik açısından avantajlar sağlar.
Immutable olmaları sayesinde String nesneleri paylaşılabilir, eşzamanlı kullanıma uygun hale gelir ve güvenli bir şekilde paylaşılabilirler.
Ayrıca, immutable nesnelerin değiştirilemezliği sayesinde daha öngörülebilir bir davranışa sahiptirler.
 */