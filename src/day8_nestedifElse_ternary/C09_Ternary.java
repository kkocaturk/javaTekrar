package day8_nestedifElse_ternary;

import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("iki sayı girin: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a>b ? b : a);
    }
}
