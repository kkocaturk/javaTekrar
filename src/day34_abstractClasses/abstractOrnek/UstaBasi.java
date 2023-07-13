package day34_abstractClasses.abstractOrnek;

public class UstaBasi extends Isci{
    /*
    implement etmek zorundasın demedi
    Isci classında override ettiği için java burada yapmamızı zorunlu kılmadı ama proje için override etmeliyiz.
     */

    @Override
    protected int saatUcreti() {
        return 15;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }
}
