package day06_bagimsizifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        // kull yaşı iste 65 yaş üzeri ise "Emekli olabilirsin" yazsın
        // yoksa emekli olması için çalışması gerekli olan yıl sayısını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen yaşınızı girin");

        double yas = scanner.nextDouble();
        if (yas >= 65) {
            System.out.println("Emekli olabilrsiniz");
        } else {
            System.out.println("Emekli olmak için " + (65 - yas) + " yıl daha çalışmanız gereklidir. ");
        }
    }
}
