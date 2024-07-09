public class B_expo {
    public static void main(String[] args) {
        System.out.println(fastexpo(3, 5));
    }
    public static int fastexpo(int a,int n){
        int ans=1;
        while (n>0) {
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
}
