public class Abstractio1 {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
        Chicken c =new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("Animals eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    void chcolor(){
        color="dark";
    }
    void walk(){
        System.out.println("wlaks on 4 leg");
    }
}
class Chicken extends Animal{
    void chcolor(){
        color="dareeeeek";
    }
    void walk(){
        System.out.println("wlaks on 2 leg");
    }
}