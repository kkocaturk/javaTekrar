package day9_SwitchStatements_stringManipulation;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        //kullanıcıdan ey numarasını alıp ismini yazdırın
        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen yazdırmak istediğiniz ay numarasını girin");

        int ayNo=scanner.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");





        }

    }
}
