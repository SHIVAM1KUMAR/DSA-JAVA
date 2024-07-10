public class Inherit1 {
    public static void main(String[] args) {
        // Fish Shark =new Fish();
        // Shark.eat();
        // Shark.breath();
        // Shark.swim();


        // dog sheru=new dog();
        // sheru.eat();
        // sheru.legs=4;
        // System.out.println(sheru.legs);
        // sheru.breed="black";
        // System.out.println(sheru.breed);
        bird sp=new bird();
        sp.eat();
        sp.fly();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("EAts");
    }
    void breath(){
        System.out.println("Breats of animal....");
    }
}
//derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Fish started swiming in water");
//     }
// }


// class mammal extends Animal{
//     int legs;
// }
// class dog extends mammal{
//     String breed;
// }

class mammal extends Animal{
    void walks(){
        System.out.println("walking...");
    }
     }


     class Fish extends Animal{
        void swim(){
            System.out.println("Swiming...");
        }
         }

         class bird extends Animal{
            void fly(){
                System.out.println("flying...");
            }
             }