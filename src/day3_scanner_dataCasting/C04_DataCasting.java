package day3_scanner_dataCasting;

public class C04_DataCasting {
    public static void main(String[] args) {
        /*
        bazı primitive türleri başka hiçbir data türünden değer kabul etmez
        bazi primitive türleri özel şartlar ile başka türdeki datalari değer olarak kabul eder.
        1- DATA Casting: Java'da bir data türüne ait variable'a başka data türüne air değer atanmasına denir.
        2- java'da her data türü başka data türüne atanamaz
        3- bazı data türleri başka hiçbir data türünden değer kabul etmez
        4- bazı data türleri otomatik olarak java casting yapar, bazı data türleriise casting yapmak için bizim onayımızı bekler
        5- benzer data türündeki variable ve değerler arasında casting yapmak istediğimizde
            - daha kapsamlı data türündeki variable'a daha düşük kapsamlı data türünden değer ataması yaparsak, Java Auto Widening yapar.
            -daha küçük kapsamlı data türündeki variable'a daha geniş kapsamdaki data türünden değer atamak istersek,
            java bunu otomatik olarak yapmaz, bizden manuel onay ister. Bu onayı yapmak için değerin önünde (cast yapılacak data türü yazılır) EXPLICIT narrowing
        6- Explicit narrowing yaptığımızda
        -değer variable'in data türü sınırları içerisindeyse direk atama yapar
        - değer, variable'ın data türünün sınırlarından büyükse (kova -doldur boşalt) data kayıpları veya data değişiklikleri olabilir.

         */
        boolean bl = false;
        bl = true;

        //bl="true";
        //bl='c';
        //bl=20;

        char ch = 't';
        ch = '%';
        ch = ' ';
        ch = 99;
        int sayi1 = 20;
        short sayi2 = 15;
        double sayi3 = 24;
        sayi1 = sayi2;  // int <---- short
        // sayi1=sayi3; --> direk atama yapamadık    int <--- double X
        // sayi2=sayi1;   short   <----- int X
        // sayi2=sayi3;   short   <----- double X
        sayi3 = sayi1; // double  <----- int +
        sayi3 = sayi2; // double  <----- short +
        sayi1 = ch;    //
        //sayi2=ch;
        sayi3 = ch;
        //Auto-widening
        // byte < short < int < long < float < double
        //daha geniş kapsamlı datayı daha dar kapsamlı variable'a atmak istediğimizde Java bunu otomatik olarak yapmayacaktır.
        int aaa=12;
        int bbb=567;
        byte ccc = (byte) aaa;  //zorlayarak daraltma
        byte ddd = (byte) bbb;


    }
}
