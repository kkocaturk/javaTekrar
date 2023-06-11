package day27_stringBuilder;

public class C05_stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.delete(4, 5)); // JavaCandir

        System.out.println(sb1); // JavaCandir

        System.out.println(sb1.deleteCharAt(9)); // JavaCandi

        System.out.println(sb1); // JavaCandi

        System.out.println(sb1.insert(9, "r")); // JavaCandir

        System.out.println(sb1); // JavaCandir

        sb1.insert(4," ");

        System.out.println(sb1); // Java Candir

        String str = " can bize gelecekmis";

        sb1.insert(11,str,0,5);

        System.out.println(sb1); // Java Candir can

        sb1.replace(12,15,"Can.");

        System.out.println(sb1); // Java Candir Can.

    }

}
/*
StringBuilder'ın append() ve insert() metotları arasındaki temel fark şudur:

append() metodu, StringBuilder nesnesinin sonuna verilen metni ekler.
insert() metodu ise, StringBuilder nesnesinin istenen bir konumuna verilen metni ekler.
Yani, append() metodu sona ekleme yaparken, insert() metodu ise istenen bir konuma (belirtilen indis değerine) ekleme yapar.
 */
/*

Yukarıdaki C05_stringBuilder sınıfında StringBuilder sınıfının delete(), deleteCharAt(), insert() ve replace() metodları kullanılmıştır.
 Aşağıda kod parçasının açıklamalarını bulabilirsiniz:

1 StringBuilder nesnesi sb1 oluşturulur ve başlangıç değeri "Java Candir" olarak atanır.
sb1.delete(4, 5) ifadesi, sb1'in 4. indexten (dahil) 5. indexe (hariç) kadar olan karakterleri siler ve sonucu döndürür.
Bu durumda, "C" karakteri silinir ve "JavaCandir" olarak görüntülenir.

2 System.out.println(sb1) ifadesiyle sb1'in güncellenmiş değeri ekrana yazdırılır.
 Sonuç olarak, "JavaCandir" olarak görüntülenir.

3 sb1.deleteCharAt(9) ifadesi, sb1'in 9. indexindeki karakteri siler ve sonucu döndürür.
 Bu durumda, "i" karakteri silinir ve "JavaCandi" olarak görüntülenir.

4 System.out.println(sb1) ifadesiyle sb1'in güncellenmiş değeri ekrana yazdırılır.
 Sonuç olarak, "JavaCandi" olarak görüntülenir.

5 sb1.insert(9, "r") ifadesi, sb1'in 9. indexine (konumuna) "r" karakterini ekler ve sonucu döndürür.
 Bu durumda, "r" karakteri "JavaCandir" metninin 9. indexine eklenir ve "JavaCandir" olarak görüntülenir.

6 System.out.println(sb1) ifadesiyle sb1'in güncellenmiş değeri ekrana yazdırılır.
 Sonuç olarak, "JavaCandir" olarak görüntülenir.

7 sb1.insert(4," ") ifadesiyle sb1'in 4. indexine (konumuna) bir boşluk karakteri eklenir.

8 System.out.println(sb1) ifadesiyle sb1'in güncellenmiş değeri ekrana yazdırılır.
 Sonuç olarak, "Java Candir" olarak görüntülenir.

9 String türünde str değişkeni oluşturulur ve değeri " can bize gelecekmis" olarak atanır.

10 sb1.insert(11,str,0,5) ifadesiyle sb1'in 11. indexine str'nin 0. indexten 5. indexe kadar olan alt dizisi eklenir.
 Bu durumda, " can" alt dizesi "Java Candir" metninin 11. indexine eklenir ve "Java Candir can" olarak görüntülenir.

11 System.out.println(sb1) ifadesiyle sb1'in güncellenmiş değeri ekrana yazdırılır. Sonuç olarak, "Java Candir can" olarak görüntülenir.

12 sb1.replace(12,15,"Can.") ifadesiyle sb1'in 12. indexten (dahil) 15. indexe (hariç) kadar olan karakterleri "Can." ile değiştirir.
 Bu durumda, " can" alt dizesi "Can." ile değiştirilir ve "Java Candir Can." olarak görüntülenir.

13 System.out.println(sb1) ifadesiyle sb1'in güncellenmiş değeri ekrana yazdırılır. Sonuç olarak, "Java Candir Can." olarak görüntülenir.

Bu örnekleme, StringBuilder'ın delete(), deleteCharAt(), insert() ve replace() metotlarının kullanımını göstermektedir.
 Bu metotlar, StringBuilder nesnesinin içeriğini değiştirmek için kullanılır.
 */