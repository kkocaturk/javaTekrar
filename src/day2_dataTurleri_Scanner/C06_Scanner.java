package day2_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın
        //sayının karesini yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("karesini almak istediğin sayıyı giriniz:");

        double girilenSayi = scanner.nextDouble(); //4,4

        System.out.println("girilen sayının karesi: " + girilenSayi*girilenSayi); //19,3600000000000003 yaptı

//------ method denemesi
   // methodA(2);
    methodA(2,3);
    methodA(2,3,4);
    methodA(2,3,4,5);
    methodA(2,3,4,5,6,7,8);
//------------
        StringBuilder sb = new StringBuilder(5 + 7 + "Java" + 4 + 5);
        System.out.println(sb);
        String isim="Mesut";

        sb.append(isim, 2, 4);
        System.out.println(sb);
        sb.delete(4, 6);
        System.out.println(sb);

        //------------
    }
    public static void methodA(int i, int j, int... k) {

        System.out.println(k.length);

    }
}
