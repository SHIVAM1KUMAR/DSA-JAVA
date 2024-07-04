import java.util.*;

public class C {

    public static int largest(int numbers[]){
        int getlargest=Integer.MIN_VALUE;
        int getsmallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(getlargest<numbers[i]){
                getlargest=numbers[i];
            }
            if(getsmallest>numbers[i]){
                getsmallest=numbers[i];
            }
        }
        System.out.println("The smallest value in array is : "+getsmallest);
        return getlargest;
    }
    public static void main(String[] args) {
        int numbers []={1,2,3,4,5,6,7};
        System.out.println("The largest no. in array: "+largest(numbers));
    }
}
