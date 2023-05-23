package day13_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringTersineCevir("Java Candir"));
        System.out.println(stringTersineCevir("Anlasildi mi?"));
        System.out.println(stringTersineCevir("Soyle Omer"));

    }


    public static String stringTersineCevir(String metin) { // Java


        String bos = "";
        for (int i = 0; i < metin.length(); i++) {
            bos += metin.charAt(metin.length() - 1 - i);
        }

        return bos;



    /*

        String tersMetin=""; // avaJ

        for (int i = metin.length()-1 ; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    */

    }
}
