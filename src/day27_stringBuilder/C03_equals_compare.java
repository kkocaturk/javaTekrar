package day27_stringBuilder;

public class C03_equals_compare {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        // System.out.println(sb1 == str);
        // Java'da farkli data turune sahip non-primitive objeler == ile KARSILASTIRILAMAZ

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1 == sb1); // true


        System.out.println(sb1.equals(sb2)); // false

        /* StringBuilder'da icerik ayni olsa bile equals method'u false doner
           Cunku StringBuilder Class'inda equals method'u yoktur
           equals method'unu parent class'i olan Object Class'indan kullanir
           ve bundan dolayi iceriklere bakmadan false verir
         */

        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true


        // iki StringBuilder'in iceriklerinin ayni oldugunu kontrol etmek icin
        // compareTo() kullanilir

        System.out.println(sb1.compareTo(sb2)); // 0
        // System.out.println(sb1.compareTo(str)); //CTE

        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4
        System.out.println(sb4.compareTo(sb3)); // -4


        /*
            CompareTo() karsilastirilan StringBuilder'lar ayni metne sahipse 0 doner
            Ayni degilse, bastan itibaren kontrole baslar
            farkli olan ilk harfin karsilastirilan kelimedeki ayni index'deki harften
            kac harf ilerde oldugunu dondurur
         */



    }
}
/*
Bu program, StringBuilder sınıfının equals() ve compareTo() metodlarını göstermektedir. İşlevleri açıkladığımızda:

1 sb1 ve sb2 adında iki ayrı StringBuilder nesnesi oluşturulur ve str adında bir String oluşturulur.

2 sb1 == sb2 ifadesi false döndürür çünkü == operatörü, referansları karşılaştırır
ve StringBuilder nesneleri farklı referanslara sahiptir.

3 sb1 == sb1 ifadesi true döndürür çünkü aynı StringBuilder nesnesini karşılaştırıyoruz.

4 sb1.equals(sb2) ifadesi false döndürür çünkü StringBuilder sınıfı, equals() metodu için kendi implementasyonunu sağlamaz
ve varsayılan olarak Object sınıfının equals() metodunu kullanır.
Bu nedenle, referansları karşılaştırır ve aynı olmadığı için false döner.

5 sb1.equals(str) ifadesi false döndürür çünkü StringBuilder ile String veri türleri karşılaştırılamaz.

6 sb1.equals(sb1) ifadesi true döndürür çünkü aynı StringBuilder nesnesini kendisiyle karşılaştırıyoruz.

7 sb1.compareTo(sb2) ifadesi 0 döndürür çünkü compareTo() metodu, StringBuilder nesnelerinin içeriklerini karşılaştırır
ve içerikleri aynı olduğu için 0 döner.

8 sb1.compareTo(sb3) ifadesi 2 döndürür çünkü ilk farklı karakter "v" ve "a"'dır
ve "v" harfi alfabede "a" harfinden 2 adım ileridedir.

9 sb1.compareTo(sb4) ifadesi 2 döndürür çünkü ilk farklı karakter "v" ve "r"'dır
ve "v" harfi alfabede "r" harfinden 2 adım ileridedir.

10 sb3.compareTo(sb4) ifadesi 4 döndürür çünkü ilk farklı karakter "v" ve "r"'dır
ve "v" harfi alfabede "r" harfinden 4 adım geridedir.

11 sb4.compareTo(sb3) ifadesi -4 döndürür çünkü ilk farklı karakter "r" ve "v"'dir
ve "r" harfi alfabede "v" harfinden 4 adım ileridedir.

Bu şekilde, equals() ve compareTo() metotlarını kullanarak
StringBuilder nesnelerinin karşılaştırma işlemlerini gerçekleştirebilirsiniz.

dikkat
System.out.println(sb1.compareTo(str)); //CTE
 neden CTE verir?

sb1.compareTo(str) ifadesi derleme zamanı hatası (CTE - Compile Time Error) verir
çünkü compareTo() metodunun parametre olarak StringBuilder nesnesi beklerken,
siz String tipinde bir nesneyi geçirmeye çalışıyorsunuz.
 */