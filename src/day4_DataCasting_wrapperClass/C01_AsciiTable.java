package day4_DataCasting_wrapperClass;

public class C01_AsciiTable {
    public static void main(String[] args) {
        /*

         24 ==> 11000
         a  ==> 97 ===> 10100010
         b  ===> 98 ==>
         char data türündeki variable ve değerler
         sayısal data türlerine atanırsa
         veya sayısal data türündeki datalarla işleme sokulursa
         ASCII table'daki değerleri ile işleme girerler

           */

        System.out.println(5 + 'a'); // 5 + 97 = 102

        char ilkHarf = 101;
        System.out.println(ilkHarf); // e

        //kullanıcını verdiği harften bir sonraki harfi yazdırın
        char girilenChar = 'f';
        System.out.println(girilenChar + 1); // 102+1=103

        //biz 103'ü değil 103'ün karşılığı olan char ifadeyi yazdırmak istersek explicit casting yaparız.
        System.out.println("girilen harfin bir sonrası : " + (char) (girilenChar + 1)); //girilen harfin bir sonrası : g

        //verilen harften 2 önceki harfi yazıdırın
        girilenChar = 'M';
        System.out.println(girilenChar - 2); // 75 // çünkü 'M' char'ı ASCII'deki değeri 77 --> 77-2=75
        System.out.println("char değeri: " + (char) (girilenChar - 2)); //char değeri: K




        /*
         for (int i = 0; i <100 ; i++) {

            char ch= (char) i ;

            System.out.print(ch+"  ");
        }
        */

    }
}
