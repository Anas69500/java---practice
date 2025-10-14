package stringpractice;

public class stringbuilder {
    public static void main(String[] args) {
        //create StringBuilder
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        //replace a character with provided index number and character
        sb.setCharAt(1, 'a');
        System.out.println(sb);

        //Add character with provided index number and character
        sb.insert(5, 'a');
        System.out.println(sb);

        //deleting character with provided range between index number
        sb.delete(5, 6);
        System.out.println(sb);

        //replace character
        sb.setCharAt(1, 'e');
        System.out.println(sb);

        //Add character or sentence
        sb.append(" everyone");
        System.out.println(sb);

        //checking length
        System.out.println(sb.length());

        //printing character
        System.out.println(sb.charAt(0));

    }
}
