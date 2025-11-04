package OOPS.Constructor;

class Data {
    String name;
    int age;

    //parameterized constructor
    Data(String n, int a){
        this.name = n;
        this.age = a;
    }

    //copy constructor
    Data(Data d){
        this.name = d.name;//copy name from another object 
        this.age = d.age;//copy age from another object
    }

    void detail(){
        System.out.println(name + " " + age);
    }
    
}

public class copyC {
    public static void main(String[] args) {
        Data d = new Data("Adnan", 21);//original object

        Data d1 = new Data(d);//copy constructor called

        d.detail();
        d1.detail();
    }
}
