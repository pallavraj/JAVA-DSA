import java.util.Scanner;

public class palinString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int j = s.length() - 1;
        boolean ans = true;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                ans = false;
                break;
            }

            i++;
            j--;

        }
        if (ans == true) {
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }
    }
}
