package day06_bagimsizifStatements;

import java.util.Scanner;

public class C07_IfELseStatements {
    public static void main(String[] args) {
        // kullanıcını girdiği karakterin büyük harf olup olmadığını yazdırın
        // char değişkenleri matematiksel işleme girdiklerinde ASCII tablosuna göre işlem yapar.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz: ");
        char krk = scanner.next().charAt(0);

        //r  ---> A ile Z arasında mı?  'A'=65 idi

        if (krk >= 'A' && krk <= 'Z') {
            System.out.println(krk + " büyük harftir");
        }
        else{
            System.out.println(krk + " büyük harf değildir.");
        }
        char asd='Ü';
        System.out.println(asd+1);
    }
}
