package day9_SwitchStatements_stringManipulation;

import java.util.Locale;

public class C03_StringManipulation {
    public static void main(String[] args) {

        String str= "Java Candir";

        // str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candir

        // String manipulation yaptiktan sonra, asıl variable'a atama yapilmazsa
        // asıl variable degismez

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

        // str'i turkce karakterleri gozonunde bulundurarak kucuk harfe cevirin

        str = str.toLowerCase(Locale.forLanguageTag("TR"));

        System.out.println(str); // java candır


    }
}