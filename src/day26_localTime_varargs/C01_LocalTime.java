package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(14,15);
        System.out.println(saat1); //  14:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 10:59:02.991575200

        // LocalTime objesi olan saat variable'i canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour()); // 10
        // get method'lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));  //13:09:02.991575200

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); //10:48:52.991575200

        System.out.println(saat.withSecond(10).withNano(20));  //10:59:10.000000020

        System.out.println(saat.compareTo(saat1)); // ayni ise 0 doner değilse -1 döner

        System.out.println(saat.isAfter(saat1)); // false
        System.out.println(saat.isBefore(saat1)); // true

        System.out.println(saat.toSecondOfDay()); // 39542

    }
}
/*
Kodun içindeki "main" metodu, programın çalıştırılabilir bölümünü temsil eder.
İlk olarak, "LocalTime.of(14,15)" ifadesi kullanılarak 14:15'i temsil eden bir "LocalTime" nesnesi olan "saat1" oluşturulur ve ekrana yazdırılır.

Daha sonra, "LocalTime.now()" ifadesi kullanılarak mevcut yerel saat ve zaman bilgisini temsil eden bir "LocalTime" nesnesi olan "saat" oluşturulur
ve ekrana yazdırılır. Örneğin, çıktı olarak "10:59:02.991575200" gibi bir saat değeri alabilirsiniz.

Kodun devamında, "saat" nesnesinin "getHour()" metodu kullanılarak saat değeri elde edilir ve ekrana yazdırılır.
Örneğin, çıktı olarak "10" gibi bir değer alabilirsiniz.
Benzer şekilde, "getMinute()", "getSecond()" ve "getNano()" gibi metodlar da kullanılabilir.

"saat.plusHours(2).plusMinutes(10)" ifadesiyle, "saat" nesnesine 2 saat ve 10 dakika eklenerek
yeni bir "LocalTime" nesnesi oluşturulur ve ekrana yazdırılır.
Bu durumda, çıktı olarak "13:09:02.991575200" gibi bir saat değeri alabilirsiniz.

"saat.minusMinutes(10).minusSeconds(10)" ifadesiyle, "saat" nesnesinden 10 dakika ve 10 saniye çıkarılarak yeni bir "LocalTime" nesnesi oluşturulur
ve ekrana yazdırılır. Bu durumda, çıktı olarak "10:48:52.991575200" gibi bir saat değeri alabilirsiniz.

"saat.withSecond(10).withNano(20)" ifadesiyle, "saat" nesnesinin saniye değeri 10 ve nanosaniye değeri 20 olarak değiştirilerek
yeni bir "LocalTime" nesnesi oluşturulur ve ekrana yazdırılır. Bu durumda, çıktı olarak "10:59:10.000000020" gibi bir saat değeri alabilirsiniz.

"saat.compareTo(saat1)" ifadesiyle, "saat" ve "saat1" nesneleri karşılaştırılır.
Eğer iki nesne birbirine eşitse 0, "saat" nesnesi "saat1" nesnesinden sonra ise pozitif bir değer,
"saat" nesnesi "saat1" nesnesinden önce ise negatif bir değer döner. Bu durumda, çıktı olarak "-1" alabilirsiniz
 */