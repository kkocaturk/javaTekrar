package day33_pollymorphism.ornek;
/*
Pollymorphism aynı isimdeki metodu farklı farklı sonuç verecek şekilde çalıştırmaktır.
1- bir class içerisinde method isimleri aynı signatureları farklı olarak overloading ile yapılabilir.
2- inheritance kullanılarak parent ve child classlar içerisinde datat türü ve constructor'ı farklı classlardan kullanarak override edebilirsiniz.
 */
public class CarSeller {
    public static void main(String[] args) {
        //overloadind:aynı isim farklı signaturre ile aynı class'da birden
        // fazla method oluşturamıza imkan tanır

        CarSeller carSeller = new CarSeller();
        carSeller.yakit(); //CarSeller classı
        carSeller.yakit(2020);
        carSeller.yakit(2010, 5.3);

        //overriding : parent class'ta varolan bir method'un
        //child class'da oluşturulan aynı isim ve signature'a sahip
        // bir method trafından geçersiz kılınmasıdır.

        A_Toyota obj2 = new A_Toyota();
        obj2.yakit(); // A_Toyota classı

        A_Toyota obj3 = new ToyotaBenzin();
        obj3.yakit(); // ToyotaBenzin classı
        // obj3.yakit(6.8); //CTE verir çünkü ilk gittiği A_Toyota classında yakit(double_deger) alan bir method yok

        A_Toyota obj4 = new ToyotaDizel();
        obj4.yakit(); // ToyotaDizel classı

        A_Toyota obj5 = new ToyotaElektrik();
        obj5.yakit(); //ToyotaElektrik classı
    }

    public void motor() {
        System.out.println("Toyota benzinli araçlarda 1,4 benzinli motor kullanılır");
    }

    public void yakit() {
        System.out.println("Toyota benzinlide  araçlarda e10 yakıtı kullanılır. ");
    }

    public void yakit(double maxTuketim) {
        System.out.println("istediğiniz " + maxTuketim + " lt tüketime uygun araç");
    }

    public void yakit(int yil) {
        System.out.println("istediğiniz model yili " + yil + " şartına uygun araç");
    }

    public void yakit(int yil, double maxTuketim) {
        System.out.println("istediğiniz yil ve max tuketime uygun araç bulundu");
    }
}
