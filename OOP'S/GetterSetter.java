public class GetterSetter {
    public static void main(String[] args) {
        Pen p1=new Pen();//pen object created
        p1.setColor("blue");
        System.out.println(p1.getcolor());
        p1.setTip(5);
        System.err.println(p1.geTip());
        //p1.setColor("yellow");
        p1.setColor("yelollow");
        System.out.println(p1.getcolor());
    }
}
class Pen{
     private String color;
    private int tip;

 String getcolor(){
 return this.color;
 }

 int  geTip(){
    return this.tip;
    }

    void setColor(String newColor){
        this.color=newColor;
    }

    void setTip(int Tip){
        this.tip=Tip;
    }
}
