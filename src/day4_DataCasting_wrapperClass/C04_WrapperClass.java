package day4_DataCasting_wrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        //non primitive data türlerinin hazır metotları varken
        //primitive data türlerinin hazır metotları yoktur.
        //Java primitive data türleri için kolayca geçiş yapabilecekleri
        //non-primitive data türleri oluşturmuştur.
        /*
        int --> Integer
        char -->Character
        byte -->Byte
        boolean --> Boolean
        doubl e--> Double, float --> Float, short --> Short, long --> Long
         */
        Integer sayi = 10;
        //int variable'a atadığımız değerleri atayabiliyoruz.
        //artı olarak hazır metotları var.

        //variable oluşturmadan bazı metotları kullanabiliyoruz.
        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647

        String sonucStr = "345";
        System.out.println(sonucStr + 10); //34510

        // sonucStr 'a 10 nasıl eklenir?
        // int sonuc= (int) sonucStr; //çalışmaz çünkü aynı türler birbirine dönebilirdi < // byte < short < int < long < float < double >

        // bu durumda wrapper classlar kullanılır
        int sonuc = Integer.parseInt(sonucStr);
        System.out.println(sonuc + 10);  //355
        int sonuc2 = Integer.valueOf(sonucStr);
        System.out.println(sonuc2 + 7); //352

        char krk = '3';
        System.out.println(Character.isDigit(krk)); //true
        System.out.println("Character.isLetter(krk) = " + Character.isLetter(krk));//false

        int sayii = 40;
        Integer sayi2 = sayii; //kullanılanbilir.
        System.out.println(sayi2);

        boolean kontrol = true;
        Boolean kont = false;
        String knt = "false";
        boolean sonuc12 = Boolean.valueOf(knt);
        System.out.println(kontrol  + "  " + kont + " " + sonuc12); //true  false false

        System.out.println("-----123-------");
        char ch='*';
        Character chr='p';
        char chr2=105;
        System.out.println(Character.valueOf(chr2)); // i
        System.out.println(Character.isDigit('5')); //true
        System.out.println(Character.isDigit(chr)); //false
        System.out.println(Character.isAlphabetic(ch));//false
        System.out.println(Character.isAlphabetic('9'));// false
        System.out.println(Character.isAlphabetic(chr));//true


    }
}
