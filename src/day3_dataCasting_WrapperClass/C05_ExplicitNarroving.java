package day3_dataCasting_WrapperClass;

public class C05_ExplicitNarroving {
    public static void main(String[] args) {
        //daha geniş kapsamlı datayı daha dar kapsamlı variable'a atmak istediğimizde Java bunu otomatik olarak yapmayacaktır.
        double db1 = 45.32;
        int int1 = (int) db1; // int <---- double
        System.out.println(int1); //.32 lik kısmı attı

        db1 = 3987876765d;
        int1 = (int) db1; // int <------ double
        System.out.println(int1); //2147483647

        int1 = 34;
        byte by1 = (byte) int1; // byte <------ int
        System.out.println(by1); // 34

        int1 = 130;
        by1=(byte) int1;
        System.out.println(by1);//-126


        int aaa = 12;
        int bbb = 567;
        byte ccc = (byte) aaa;  //zorlayarak daraltma
        byte ddd = (byte) bbb;
    }
}
