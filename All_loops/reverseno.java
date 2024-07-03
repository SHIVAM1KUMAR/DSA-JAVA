public class reverseno {
    public static void main(String[] args) {
    // int n=141102;
    // while (n>0) {
    //     int lastdigit=n%10;
    //     System.out.print(lastdigit);
    //     n=n/10;//n/=10
    //    // System.out.println();
    // }

    int n=141102;
    int rev=0;
    while (n>0) {
        int lastdigit=n%10;
     rev=(rev*10)+lastdigit;
        n=n/10;//n/=10
       // System.out.println();
    }
    System.out.print(rev);

    }
}
