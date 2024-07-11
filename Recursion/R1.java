public class R1{
    public static void main(String[] args) {
        //Decreasing order
        int n=10;
        PrintDec(n);
    }
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        PrintDec(n-1);
        System.out.print(n +" ");
      //  PrintDec(n-1);
    }
}