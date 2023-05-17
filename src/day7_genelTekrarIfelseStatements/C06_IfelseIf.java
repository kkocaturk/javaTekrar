package day7_genelTekrarIfelseStatements;

import java.util.Scanner;

public class C06_IfelseIf {
    static boolean isContinue = true;

    public static void main(String[] args) {
        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.

         */

        do {
            kitleHesap();
            System.out.println("yeni değer hesaplamak ister misiniz(E/H)");
            Scanner scanner = new Scanner(System.in);
            char decision = scanner.next().charAt(0);
            if ( decision =='E' || decision == 'e'){
                isContinue = true;
            }else{
                isContinue = false;
            }

        } while (isContinue == true);

    }

    private static void kitleHesap() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Kg Giriniz : ");
        double kilo = scan.nextDouble();

        System.out.print("Lütfen Boyunuzu Cm Olarak Giriniz : ");
        double boy = scan.nextDouble();

        double kitleEndeksi = (kilo * 10000 / (boy * boy));
        System.out.println("Vücut Kitle Endeksiniz : " + kitleEndeksi);

        if (kilo <= 0 || boy <= 0 || boy > 300 || kilo > 500) {
            System.out.println("Yanlis giris yaptiniz, tekrar deneyin");
            kitleHesap();
        } else if (kitleEndeksi < 20) {
            System.out.println("zayif");
            isContinue = false;
        } else if (kitleEndeksi < 25) {
            System.out.println("Normal");
            isContinue = false;
        } else if (kitleEndeksi < 30) {
            System.out.println("Kilolu");
            isContinue = false;
        } else {
            System.out.println("Obez");
        }
    }
}
