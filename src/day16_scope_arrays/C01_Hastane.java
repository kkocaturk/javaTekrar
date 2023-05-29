package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {

        ADoktor doktor1=new ADoktor();
        System.out.println("doktor1.askerlikYaptiMi = " + doktor1.askerlikYaptiMi); //false
        doktor1.isim="Kemal";
        doktor1.soyisim="Yılmaz";
        doktor1.dogumYili=1980;
        System.out.println(doktor1.isim); //Kemal

        ADoktor doktor2=new ADoktor();
        System.out.println("doktor2.isim = " + doktor2.isim);//  doktor2.isim = null
        doktor2.soyisim="çelik";
        System.out.println(doktor2.soyisim);//çelik

        System.out.println(doktor1); //  day16_scope_arrays.ADoktor@3feba861  referansini yazdirir

        System.out.println(doktor1.fakulte); //Tip
        System.out.println(doktor2.fakulte); //Tip  --sarıya boyadı-- direk class üzerinden ulaşılır.

        doktor1.isim="Burcu";
        System.out.println(doktor2.isim); //null


        doktor1.fakulte="Tıp fakültesi";
        System.out.println("doktor2.fakulte: " + doktor2.fakulte); // Tıp fakültesi fakulte static variable olduğu için değişti.!!


        ADoktor doktor3=new ADoktor();
        System.out.println("doktor3.dogumYili = " + doktor3.dogumYili);//0
        System.out.println(doktor3.fakulte); //Tıp fakültesi -- en son atanan değer oldu

        /*
        static variable'lar icin tavsiye edilen erisim yontemi
        classIsmi.staticUyeIsmi seklinde yazimdir.
        bu kullanim bicimine static yontem denir

         */

    }
}
