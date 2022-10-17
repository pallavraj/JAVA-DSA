import java.util.Scanner;

public class linearSearchAlgo {

    public static void main(String[]args){

        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");

        int n = sc.nextInt();
        System.out.println("ENTER ELEMENT TO SEARCH");

        int e = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER ARRAY ELEMENT");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int out = linearSearch(arr,e);
        System.out.println(out);
    }

    //using enhanced for loop
    static int linearSearch2(int [] arr, int element){

        //return -1 if size of array is zero as no need to search element or iterate array
        if (arr.length==0){
            return -1;
        }

        // search for element in array by iterating one by one

        for (int e : arr) {
            if (e == element) {
                // if found return index and code come out of function
                return e;
            }
        }

        // return  if element not found in array
        return Integer.MAX_VALUE;

    }

    //search and element in array if found return index and if not return -1

    static int linearSearch(int [] arr, int element){

        //return -1 if size of array is zero as no need to search element or iterate array
        if (arr.length==0){
            return -1;
        }

        // search for element in array by iterating one by one

        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                // if found return index and code come out of function
                return i;
            }
        }

        // return -1 if element not found in array
        return -1;

    }

}
