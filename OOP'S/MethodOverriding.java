public class MethodOverriding {
    public static void main(String[] args) {
        deer d=new deer();
        d.eat();//child class wala obj child class k ahi fn call karega
    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}