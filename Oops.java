class Person {
    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public void output() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Oops {
    public static void main(String[] args) {
        Person p1 = new Person("Anitus", 19);
        p1.output();
    }
}
