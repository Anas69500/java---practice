package stringpractice;

public class firststring {
    public static void main(String[] args) {

        //creating String
        String firstname = "Mohammed";
        String middlename = "Adnan";
        String lastname = "Ahsan";

        //concatenation
        String fullname = firstname + " " + middlename + " " + lastname;

        //output
        System.out.println(fullname);

        //Convert to lowercase
        System.out.println(fullname.toLowerCase());

        //Convert to uppercase
        System.out.println(fullname.toUpperCase());

    }
}
