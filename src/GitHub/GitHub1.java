package GitHub;

public class GitHub1 {
    public static void main(String[] args) {
        System.out.println("Sa beyler turk war mi");
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
}
