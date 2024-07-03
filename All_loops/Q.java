import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        do{
            int n=sc.nextInt();
            if(n%10==0){
                //break;
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
