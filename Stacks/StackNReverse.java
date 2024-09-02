import java.util.Stack;
public class StackNReverse {
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

       // printstack(s);
       //3,2,1
        reverseStacks(s);
        printstack(s);
        //1,2,3
        
    }
    public static void pushBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
         s.push(data);
         return;
        }
         int top=s.pop();
         pushBottom(s, data);
         s.push(top);
     }
     public static void reverseStacks(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStacks(s);
        pushBottom(s, top);
     }
     public static void printstack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
     }
}
