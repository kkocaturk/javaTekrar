package day3_dataCasting_WrapperClass;

import java.util.Scanner;

public class C02_Scanner {
    /*
    kullanıcıdan ismini alıp aşağıdaki formatta yazdırın
    Girilen bilgiler: J Doe, 44
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //tek açıklma ile üç bilgi alınabilir
        System.out.println("isminizi , soyisminizi ve yaşınızı giriniz" +
                "\nher bilgiden sonra enter'a basınız.");
        char girilenIsimIlkHarf = scanner.nextLine().toUpperCase().charAt(0);
        String girilenSoyisim = scanner.nextLine().toUpperCase();
        double girilenYas =Integer.parseInt(scanner.nextLine()); //String alırsak Integer.parseInt yaparız.
        //int double atanabilir
        /*
        int girilenYas2 =scanner.nextInt(); // sorunsuz
        int yas=(int)scanner.nextDouble(); //casting
       */
        System.out.println("Girilen bilgiler: " + girilenIsimIlkHarf + " " + girilenSoyisim + ", " +girilenYas);

    }
}
