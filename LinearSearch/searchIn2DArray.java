import java.lang.reflect.Array;
import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {

        int[][] arr= {
                {1,2,3},
                {5,6,7,89},
                {45,67,8,-2}
        };

        int target = 45;

        int [] a = search(arr,target);
        System.out.println(Arrays.toString(a));

    }

    static int[] search(int[][] arr, int t){

        for(int row=0;row<arr.length;row++){

            for(int col=0;col<row;col++){
                if(arr[row][col]==t){
                    return new int[]{row,col};
                }
            }

        }

       return new int[]{-1,-1};
    }
}
