public class evenDigits {

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        int[] arr = {123,34,56,65,7};

        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int arr[] ){
        int ans=0;

        for(int n : arr){
            if(even(n)){
                ans++;
            }
        }

        return ans;
    }

    private static boolean even(int n) {

        return digits(n)%2==0;

    }

    private static int digits(int n) {
        if(n<0){
            n=n*-1;
        }

        if(n==0){
            return 1;
        }
        int c = 0;

        while(n>0){
            c++;
            n/=10;

        }

        return c;
    }


}
