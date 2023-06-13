package day29_inheritance.inheritanceOrnek;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}
