public class searchInRange {

    public static void main(String[] args) {

    int[] arr = {1,2,3,45,56,34,12,67,89};
    int t = 89;
    //i/p for start and end of range for searching
    int s = 2;
    int e = 6;

        System.out.println(linearSearch(arr,t,s,e));

    }


    static int linearSearch(int [] arr, int element, int start, int end){

        //return -1 if size of array is zero as no need to search element or iterate array
        if (arr.length==0){
            return -1;
        }

        // search for element in array by iterating one by one

        for(int i=start;i<=end;i++){
            if(arr[i]==element){
                // if found return index and code come out of function
                return i;
            }
        }

        // return -1 if element not found in array
        return -1;

    }


}

