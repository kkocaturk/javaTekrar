package day9_POli;

public class Evlat extends Baba implements ICommonMethodsInterface{

   static Baba polimorfikEvlat= new Evlat();
   static Evlat evlat=new Evlat();

    public static void main(String[] args) {

        evlat.evlatMethodu();
        System.out.println("---1---");
        evlat.babalogin();
        System.out.println("---2---");
        polimorfikEvlat.babalogin();
        System.out.println("---3---");
        evlat.atla();
        System.out.println("---4---");
        evlat.babalogin();
        System.out.println("---5---");




        //anonymous class ICommonMethodsInterface ile birlikte bak ↓  -------1 sefer kullandık
         new ICommonMethodsInterface() {
            @Override
            public void login() {
                System.out.println("***********");
                System.out.println("interface'i override edip anonymous class oluşturup bir kereye mahsus çalışan bir metot oluşturdum.");
                System.out.println("***********");
            }

             @Override
             public void atla() {
                 System.out.println("==========");
                 System.out.println("atlama metodu");
                 System.out.println("==========");
             }
         }.login(); // kullanmak için sonuna metodun adını yazdık

        //anonymous class ICommonMethodsInterface ile birlikte bak ↓  -------1 sefer kullandık


        new ICommonMethodsInterface() {
            @Override
            public void login() {
                System.out.println("!!!!!!!!!!!!!!!!!");
                System.out.println("burada bi şey yok");
                System.out.println("!!!!!!!!!!!!!!!!!");

            }

            @Override
            public void atla() {
                System.out.println("%%%%%%%%%%%%%%%%5");
                System.out.println("burada hiç bi şey yok");
                System.out.println("%%%%%%%%%%%%%%%%5");
            }
        }.atla();


    }

    void evlatMethodu() {

        System.out.println("Evlat methodu");
    }


    @Override
    public void login() {
        System.out.println("evlat içinde override login");
    }

    @Override
    public void atla() {
        System.out.println("evlat içinde override atla");

    }
}
