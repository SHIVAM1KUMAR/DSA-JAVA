import java.util.Scanner;

public class Whileloop {
    public static void main(String[] args) {
        int counter=1;
        int sum =0;
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        // while (counter <= 10) {
        //     System.out.println("I am ready to fight");
        //     counter++;
        // }
        // System.out.println("printed");
        while (counter <= n) {
           // System.out.println(counter);
           sum =sum +counter;
           counter++;
        }
        System.out.println(sum);
        
    }
}
