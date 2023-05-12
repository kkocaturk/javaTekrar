package day5_incrementDecremant_Concatenation;

public class C04_StringIntGecis {
    public static void main(String[] args) {

        String s1 = "423";

        //s1'i int'a çevirmek istersek
        int sayi = Integer.parseInt(s1);
        System.out.println(sayi++); // 423

        int a = 20;
        int b = 40;

        //bu iki sayıyı kullanarak 2040 yazdırın

        System.out.println(a + "" + b);  //2040
        System.out.println("" + a + b);  //2040



    }
}
