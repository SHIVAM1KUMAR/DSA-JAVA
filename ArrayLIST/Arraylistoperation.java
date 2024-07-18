import java.util.ArrayList;

public class Arraylistoperation{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Boolean> lisst=new ArrayList<>();
        ArrayList<Float> lissst=new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(50);
        list.add(52);
        list.add(1,9);
        System.out.println(list);
        System.out.println(list.size());
        //print arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //get operaton
        
        int element= list.get(2);
        System.out.println(element);

        //remove operation
        list.remove(2);
        System.out.println(list);

        //set
        list.set(2,10);
        System.out.println(list);

        System.out.println(list.contains(5));
        System.out.println(list.contains(55));
    }
}