package day11stringManipulations_ForLoop;

public class C04_ReplaceAll {
    public static void main(String[] args) {
        String str = "J1a23va34  5C54and65ir87*/-";

        // str'daki sayilari method'la temizleyin

        /*
            Eger degistirmek istedigimiz metin tek bir metin degil,
            ortak ozelligi olan farkli metinlerse

            - tum sayilar
            - sayi olmayanlarin tumu
            - tum space'ler
            - space olmayan tum karakterler

            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir (regex:Regular Expressions)
            \\s:space                   \\S:space olmayan herşey
            \\s+ yanyana birden fazla space
            \\d digits                  \\D digit olmayan herşey
            \\w harfler, sayılar ve _         \\W harf veya rakam olmayan herşey

            - replaceAll'da regex kullanılır ama char kullanılmaz.

         */
        System.out.println("str = " + str);
        str = str.replaceAll("\\d","");
        System.out.println("str'in yeni hali  rakamları çıkardı \"\\\\d\": " + str); //Java Candir

        str = "J1a23va34 5C54and65ir87";
        str = str.replaceAll("\\D","");
        System.out.println("str'in yeni hali -DigitOlmayanHerşey \"\\\\D\": " + str); //123345546587

        str = "J1a23va34 5C54and65ir87";
        str = str.replaceAll("\\s","");
        System.out.println("str'in yeni hali -space : \"\\\\s\" " + str); //J1a23va345C54and65ir87

        str = "J1a23va34 5C54and65ir87";
        str = str.replaceAll("\\s+","");
        System.out.println("str'in yeni hali -yanyana birdenfazlaSpace: \"\\\\s+\" " + str); //J1a23va345C54and65ir87

        str = "J1a23va34 5C54and65ir87";
        str = str.replaceAll("\\S","");
        System.out.println("str'in yeni hali : -spaceOlmayanHerşey \"\\\\S\":  " + str); //

        str = "J1a23va34 5C54and65ir87++-=)(" ;
        System.out.println(str);
        str = str.replaceAll("\\w","");
        System.out.println("str'in yeni hali : -harfVeyaRakam \"\\\\w\": " + str); //

        str = "J1a23va34 5C54and65ir87";
        str = str.replaceAll("\\W","");
        System.out.println("str'in yeni hali :  -harfVeyaRakamOlmayanHerşey \"\\\\W\": " + str); // J1a23va345C54and65ir87

    }
}
