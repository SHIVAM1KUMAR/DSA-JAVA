public class OOPS1{
public static void main(String[] args) {
    Pen p1=new Pen();//pen object created
    p1.setColor("blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.err.println(p1.tip);
    //p1.setColor("yellow");
    p1.color="yellow";
    System.out.println(p1.color);


}

}
class Pen{
    String color;
    int tip;


    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}


class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int eng,int math){
        percentage=(phy +chem+math+eng)/4;
    }
}