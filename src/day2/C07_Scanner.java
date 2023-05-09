package day2;

import java.util.Scanner;

public class C07_Scanner {
    /*
    kullanıcı ismi soyisim ve yaş alıp aşağıdaki formatta yazın
    İsminiz: John
    Soyisminiz: Doe
    Yasiniz: 44
    Kaydınız tamamlandı
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi girin");
        String girilenIsim = scanner.nextLine();
        System.out.println("Soyisminizi girin");
        String girilenSoyisim = scanner.nextLine();
        System.out.println("Yaşınızı girin");
        int girilenYas = scanner.nextInt();
        System.out.println("İsminiz: " + girilenIsim +
                "\nSoyisminiz:" + girilenSoyisim +
                "\nYaşınız: " + girilenYas +
                "\nKaydınız tamamlandı");
    }
}
