package day34_abstractClasses.abstractOrnek;

public class Isci extends Muhasebe {

    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "sirket ismi" + sirketIsmi +
                ", sirket adresi" + sirketAdresi +
                ", saatUcreti=" + saatUcreti +
                ", aylikCalisma=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcNO='" + tcNO + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Isci isci1 = new Isci();
        isci1.saatUcreti = isci1.saatUcreti();
        isci1.aylikCalismaSuresi = isci1.aylikCalismaSuresi();
        isci1.maas = isci1.maas(isci1.saatUcreti, isci1.aylikCalismaSuresi);
        isci1.isim = "Hasan";
        isci1.soyisim = "Can";
        System.out.println(isci1);

    }
}
