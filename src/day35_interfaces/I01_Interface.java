package day35_interfaces;

/*
abstract class'larda abstract metot ve concrete metotlar olabilir.
Ama interface'i tanımlarsak
    - bir sınıfın davranışlarını belirlemek için kullanılan abstract class'ın özel halidir

* interfacelerdeki variable'lar mutlaka <constant>  public static final olmalıdır.
public static final int SAYI1=20;
static final int SAYI2=20;
final int SAYI3=20;
int SAYI4=20; interface'de bu variableların hepsi aynı özelliktedir. private veya protected variable'lar compile time error verir.

*interface'de bodysi olan metot kullanılabilir mi?
Java8'den sonra default ve static keywordleri kullanılarak boyd'si olan metotlar oluşturulmasına izin vermiştir.

    - bir interface tanımlayıp bu interface'i alt classlar implement ettikten sonra interface 'de bir class için metot ekleyerek değişiklik yaptığımız durumda,
    o class da o değişikliği implement ederiz.
     Ancak interface'i implement eden bir başka class'ta  interface'de yaptığımız metot değişikliğini implement etmek istemiyorsak,
     interface'de eklediğimiz metodun başına default veya static keywordleri eklenir.! Dikkat buradaki default access modifier değildir. Access modifier'ı zaten public'tir
     !Dikkat ! ayrıntı bilgi.<bu method hala concrete olmaz hala abstract'dır. >

 */
public interface I01_Interface {

    static int sayi = 10 ;
    final String str = "Java Candir";
    public static final boolean b = true;

    // Interface'de tum variable'lar (Yazilmasa bile) public, static ve final'dir
    // final oldugu icin sonradan degistirme imkani yoktur, olustururken deger atanmalidir
    // bu ozellikler standart olarak tum variable'lara tanimlandigindan,
    // bu tanimlamalari yapmak gerekli degildir (intelliJ gri yapti)


    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    // tum method'lar da standart olarak public ve abstract'tir (yazilmasa bile)




}
