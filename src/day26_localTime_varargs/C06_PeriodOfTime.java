package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1980,1,1);
        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P43Y5M9D

        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getYears()); // 43

        System.out.println("Yas : "+Period.between(dogumTarihi,bugun).getDays()); // 9

        LocalDate myBirthday = LocalDate.of(1989,4,22);

        System.out.println(Period.between(myBirthday,bugun)); //P34Y1M19D

        System.out.println("for me \n" +   " yıl : "+ Period.between(myBirthday,bugun).getYears() +
                                        " ay : "+ Period.between(myBirthday,bugun).getMonths() +
                                        " gün : "+ Period.between(myBirthday,bugun).getDays()
                            );


        LocalDate epoch=LocalDate.EPOCH;

        long epochDay=1250L;

        LocalDate epochDay1250sonrasiDate=LocalDate.ofEpochDay(epochDay);

        System.out.println(epochDay1250sonrasiDate); //1973-06-04
    }
}
/*
 "dogumTarihi" adında bir LocalDate nesnesi oluşturulur ve 1980-01-01 tarihini temsil eder.
 "bugun" adında bir LocalDate nesnesi oluşturulur ve bu nesne mevcut tarih değerini temsil eder.

"Period.between(dogumTarihi, bugun)" ifadesi, "dogumTarihi" ile "bugun" arasındaki farkı hesaplar ve bir Period nesnesi olarak döndürür.
Bu durumda, çıktı olarak "P43Y5M9D" şeklinde bir değer alırsınız.
"P" harfi "Period" anlamına gelirken,
"43Y" 43 yıl,
"5M" 5 ay ve
"9D" 9 günü temsil eder.

 "Period.between(dogumTarihi, bugun).getYears()" ifadesi, "dogumTarihi" ile "bugun" arasındaki farkın yıl cinsinden değerini döndürür.
  Bu durumda, çıktı olarak "43" şeklinde bir değer alırsınız.
  Benzer şekilde, "Period.between(dogumTarihi, bugun).getDays()" ifadesi, farkın gün cinsinden değerini döndürür
  ve çıktı olarak "9" şeklinde bir değer alırsınız.

Bu kod parçası, belirli bir tarih aralığında geçen süreyi hesaplamak için "Period" sınıfını kullanmayı
ve bu sürenin yıl, ay ve gün gibi bileşenlerini almayı göstermektedir.


Epoch açılışı, Unix işletim sistemlerinde kullanılan zaman ölçeğinin başlangıç noktasını temsil eder. Epoch açılışı, 1 Ocak 1970 tarihini ve saat dilimine göre 00:00:00 (UTC) zamanını ifade eder.

Unix işletim sistemleri, zamanı bu başlangıç noktasından itibaren saniye cinsinden hesaplar. Yani, Epoch açılışından önceki zamanlar negatif saniye değerleriyle ifade edilirken, Epoch açılışından sonraki zamanlar pozitif saniye değerleriyle ifade edilir.

Epoch açılışı, birçok programlama dilinde ve sistemde zamanı temsil etmek için kullanılan standart bir referans noktasıdır.
Örneğin, Java'da java.time paketi, Epoch açılışını temel alarak tarih ve zaman işlemlerini gerçekleştirir.
Epoch açılışı, zaman aralıklarını hesaplamak, tarihleri karşılaştırmak ve zaman damgaları oluşturmak için yaygın olarak kullanılan bir referans noktasıdır.
 */
