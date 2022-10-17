public class findMin {

    public static void main(String[] args) {

        int[] arr = {1,2,3,45,56,34,12,67,89, -9};

        System.out.println(min(arr));

    }

    //search for min element in the array
    //arr length not equal to zero
    static int min(int[] arr){

    int ans = arr[0];

    for (int i=0;i<arr.length;i++){

        if(arr[i]<ans){
            ans=arr[i];
        }
    }


        return ans;
    }


}
