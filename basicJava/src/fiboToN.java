import java.util.Scanner;

public class fiboToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i=0;
        int n = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.println(a+" "+b+" ");
        while(i<n && c<n){

            c=a+b;
            a=b;
            b=c;
            if(c<n){
                System.out.println(c);
            }
            i++;
        }
    }
}
