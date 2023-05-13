package day06_bagimsizifStatements;

public class C01_ifStatements {
    public static void main(String[] args) {

        /*
        buradaki şartlar bağımsızdır
        uygunsayılar olursa 3 if body'side çalışabilir bazen de hiçbir if bodysi devreye girmeyebilir.
         */
        int a = 400;
        int b = 300;
        if (a > b) {
            System.out.println(a + " sayısı " + b +" " + "'den büyüktür.");
        }
        if (a % 2 == 0) {
            System.out.println(a + " " + "çift sayıdır");
        }
        if (b > 100) {
            System.out.println(b + " " + "100den büyüktür");
        }
        boolean sonuc = a * 7 > b;

        /*
        bazen if statement ta direk boolean bir değer şart olarak yazılır
        bu durumda boolean variable değeri true is çalışır false ise çalışmaz
         */
        if (sonuc) {
            System.out.println("istenen şart sağlandı!");
        }
        //kullanıcıdan bir sayı alın 5'e bölünüyorsa 5'in katı yazın
    }
}
