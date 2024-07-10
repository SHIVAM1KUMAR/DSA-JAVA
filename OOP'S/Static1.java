public class Static1 {
public static void main(String[] args) {
    Student s1=new Student();
    s1.ScN="GDS";
    Student s2=new Student();
    System.out.println(s2.ScN);

}
}

class Student{
    String name;
    int rn;

    static String ScN;
    void setName(String name){
        this.name=name;
    }
    String  getName(){
       return  this.name;
    }
}
