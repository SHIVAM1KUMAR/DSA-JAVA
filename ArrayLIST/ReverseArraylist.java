import java.util.ArrayList;

public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(50);
        list.add(52);
        System.out.println(list);
        //Reverse list
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}
