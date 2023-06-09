package day24_staticKeyword;

/*
pass by value konusunu java da anlatır mısın?
ChatGPT
Tabii ki! Java'da parametrelerin geçişi "pass-by-value" olarak gerçekleşir.
Bu kavramı anlamak için şu adımları takip edebiliriz:

A- Java'da veri tipleri ikiye ayrılır: değer tipleri (primitive types) ve referans tipleri (reference types).

    1- Değer tipleri (int, float, boolean vb.), gerçek değerleri içeren ve doğrudan bellekte depolanan verilerdir.
    Bir değer tipi değişkeni, gerçek değerini taşır.

    2- Referans tipleri (dizi, nesne vb.), değerin kendisi yerine bellekteki bir konumu (adresi) içeren verilerdir.
    Referans tipleri, bellekteki bir nesnenin yerini işaret eder.

B- Bir metodun çağrılması sırasında, metodun parametre listesindeki değişkenler, değer tipleri olsalar bile değerleri kopyalanarak geçirilir.
Bu, kopyalanan değerin orijinal değişkeni etkilemeyeceği anlamına gelir.

C- Referans tipleri için ise, değerin kendisi kopyalanmaz.
Bunun yerine, referansın kendisi kopyalanır ve bu kopya referans üzerinden orijinal nesneye erişim sağlanır.

D- Bu durumda, orijinal referans ve kopya referans, aynı nesneyi işaret eder.
Bu nedenle, metot içinde yapılan değişiklikler, aynı bellek konumunu paylaşan nesneyi etkiler.
 */
public class C021_PassByValue {
    public static void main(String[] args) {
        int x = 5;
        updateValue(x);
        System.out.println("x after method call: " + x);

        int[] arr = {1, 2, 3};
        updateArray(arr);
        System.out.println("arr[0] after method call: " + arr[0]);
    }

    public static void updateValue(int value) {
        value = 10;
    }

    public static void updateArray(int[] array) {
        array[0] = 10;
    }
}
/*
Bu örnekte, updateValue metodu değer tipi bir değişken olan value parametresini alır.
value parametresi, metot içinde 10 değeri ile güncellenir.
Ancak, main metodu içindeki x değişkeni değişmez ve çıktı olarak x after method call: 5 verir.


Öte yandan, updateArray metodu referans tipi bir dizi olan array parametresini alır.
array parametresi, metot içinde indeks 0'daki elemanı 10 olarak günceller.
Bu durumda, main metodu içindeki arr dizisi değişir ve çıktı olarak arr[0] after method call: 10 verir.


Bu örnekler, değer tiplerinin kopyalandığını ve orijinal değişkeni etkilemediğini,
ancak referans tiplerinin referansın kopyalandığını
ve orijinal nesneye erişimi sağladığını gösterir.

Bu yüzden Java'da, aslında değerler değil, referanslar kopyalanır
ve bu nedenle bazen "pass-by-value" ifadesinin "pass-by-reference" olarak algılanabileceği bir durum ortaya çıkar.
Ancak, Java'da parametrelerin geçişi "pass-by-value" olarak kabul edilir.

 */