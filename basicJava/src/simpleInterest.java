import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER PRINCIPLE");
        int p = sc.nextInt();
        System.out.println("ENTER TIME");
        int t = sc.nextInt();
        System.out.println("ENTER RATE");
        int r = sc.nextInt();

        int s = 0;
        s =(p*r*t)/100;

        System.out.println(s);
    }

}
