package stringpractice;

public class compareToString {
    public static void main(String[] args) {
        String first = "hello";
        String second = "Hello";

        //when we compare too string with compareTo() function this thing happen
        //s1 > s2 : positive value
        //s1 == s2 : 0
        //s1 < s2 : negative value

        //in this condition compareTo() give if it match with 0 
        //then it print if statement
        //else it print else statement
        if (first.compareTo(second) == 0) {
            System.out.println("Matched");
        } else {
            System.out.println("Unmatched");
        }
    }
}
