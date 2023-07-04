package day33_pollymorphism.ornek;

public class ToyotaBenzin extends A_Toyota{

    public void motor() {
        System.out.println("Toyota benzinli araçlarda 1,4 benzinli motor kullanılır");
    }
    public void yakit(){
        System.out.println("Toyota benzinlide  araçlarda e10 yakıtı kullanılır. ");
    }
    public void yakit(Double maxTuketim){
        System.out.println("ort 6,8 lt yakıt tüketir.");
        if(maxTuketim<6.8){
            System.out.println("benzinli toyota alabilirisiniz");
        }else{
            System.out.println("isteğinize uygun toyota benzinli bulamazsınız");
        }
    }
}
