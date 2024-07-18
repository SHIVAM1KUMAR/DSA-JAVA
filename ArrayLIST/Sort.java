import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);//Assending order
        System.out.println("After sorted"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending order"+list);
    }
}
