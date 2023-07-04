package day33_pollymorphism.ornek;


/*

pollymorphizm= overloading+ overriding
overloading = aynı isim ama farklı signature kullanmak
overriding = inheritance kullanarak parent class'ta var olan bir methodun child classlarda uyarlayarak farklı işlev yaptırmak

 */

public class A_Toyota {
public void motor(){
    System.out.println("toyotada toyota motor kullanılır");
}
public void yakit(){
    System.out.println("toyota  toyota yakıt kullanılır");
}

}
