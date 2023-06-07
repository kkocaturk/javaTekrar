package day23_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen = new Ogretmen();

        //toString() @Override etmeden önce
        System.out.println(ogretmen); //day23_constructor.Ogretmen@2d98a335


        //toString() @Override etmeden sonra
        System.out.println(ogretmen);  //Ogretmen{isim='isim belirtilmedi', soyisim='Soyisim belirtilmedi', brans='brans belirtilmedi'}

        System.out.println("\n---\n");


        Ogretmen ogretmen1;
        //System.out.println(ogretmen1.isim);// CTE çünkü constructor çalışmadı


        System.out.println("\n---\n");

        // null pointer ile işaretlersek kod CTE vermez NullPointerExceptin verir

        Ogretmen ogretmen2=null;  //-->bu hali ile kullanılmaz!!
       // System.out.println(ogretmen2.isim);

        //Null pointer'e eşitlediğimiz objeyi kullanmadan değer atamalıyız.
        // mutlaka cons çalışmalı

        System.out.println("\n---\n");

        //normal kullanım

        Ogretmen ogretmen3 =new Ogretmen();

        System.out.println(ogretmen3.isim); //isim belirtilmedi
        System.out.println(ogretmen3.soyisim); //Soyisim belirtilmedi
        System.out.println(ogretmen3.brans); //brans belirtilmedi
        System.out.println(ogretmen3); //Ogretmen{isim='isim belirtilmedi', soyisim='Soyisim belirtilmedi', brans='brans belirtilmedi'}


        System.out.println("\n---\n");


        ogretmen3.isim="Ali";
        ogretmen3.soyisim="VAli";

        System.out.println(ogretmen3.isim); //Ali
        System.out.println(ogretmen3.soyisim); //VAli
        System.out.println(ogretmen3.brans); //brans belirtilmedi

        System.out.println(ogretmen3); //Ogretmen{isim='Ali', soyisim='VAli', brans='brans belirtilmedi'}



    }
}
