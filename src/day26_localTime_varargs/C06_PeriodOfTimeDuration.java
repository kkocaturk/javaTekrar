package day26_localTime_varargs;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;


public class C06_PeriodOfTimeDuration {
    public static void main(String[] args) throws InterruptedException {


        LocalTime localTime = LocalTime.now();
         Thread.sleep(2000,999999); //metotda 999999 alır en fazla
        LocalTime localTimeSonraki = LocalTime.now();


        Duration duration = Duration.between(localTime, localTimeSonraki);
        long seconds = duration.getSeconds();
        System.out.println("Geçen süre (saniye): " + seconds);


        LocalDateTime localDateTime = LocalDateTime.now();
        Thread.sleep(3000,2);
        LocalDateTime localDateTimeSonraki = LocalDateTime.now();


        Period period = Period.between(localDateTime.toLocalDate(), localDateTimeSonraki.toLocalDate());
        int days = period.getDays();
        System.out.println("Geçen gün sayısı: " + days);
    }


}
/*
İki süre arasındaki zaman farkını hesaplamak için Duration sınıfını kullanabilirsiniz.
LocalTime sınıfı sadece saat, dakika ve saniyeleri temsil ettiği için,
Duration sınıfı zaman aralığındaki farkı hesaplamak için daha uygun bir seçenektir.


13-15 arası

    Yukarıdaki kodda, Duration.between() yöntemiyle localTime ve localTimeSonraki arasındaki fark hesaplanır.
    Ardından, getSeconds() yöntemiyle sürenin saniye cinsinden değerini alabilirsiniz.
    Bu değeri istediğiniz şekilde kullanabilir veya yazdırabilirsiniz.

18-20 arası

    Alternatif olarak, Period sınıfını kullanarak iki tarih arasındaki farkı hesaplayabilirsiniz.
    Ancak, Period sınıfı yıl, ay ve gün gibi tarih temelli farkları temsil ederken, saat, dakika ve saniyeleri kapsamaz.
    Dolayısıyla, LocalTime nesneleriyle kullanmak yerine LocalDateTime nesneleriyle kullanmanız gerekebilir.
    Örnek bir kod parçası aşağıda verilmiştir:

23-25 arası 28-30 arası


Yukarıdaki kodda, Period.between() yöntemiyle localDateTime ve localDateTimeSonraki arasındaki fark hesaplanır.
 toLocalDate() yöntemiyle tarih kısımlarına dönüş yaparak farkın gün cinsinden değerini elde edebilirsiniz.
  Bu değeri kullanabilir veya yazdırabilirsiniz.
 */