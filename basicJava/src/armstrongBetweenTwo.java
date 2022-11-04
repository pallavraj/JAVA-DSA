import java.util.Scanner;

public class armstrongBetweenTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i=0;
        for(i=n1+1;i<n2;i++){

            if(isArm(i)){
                System.out.println(i);

            }

        }

    }

    public static boolean isArm(int n){

        boolean ans= false;
        int a=0,a1=0;
        int o = n;
        while(n!=0){

            int temp = n;
            temp= n%10;
            a = (int)Math.pow(temp,3);
            a1+=a;
            n=n/10;
        }
        if(o==a1){
            ans = true;
        }
        return ans;
    }


}
