package day34_abstractClasses.abstractOrnek;
/*
abstract class'larda abstract metot ve concrete metotlar olabilir.
 */
public abstract class Personel {
    static final String sirketIsmi = "Yildiz Celik";
    static final String sirketAdresi = "Ankara/Turkey";

    protected String isim="Değer girilmemiş";
    protected String soyisim="Değer girilmemiş";
    protected String tcNO="Değer girilmemiş";
    protected String telefon="Değer girilmemiş";
    protected String iseBaslamaTarihi="Değer girilmemiş";
    protected String sigortaNo="Değer girilmemiş";
    static int personelSayac=1000;
    protected String personelNo;
    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }
}
