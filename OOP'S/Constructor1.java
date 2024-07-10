public class Constructor1 {
public static void main(String[] args) {
    Student s1=new Student();
    // Student s2=new Student("Shivam");
    // Student s3=new Student(98);
    //System.out.println(s1.name);
    s1.name="shivam";
    s1.rn=98;
    s1.password="abc";
    s1.marks[0]=100;
    s1.marks[1]=100;
    s1.marks[2]=100;

    Student s2=new Student(s1);//copy
    s2.password="xyz";
 s1.marks[2]=77;
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }
    
}}

class Student{
    String name;
    int rn;
    String password;
    int marks[];



//Shallow copy constructor
// Student (Student s1){
//     marks=new int[3];
//     this.name=s1.name;
//     this.rn=s1.rn;
//     this.marks=s1.marks;
// }


//Deep copy Constructor
Student (Student s1){
    marks=new int[3];
    this.name=s1.name;
    this.rn=s1.rn;
    for( int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
    }
}
    //Constructor created
    Student(String name){
        marks=new int[3];
      this.name=name;//parameterised
    }
// }
Student(){
    marks=new int[3];
    System.out.println("constructor is caled...");//non parameterised
}
Student(int rn){
    marks=new int[3];
    this.rn=rn;
}
}