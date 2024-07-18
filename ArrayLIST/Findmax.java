import java.util.ArrayList;
public class Findmax {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(60);
        //find max
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("MAX Element is:- " +max);
    }
}
