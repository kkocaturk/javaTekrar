package day27_stringBuilder;

public class C04_StringBuilderdeStringMethodlari {

    public static void main(String[] args) {

        /*
            StringBuilder Class'inda olmayip,
            String Class'inda olan method'lari kullanmak istersek
            sb.toString() kullanarak, StringBuilder'i once String'e cevirir
            sonra istedigimiz String method'larini kullaniriz

            Bu konuda DIKKAT etmemiz gereken konu
            String donduren method'lar
            veya String Class'indan kullanacagimiz method'lar
            kalici degisiklik YAPMAZ
         */

        StringBuilder sb1= new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");

        sb1.substring(5);

        System.out.println(sb1); // Java Candir

        // sb1 = sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);

        System.out.println(sb1); // Java Candir



    }
}
/*
StringBuilder nesnesi üzerinde String metotlaryla işlem yapılmaz.
Kod olarak yazılırsa ignore eder.
StringBuilder önce String'e çevirmeli işlem yapılmalıdır.
Ancak unutulmamalıdır ki String üzerinde yapılan değişiklikler atanmadan string değer üzerine güncelleme yapmaz.

1 StringBuilder nesneleri sb1 ve sb2 oluşturulur ve başlangıç değerleri atanır.

2 sb1.substring(5) ifadesi, sb1'in 5. indexten sonraki alt dizisini elde eder.
 Ancak bu alt dizeyi yakalamadan doğrudan sb1'in değeri ekrana yazdırılır.
 Bu durumda, substring() metodu alt dizeyi döndürse de sb1'in değeri değişmeden "Java Candir" olarak görüntülenir.

3 System.out.println(sb1) ifadesiyle sb1'in değeri ekrana yazdırılır.
 Sonuç olarak, sb1'in değeri değişmeden "Java Candir" olarak görüntülenir.

4 sb1.compareTo(sb2) ifadesi, sb1 ve sb2'yi karşılaştırır ve sonuç olarak -32 döner.
 Bu, Unicode değerlerine dayalı olarak farklılık gösterir.

5 System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())) ifadesi, sb1 ve sb2'yi String'e dönüştürdükten sonra karşılaştırır ve sonuç olarak true döner.
 equalsIgnoreCase() metodu, büyük-küçük harf duyarsız karşılaştırma yapar.

6 sb1.subSequence(3, 6) ifadesiyle sb1 üzerinde 3. indexten başlayarak 6. indexe kadar olan karakterlerin alt dizisi elde edilir.
 Ancak bu alt dizeyi yakalamadan doğrudan sb1'in değeri ekrana yazdırılır.
 Bu durumda da subSequence() metodu alt dizeyi döndürse de sb1'in değeri değişmeden "Java Candir" olarak görüntülenir.

7 System.out.println(sb1) ifadesiyle sb1'in değeri ekrana yazdırılır.
 Sonuç olarak, sb1'in değeri değişmeden "Java Candir" olarak görüntülenir.

Bu örnekleme, StringBuilder nesnesi üzerinde String metotlarının doğrudan kullanılamayacağını ve önce StringBuilder'ı String'e dönüştürmemiz gerektiğini göstermektedir. Ancak, unutulmaması gereken önemli bir nokta, String üzerinde yapılan değişikliklerin doğrudan StringBuilder nesnesine atanmadan orijinal StringBuilder nesnesini değiştirmeyeceğidir
 */