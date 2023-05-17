package day7_genelTekrarIfelseStatements;



public class C01_DataCasting {
    public static void main(String[] args) {
        //Java'da bazı data türleri asla başka data türlerine çevrilemez
        /*
        String st1=false;
        String st2=20;
        boolean bl1 ='a';
        int sayi1="Merhaba";
        */

        //özellikle sayısal data türündeki değerler
        //başka sayısal data türündeki variable'lara atanabilir.

        double db1 =23;
        short sh1=12;

        //-----------------1-----------
        int sayi2=sh1;
        //daha dar data türündeki değeri daha geniş data türündeki variable'a atmaya
        //autowidening denir ve java bunu otomatik yapar

        //----------------2----------------

        sh1= (short) sayi2;
        sayi2 = (int) db1;
        //daha geniş data türündeki değeri daha dar data türündeki variable'a atmaya
        //explicit narrowing denir ve java bunu otomatik yapmaz
        // bizden onay ister.

        //----------------------3---------------------

        sayi2= 'k';
        if(sayi2> 'd'){

        }
        //char datat türündeki değerler satısal işlemlerde kullanılabilir.
        //bir char matematiksel işlemde kullanılırsa ASCII table'da değeri ile işleme girer
        System.out.println('k'+1); //108

        //eğer bu işlemin char olarak değerini yazdırmak istersek
        // sayısal değerler char'a cast edilebilr.

        System.out.println((char) ('k'+1)); //l

        db1=3987876765d;
        int sayi3=(int) db1;
        System.out.println("sayi3 = " + sayi3); // double'dan int geçişlerde data kaybı olabilir.


        short sh2=(short) db1;
        System.out.println("sh2 = " + sh2);

        String str5="112";
        short sh3=Short.parseShort(str5);

        System.out.println("sh3'ün iki katı "  + sh3*2);

        String string1="234";
        int sayi234=Integer.parseInt(string1);
        System.out.println("sayi234 = " + sayi234);

        C02_IfelseIf c02IfelseIf=new C02_IfelseIf();
        c02IfelseIf.notOku();
    }
}
