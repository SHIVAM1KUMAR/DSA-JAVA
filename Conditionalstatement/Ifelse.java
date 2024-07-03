
import java.util.*;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int age=sc.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for voting");
        }
        else if (age>=13 && age<18) {
            System.out.println("Teen Ager");
        }
        else{
            System.out.println("Not Eligible for voting");
        }
    }
}
