package day8_nestedifElse_ternary;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen harfi yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("bir karakter girin: ");
        char harf = scanner.next().charAt(0);

        System.out.println(harf >= 'a' && harf <= 'z'
                ? Character.toUpperCase(harf)
                : harf);
    }
}
