public class StringLinearSearch {

    public static void main(String[] args) {

        String s = "PLAV RAJ";
        char t = 'P';

//        System.out.println(linearSearch(s,t));
        System.out.println(linearSearch2(s,t));

    }


    // searching for element in string using linear search
    static boolean linearSearch(String str, char e){

        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==e){
                //if element found
                return true;
            }
        }
        //if element not found
        return false;

    }

    //using enhanced for loop

    static boolean linearSearch2(String str, char e){

        if(str.length()==0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch==e){
                //if element found
                return true;
            }
        }
        //if element not found
        return false;

    }

}
