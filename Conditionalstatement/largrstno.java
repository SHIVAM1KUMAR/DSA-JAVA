
import java.util.Scanner;
public class largrstno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b) {
            System.out.println("The largest no. is a=" + a);
        }else{
            System.out.println("the largest no is b =" +b);
        }
    }
}
