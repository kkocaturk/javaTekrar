package day9_SwitchStatements_stringManipulation;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
        //kullanıcıdan ey numarasını alıp mevsimis yazdırın
        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen yazdırmak istediğiniz ay numarasını girin ve mevsimi öğrenin: 3");

        int ayNo=scanner.nextInt();

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("KIŞ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İLKBAHAR");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("YAZ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("SONBAHAR");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");





        }

    }
}
