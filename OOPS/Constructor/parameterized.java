package OOPS.Constructor;

import practicequestion.sumOfDigit;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void record(){
        System.out.println(name + " " + age);
    }
}

public class parameterized {
    public static void main(String[] args) {
        Student s1 = new Student("Adnan", 21);
        Student s2 = new Student("Adil", 25);

        s1.record();
        s2.record();

    }
}
