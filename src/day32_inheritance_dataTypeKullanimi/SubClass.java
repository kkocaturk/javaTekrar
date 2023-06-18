package day32_inheritance_dataTypeKullanimi;

public class SubClass extends SuperClass {
    int x = 20;

    @Override
    public void display() {
        System.out.println("SubClass x: " + x);
    }
}