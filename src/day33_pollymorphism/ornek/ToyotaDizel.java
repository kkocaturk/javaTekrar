package day33_pollymorphism.ornek;

public class ToyotaDizel extends A_Toyota {
    public void motor() {
        System.out.println("Toyota dizel araçlarda 1,6 dizel motor kullanılır");
    }
    public void yakit(){
        System.out.println("Toyota dizel  araçlarda euroDizel yakıtı kullanılır. ");
    }
    public void yakit(String renk){
        System.out.println("toyota dizel araçlar 3 renkte üretilmiştir.");
        if(renk.equalsIgnoreCase("beyaz") || renk.equalsIgnoreCase("siyah") || renk.equalsIgnoreCase("mavi")){
            System.out.println("istediğiniz renk toyota bulunmaktadır");
        }else {
            System.out.println("istediğiniz renkte toyota yoktur.");
        }
    }
}
