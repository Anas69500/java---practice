package stringpractice;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        for (int i = 0; i < sb.length()/2; i++) {
            //storing front index value of String
            int front = i;
            //storing back index value of String
            int back = sb.length() - 1 - i;

            //storing front character in frontchar
            char frontchar = sb.charAt(front);
            //storing back character in backchar
            char backchar = sb.charAt(back);

            //replacing with setcharAt(index value == front, character = backchar) 
            sb.setCharAt(front, backchar);
            //replacing with setcharAt(index value == back, character = frontchar) 
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
    }
}
