package day06_bagimsizifStatements;

import java.util.Scanner;

public class C03_ifStateEx {
    public static void main(String[] args) {
        //kullanıcan üçgenin 3 kenar uzunluğunu alın
        //üçgen eşkenar ise "eşkenar üçgen" yazdır.

        Scanner scan = new Scanner(System.in);

        System.out.println("üçgenin 3 kenar uzunluğunu girin");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        /*
        java'da 3lü karşılaştırma yoktur. onun yerine ikili karşılaştırma yapıp && ilr birleştireceğiz.
        &&  ----> bir kere doğru görsün direk doğru der
        &  -----> satır sonuna kadar gidip bütün şartları değerlendirir öyle sonuç verir.
        "&&" (ve) operatörü, iki ifadenin de doğru olması durumunda bir koşulu doğru olarak değerlendirir.
        Yani, "if (a && b)" ifadesi, hem "a" hem de "b" ifadelerinin doğru olduğu durumlarda koşulu doğru olarak değerlendirir.
        Ancak, "a" ifadesinin yanlış olduğu durumlarda "b" ifadesini değerlendirmez, bu nedenle "&&" operatörü, "kısa devre" (short-circuit) özelliklidir.
        "&" (ve) operatörü ise, "&&" operatöründen farklı olarak, her iki ifadeyi de değerlendirir, ancak sonucu yine de doğru veya yanlış olarak değerlendirir
         */

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0){
            System.out.println("eşkenar üçgen");
        }
    }
}
