import java.util.LinkedList;
public class jcfLL {
    public static void main(String[] args) {
        LinkedList<Integer>LL=new LinkedList<>();
        //add
        LL.add(1);
        LL.add(2);
        LL.add(3);
        System.out.println(LL);

        //remove
        // LL.removeLast();
        // LL.removeFirst();
        LL.remove(1);
        System.out.println(LL);
        
    }
}
