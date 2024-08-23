import java.util.*;

public class linear_Search{
    public static void main( String args []){
        int [] arr = {23,75,32,28,32};
        int position = linearSearch(arr,32);
        if(position==-1){
        System.out.println("\nThe element is not found.");}
        else{
            System.out.println("\nThe target element is found at the index : "+ position);
        }

    }
    // Now we will be defining the linear search algorithm 
    // However if we didn't find the desired value we will return -1
    static int linearSearch(int arr [],int target){
        if (arr.length == 0 ){
            return -1;
        }
        else{
            for (int index = 0; index < arr.length;index++){
                if(arr[index]==target){
                    return index ;
                }
            }
            return -1;
        }
    }
}