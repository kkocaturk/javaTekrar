package day29_inheritance.inheritanceOrnek;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345);
        student.displayInfo();
    }
}

/*
    Yukarıdaki örnekte, Person sınıfı bir üst sınıf olarak tanımlanmış ve name özelliği ve displayInfo metodu bulunuyor.
    Student sınıfı ise Person sınıfını extend ediyor ve studentId özelliği ve displayInfo metodu bulunuyor.
    displayInfo metodu Student sınıfında override edilmiştir.

    Bu örnekte, Student sınıfından bir obje oluşturulmuş ve displayInfo metodu çağrılmıştır.
    Çıktıda hem Person sınıfının displayInfo metodu hem de Student sınıfının displayInfo metodu çalışmıştır.
    Bu, override edilen metotların alt sınıfın nesnelerinde çağrıldığında alt sınıfın metodu çalışacağını gösterir.
 */