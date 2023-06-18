package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

    String hareket= "ucarlar";
    String beslenme= "et yerler";
    String pence= "pencelidir";
    String gaga= "sivri gagali";


    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();
        System.out.println(kartalAvci.hareket);// C ucarlar
        System.out.println(kartalAvci.beslenme);// C et yerler
        System.out.println(kartalAvci.pence);// C pencelidir
        System.out.println(kartalAvci.gaga);// C sivri gagali

        System.out.println(kartalAvci.kanat);// B kanatlidir
        System.out.println(kartalAvci.solunum);// B akciger
        System.out.println(kartalAvci.cogalma);// B yumurtayla

        System.out.println(kartalAvci.omur); // A yasar ve olurler

        BKuslar kartalKus= new CAvciKuslar();
        System.out.println(kartalKus.hareket);// A hareket ederler
        System.out.println(kartalKus.beslenme);// A beslenirler
       // System.out.println(kartalKus.pence);// CTE
        System.out.println(kartalKus.gaga);// B gagalari vardir

        System.out.println(kartalKus.kanat);// B kanatlidir
        System.out.println(kartalKus.solunum);// B akciger
        System.out.println(kartalKus.cogalma);// B yumurtayla

        System.out.println(kartalKus.omur); // A yasar ve olurler


        AHayvanlar kartalHayvan= new CAvciKuslar();
        System.out.println(kartalHayvan.hareket);// A hareket ederler
        System.out.println(kartalHayvan.beslenme);// A beslenirler
        //System.out.println(kartalHayvan.pence);// CTE
        //System.out.println(kartalHayvan.gaga);// CTE

        //System.out.println(kartalHayvan.kanat);// CTE
        System.out.println(kartalHayvan.solunum);// A nefes alirlar
        System.out.println(kartalHayvan.cogalma);// A cogalirlar

        System.out.println(kartalHayvan.omur); // A yasar ve olurler


        // Variable olarak ozellikleri olusturursak
        BKuslar kuslar= new BKuslar();
        BKuslar avciKuslar= new CAvciKuslar();
        // bu iki obje arasinda bir fark goremeyiz

        /*
            Eger bir obje olusturulurken
            Data turu ve constructor ayni ise
            aradigimiz ozellikler icin direk o class'a gider
            ve ozellikleri arariz

            -variable'lar
                  once data turunun oldugu class'a bakar
                  o variable'i bulursa degerini yazdirir
                  bulamazsa data turunun parent'larina bakar
                  orada bulursa degerini yazdirir
                  orada da bulamazsa CTE verir


              Ozetle bir ozelligi variable olarak olusturursaniz
              data turu olan class ve parentlarindaki ortak ozelliklere bakar

              ortak bilgileri arar,
              en guncel bilgiyi aramaz

            Eger data turu ve constructor farkli ise variable ve method'lar farkli davranirlar
            - variable'lar
                Önce data türünün olduğu class'a gidilip, o class ve parent classlarında aranan class üyesi bulunur.
                    * Aranan class üyesi variable ise, ilk bulunan variable'a ait değer yazdırılır.
                    * Aranan class üyesi method ise ilk bulunan method çalıştırılmadan önce, override edilmiş mi diye kontrol edilir
                     override edilmiş ise en son override eden method çalıştırılır.
            NOT: Aranan class üyesi Data türünün olduğu class veya parent classlarında bulunamazsa CTE oluşur.




         */


    }


}
/*


Bu kod örneğinde, üç farklı sınıf kullanılmıştır: "AHayvanlar", "BKuslar" ve "CAvciKuslar". Bu sınıflar arasında miras ilişkisi vardır.

    "AHayvanlar" sınıfı, genel hayvanların sahip olduğu özellikleri temsil etmektedir.
    İçerisinde "hareket", "solunum", "beslenme", "cogalma" ve "omur" gibi özellikler (String değişkenler) bulunmaktadır.
    Bu özellikler, hayvanların hareket etme şekli, solunum yapma şekli, beslenme alışkanlıkları, üreme şekilleri ve ömürleri hakkında bilgi vermektedir.

    "BKuslar" sınıfı, "AHayvanlar" sınıfını miras almaktadır. Bu sınıf, kuşların genel özelliklerini temsil etmektedir.
    Kendine özgü "kanat", "solunum", "gaga" ve "cogalma" gibi özellikler (String değişkenler) bulunmaktadır.
    Bu özellikler, kuşların kanatlı olması, akciğerle solunum yapması, gagalarının olması ve yumurtayla üremesi gibi özelliklerini göstermektedir.
    Ayrıca, "BKuslar" sınıfı, "AHayvanlar" sınıfından miras aldığı özellikleri de kullanabilmektedir.

    "CAvciKuslar" sınıfı ise "BKuslar" sınıfını miras almaktadır. Bu sınıf, avcı kuşları temsil etmektedir.
    "CAvciKuslar" sınıfı, "BKuslar" sınıfındaki özelliklerin bazılarını override ederek kendi özgün davranışlarını tanımlamıştır.
    Ayrıca, "CAvciKuslar" sınıfı da "BKuslar" ve "AHayvanlar" sınıflarından miras aldığı özellikleri kullanabilmektedir.

    "main()" metodu içinde, farklı nesneler oluşturularak sınıflardaki özelliklerin kullanımı gösterilmektedir.
    Nesneler oluşturulurken, değişkenlerin değerlerini kullanarak ilgili özellikler ekrana yazdırılmaktadır.
    Miras sayesinde, üst sınıflarda tanımlanan özellikler alt sınıflar tarafından kullanılabilmekte ve gerektiğinde değiştirilebilmektedir.

    Son olarak, kodun altında yapılan açıklamalar "variable overriding" kavramına değinmektedir.
    Bu açıklamalar, değişkenin hangi sınıfta tanımlandığına bağlı olarak hangi değerin kullanılacağını belirtmektedir.
    Değişkenler, sınıflar arasında miras aldıkları özellikleri gölgeleyebilir veya değiştirebilir


Bu kodda "CTE" (Compile Time Error) hatası, kartalKus ve kartalHayvan referansları üzerinden bazı özelliklere erişilmeye çalışıldığında ortaya çıkıyor. İncelediğimizde:

    kartalKus.pence ifadesinde hata oluşuyor çünkü kartalKus referansı, CAvciKuslar sınıfının bir örneğini tutuyor ve bu sınıfta pence özelliği bulunuyor.
    Ancak kartalKus referansı, BKuslar veri türüne sahip olduğu için, sadece BKuslar sınıfının özelliklerine erişebilir.
    Dolayısıyla, pence özelliğine erişilemez ve CTE hatası oluşur.

    kartalHayvan.pence ve kartalHayvan.gaga ifadelerinde de hata oluşuyor.
    kartalHayvan referansı, AHayvanlar veri türüne sahip olduğu için, yalnızca AHayvanlar sınıfının özelliklerine erişebilir.
    pence ve gaga özellikleri ise CAvciKuslar sınıfına aittir ve bu referans üzerinden erişilemez. Bu nedenle, bu ifadeler de CTE hatası verir.

    Sonuç olarak, referansların veri türleriyle uyumlu olmayan özelliklere erişmeye çalıştığınız için bu hatalar ortaya çıkıyor.
    Eğer ilgili özelliklere erişmek isterseniz, referansları doğru veri türlerine dönüştürmeniz veya başka bir yol bulmanız gerekebilir.
 */