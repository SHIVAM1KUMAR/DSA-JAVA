public class Incometax {
    public static void main(String[] args) {
        int tax=0;
        int income=5000000;
        if (income==500000) {
            System.out.println("You are tax free");
        }
        else if(income>=500000 && income<1000000){
            tax= (int) (income*0.2);

        }
        else{
            tax=(int) (income*0.3);
           
        }
System.out.println("Your tax is" + tax);
    }
}
