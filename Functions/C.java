import java.util.*;

public  class C {
    public static int factorial(int n){
         int f=1;
         for(int i=1;i<=n;i++){
            f=f*i;
         }
         return f;
}
public static int bc(int n,int r){
  int fact_n=factorial(n);
  int fact_r=factorial(r);
  int fact_nmr=factorial(n-r);
  int bc=fact_n/(fact_r*fact_nmr);
  return bc;
}
  
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
      
      System.out.println(bc(n,r));
    }
  }

