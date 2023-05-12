package day5_incrementDecremant_Concatenation;

public class C01_IncrementDecrement {
    public static void main(String[] args) {
        int a = 20;
        // a değerini 3 artırın ve yenideğerini bye ata
        a += 3;
        int b = a;
        System.out.println(b);

        a = 20;

        //anın değerini b'ye atayın sonra a'nın değerini 3 artırın

        b = a;
        a += 3;
        System.out.println("a: " + a + " b: " + b);//23 20

        a = 20;
        //anın değerini yazdır sonra a'yı 5 artırın
        System.out.println("a: " + a); // 20

        a = +5;

    }
}
