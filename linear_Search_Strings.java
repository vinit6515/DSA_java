import java.util.*;
import java.io.*;

public class linear_Search_Strings {
    public static void main(String[] args) {
        String str = "Hello World"  ;
        char target = 'c';
       System.out.println( linearSearch(str, target));
    } 
    
    //So here we are basically checking whether the string contains the 
    // target character or not 
    static boolean linearSearch ( String str , char target){
        if(str.length()==0){
            return false;
        }
        else{
            for (int i = 0; i < str.length(); i++) {
                if(target == str.charAt(i)){
                    return true;
                }
            }
            return false;
        }
    }
}
