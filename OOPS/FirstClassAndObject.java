package OOPS;

class Student {
    String name;
    int age;

    void output(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class FirstClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Adnan";
        s1.age = 21;

        Student s2 = new Student();
        s1.name = "Adil";
        s1.age = 25;
        

        s1.output();
        s2.output();//it don't take object data give null and 0 in output
        
    }
}
