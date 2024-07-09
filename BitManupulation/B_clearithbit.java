public class B_clearithbit {
    public static void main(String[] args) {
        System.out.println(clearbitmask(10, 1));
        
    }
    public static int clearbitmask(int n,int i){
        int bitMask=~(1<<1);
        return n& bitMask;
    }
}
