import java.util.*;
public class A{
    public static void main(String[] args) {
        char arr[]={'a','b'};
        String str="abcd";
        System.out.println(str);
        String str1=new String("xyz@#");
        System.out.println(str1);
        System.out.println("Name please?");
        Scanner sc=new Scanner (System.in);
        String name=sc.nextLine();
        System.out.println("Your name is:"+name);
        //length
        String fn="Shivamkumar ";
        System.out.println(fn.length());
       //concatenation
       String first="SHIVAM";
       String last="kumar";
       String con=first+last;
      // System.out.println(con);

       //.charAt(0)
       printstr(con);
    }
    public static void printstr(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) +   " ");
        }
        System.out.println();
    }
}