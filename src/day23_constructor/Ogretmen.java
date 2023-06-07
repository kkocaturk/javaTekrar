package day23_constructor;

public class Ogretmen {
    String isim="isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String brans="brans belirtilmedi";

    /*
    public Ogretmen() {
    }

            1. default constructor görünmez
             - Arka planda çalışan java kendisi oluşturur
             - parametresi  ve blok içi boştur.

    */

    /*
      public Ogretmen(){
        isim="Hasan";
        soyisim="Kul";
        brans="Mat";
    }

     2. Parametresiz Constructor
        - Default Cons ile aynı görünümdedir
        - biz oluştururuz
        - blok kısmında atama yapabliriz DEFault Cons'tan önemli bir farkı <ama tercih edilmez>
        çünkü her oluşan obje aynı değerleri almış olur.

    */

/*
    public Ogretmen(String isim,String soyisim,String brans){
            this.isim=isim;
            this.soyisim=soyisim;
            this.brans=brans;
        }

    3. Parametreli Constructor
        - Yukarıdaki dezavantajları giderir.
        -Constructor içinde parametre olarak gönderdiğimiz değerleri
     instance variable'lara atayarak bizi her bir değer için tek tek atama yapma zorunluluğundan kurtarır.
        - Parametreli COnstructor oluşturduktan sonra parametresiz Cons
        ihtiyacımız varsa default cons gibi bir cons olulturmamız gerekir.!!

 */

    public Ogretmen(String isim, String soyisim, String brans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.brans = brans;
    }

    public Ogretmen(){

    }


    @Override
    public String toString() {
        return "Ogretmen{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", brans='" + brans + '\'' +
                '}';
    }
}
