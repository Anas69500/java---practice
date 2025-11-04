package OOPS.Constructor;

class Employee {
    String name;
    int age;

    void detail() {
        System.out.println(this.name);//'this' keyword refers to the object that called method
        System.out.println(this.age);
    }
}

public class defaultC {
    public static void main(String[] args) {
        Employee ep = new Employee();
        ep.name = "Adnan";
        ep.age = 21;

        Employee ep2 = new Employee();
        ep2.name = "Adil";
        ep2.age = 25;

        ep.detail();
        ep2.detail();
    }
}
