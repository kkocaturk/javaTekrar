package day8_nestedifElse_ternary;


import java.util.Scanner;

public class C10_NestedTernary { //çok tavsiye edilmez

    public static void main(String[] args) {
        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayı girin: ");
        int sayi = scanner.nextInt(); ;


        System.out.println(sayi > 0
                ? sayi % 2 == 0 ? "Cift sayi" : "Tek sayi"
                : sayi > -1000 && sayi < -99 ? "Uc basamakli" : "3 basamakli degil");


        // sayi>0 ? sayi%2==0 ? "Cift sayi" : "Tek sayi" : sayi>-1000 && sayi<-99 ? "Uc basamakli" : "3 basamakli degil"
    }
}
