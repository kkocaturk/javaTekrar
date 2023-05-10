package day3_dataCasting_WrapperClass;

public class C04_DataCasting {
    public static void main(String[] args) {
        /*
        bazı primitive türleri başka hiiçbir data türünden değer kabul etmez
        bazi primitive türleri özel şartlar ile başka türdeki datalari değer olarak kabul eder.
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
