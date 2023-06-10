package day26_localTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/*
DateTimeFormatter.ofPattern("EEEE hh:mm a").withLocale(Locale.ENGLISH);
 */
public class C05_DateTimeFormatter {
    public static void main(String[] args) {
        /* Java  tarih ve zamani kendi formatinda olusturur
            Ancak bizim istedigimiz formata uygun olarak cevirmemize veya
            yazdirmamiza izin verir

            format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati
		 a yazarsak AM veya PM degerini yazar

         */

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-06-10T11:19:20.459901700

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d / MMM / yyyy");

        System.out.println(ldt.format(dtf)); // 10 / Haz / 2023

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yy");

        System.out.println(ldt.format(dtf2)); //  10.06.23

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE HH:mm"); //

        System.out.println(ldt.format(dtf3)); // Cumartesi 11:19

        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("EEEE hh:mm a");

        System.out.println(ldt.format(dtf4)); // Cumartesi 11:19 ÖÖ

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("EEEE hh:mm a").withLocale(Locale.ENGLISH);

        System.out.println(ldt.format(dtf5)); // Saturday 11:19 AM




    }
}
