public class Fact {
    public static void main(String[] args) {
        int n=5;
       System.out.println( Fact(n));
    }
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int Fnm1=Fact(n-1);
        int fn=n*Fact(n-1);
        return fn;
    }
}
