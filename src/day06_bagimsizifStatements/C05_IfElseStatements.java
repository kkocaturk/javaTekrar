package day06_bagimsizifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*
        Eğer bir olay için iki olasılık varsa ve bu olasılıklardan biri mutlaka çalışacaksa If else Statements kullanırız.

        if else statements'da if boysi veya else body'si mutlaka çalışır.
        ikisinin birden çalışma ihtimali yoktur
        ikisinin birden çalışmama ihtimali yoktur
         */

        //kullanıcıdan not alın 50den büyükse "Sınıfı geçtin"
        //50'den küçükse "Maalesef kaldın"
        Scanner scanner = new Scanner(System.in);

        System.out.println("notu giriniz: ");

        double not = scanner.nextDouble();

        if (not >= 50 && not <= 100) System.out.println("Sınıfı geçtin");
        else System.out.println("maalesef kaldın");



        //kullanıcıdan pozitif tamsayı al sayının tek çift olduğunu yazdırın
        System.out.println("pozitif tamsyı gir: ");

        int girsayi=scanner.nextInt();

        if(girsayi%2==0) {
            System.out.println(girsayi + " çiftsayıdır.");
        }
        else {
            System.out.println(girsayi+ " tek sayıdır.");}

        if(girsayi%5==0){
            System.out.println(girsayi+ " 5'e bölünür.");}
        else{
            System.out.println(girsayi+ " 5'e bölünmez.");}



        //kullanıcıdan pozitif tamsayı al 5 ile bölünüp bölünmediğini yazdırın



    }
}
