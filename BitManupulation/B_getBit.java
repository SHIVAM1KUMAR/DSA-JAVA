public class B_getBit {
    public static void main(String[] args) {
        System.out.println(getbit(10, 2));
    }
    public static int getbit(int n,int i){
        int bitMask=1<<i;
        if((n &bitMask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }
}
