import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n =s.nextInt();

        oddEven(n);


    }

    static  void oddEven(int n) {

        String ans = "ODD";

        if(n%2==0) {
            ans = "EVEN";
        }

        System.out.println(ans);
    }

}
