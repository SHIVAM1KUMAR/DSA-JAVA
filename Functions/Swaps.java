public class Swaps {
    public static void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
        System.out.println("A is"+a);
        System.out.println("A is"+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        swap(a, b);
       
    }
}
