public class B {
    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7,8,9,10};
        int key =10;
        // int index =linearSearch(number, key);
        // if(index==-1){
        //     System.out.print("Index not found");
        // }else{
        //     System.out.println("Key is at index  "   +index);
        // }
        linearSearch(number, key);
        System.out.println(linearSearch(number, key));

    }
}
