package day4_DataCasting_wrapperClass;

import java.sql.SQLOutput;

public class C04_DataCasting {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        System.out.println(a / b);  //  3,333333 olmasına rağmen Java'da 3 döner
        //Java bölünen iki sayi tamsayı ise sonucun da tamsayı kısmını verir.


        double c = 6;
        System.out.println(a / c); // 3.3333333333333335 döner double virgül sonra 16 hane yazdırır.

        //bölünen sayıların data türleri farklı ise sonucu daha geniş olanın cinsinden verir.
        // int/ double  ---> double olur.

        float d = 6f;
        System.out.println(a/d);//3.3333333  float virgül sonrası 7 hane yazdırır.

        // a/b işleminin sonucunu ondalıklı olarak nasıl yazdırabiliriz?

        System.out.println((double) (a/b) ); // 3.0
        //işlem önceliği parantez içinde
        //java önce (a/b)  işlemi yapar ve sonucu 3 bulur
        //sonra (double) olduğundan 3'ü double'a cast eder 3.0 bulur

        //bölme işleminin double olması için
        //işleme girenlerden birisi double olmalıdır.
        System.out.println(a/(double)b );  // 3.3333333333333335


    }
}
