public class B_EvenorODD {
    public static void main(String[] args) {
        evenorodd(11);
        evenorodd(14);
        
    }
    public static void evenorodd(int n){
        int bitmask=1;
        if ((n & bitmask)==0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }

    }
}
