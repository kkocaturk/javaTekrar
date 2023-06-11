package day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 0

        sb1.append("Mustafa");

        System.out.println(sb1.capacity()); // 16
        System.out.println(sb1.length()); // 7

        sb1.append(" Yilmazturk");
        System.out.println(sb1.length()); //18 karakter
        System.out.println(sb1.capacity()); // 34 = 2 * eski capacity + 2
        System.out.println(sb1.length()); // 18

        sb1.append(" javayi cok sever, sabah aksam Java calisir.");
        System.out.println(sb1.capacity()); // 70 = 2 * 34 + 2
        System.out.println(sb1.length()); // 62


        // 2.yontem
        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb2.capacity()); // 27
        System.out.println(sb2.length()); // 11


        // 3.yontem

        StringBuilder sb3 = new StringBuilder(11);
        sb3.append("54464473321");
        System.out.println(sb3.capacity()); // 11
        System.out.println(sb3.length()); // 11

        sb3.append(" : Tc No");
        System.out.println(sb3); // 54464473321 : Tc No
        System.out.println(sb3.capacity()); // 11 * 2 + 2 = 24
        System.out.println(sb3.length()); // 19

        String str = "Java Candir";

        sb3.append(str,4,str.length());

        System.out.println(sb3); // 54464473321 : Tc No Candir

        // trim :

        sb3.trimToSize();
        System.out.println(sb3.capacity()); // 26
        System.out.println(sb3.length()); // 26




    }
}
/*
Bu program, StringBuilder sınıfının bazı özelliklerini ve işlevlerini göstermektedir.
İşlevleri açıkladığımızda:

sb1 adında bir StringBuilder nesnesi oluşturulur.

sb1.capacity() metodu 16 döndürür çünkü varsayılan başlangıç kapasitesi 16'dır.
sb1.length() metodu 0 döndürür çünkü başlangıçta hiç karakter eklenmemiştir.
sb1'e "Mustafa" eklenir.

sb1.capacity() metodu yine 16 döndürür çünkü kapasite otomatik olarak genişletilmez.
sb1.length() metodu 7 döndürür çünkü "Mustafa" 7 karakter içerir.
sb1'e " Yilmazturk" eklenir.

sb1.length() metodu 18 döndürür çünkü "Mustafa Yilmazturk" 18 karakter içerir.
sb1.capacity() metodu 34 döndürür çünkü yeni kapasite eski kapasitenin iki katı artı iki olur.
sb1'e " javayi cok sever, sabah aksam Java calisir." eklenir.

sb1.capacity() metodu 70 döndürür çünkü yeni kapasite eski kapasitenin iki katı artı iki olur.
sb1.length() metodu 62 döndürür çünkü tüm eklenen metin toplamda 62 karakter içerir.
sb2 adında başlangıç değeri "Java Candir" olan bir StringBuilder nesnesi oluşturulur.

sb2.capacity() metodu 27 döndürür çünkü başlangıç metni 11 karakter içerir ve başlangıç kapasitesi 27'dir.
sb3 adında başlangıç kapasitesi 11 olan bir StringBuilder nesnesi oluşturulur.

sb3.capacity() metodu 11 döndürür çünkü başlangıç kapasitesi belirtilmiştir.
sb3.length() metodu 11 döndürür çünkü "54464473321" 11 karakter içerir.
sb3'e " : Tc No" eklenir.

sb3.capacity() metodu 24 döndürür çünkü yeni kapasite, eski kapasitenin iki katı artı iki olur.
sb3.length() metodu 19 döndürür çünkü metin toplamda 19 karakter içerir.
str değişkeni "Java Candir" olarak tanımlanır.

sb3.append(str, 4, str.length()) ifadesi ile str'nin 4. karakterinden sonuna kadar olan bölümü sb3'e eklenir.
sb3'ün son hali "54464473321
 */