public class D {
    public static int BS(int number[],int key){
        int start=0;int end=number.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number []={1,2,4,5,8,9,10,77};
        int key =77;
        System.out.println("The key is at index: "+BS(number, key));
    }
}
