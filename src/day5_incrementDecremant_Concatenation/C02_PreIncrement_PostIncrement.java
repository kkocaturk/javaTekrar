package day5_incrementDecremant_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {


        /*
        Eğer sayının değeri SADECE 1 artacak veya azalacaksa

        artırıp sonra yazdırma/atama
        yazdırıp sonra artırma/atama

        işlemlerini tek satırda yapabiliriz.
         */

        // a değerini 1 artırın ve yenideğerini b'ye ata
        int a = 20;

       /* a++;
        int b = a;
       */
        int b = ++a; //önce artırır sonra atam yapar

        System.out.println("a: " + a + " b: " + b); //a: 21 b: 21


        //anın değerini b'ye atayın sonra a'nın değerini 3 artırın

        a = 20;

        /*
        b = a;
        a++;
        */
        b = a++;

        System.out.println("a: " + a + " b: " + b); // a: 21 b: 20


        a = 20;
        //anın değerini yazdır sonra a'yı 1 artırın
        System.out.println("a: " + a); // a: 20

        a++;
        System.out.println("----");

        a = 20;
        //a'yı 2 azalt ve sonra a yı yazdır.
        a -= 2;
        System.out.println("a: " + a);//20


        //a'nın değerini 1 azaltın ve sonra a'nın değerini yazdırın
        a=20;
        System.out.println("a: " + --a); //19
        System.out.println("a: " + a);  //19


    }
}
