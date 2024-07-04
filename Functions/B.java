import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculatesum(a,b);
}
public static void calculatesum(int n1,int n2){
   
    int sum =n1+n2;
    System.out.println(sum);

}
}
