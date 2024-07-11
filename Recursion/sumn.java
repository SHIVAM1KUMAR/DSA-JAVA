public class sumn{
    public static void main(String[] args) {
        int n=5;
       System.out.println( Sumn(n));
    }
    public static int Sumn(int n){
        if(n==1){
            return 1;
        }
        int Snm1=Sumn(n-1);
        int sn=n+Sumn(n-1);
        return sn;
    }

}

