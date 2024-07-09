public class Equal {
    public static void main(String[] args) {
        String s1="Shivam";
        String s2="Shivam";
        String s3=new String ("Shivam");
        if(s1==s2){
            System.out.println("String are eual");
        }
        else{
            System.out.println("not Eql");
        }
        if(s1==s3){
            System.out.println("String are eual");
        }
        else{
            System.out.println("not Eql");
        }
        if(s1.equals(s3)){
            System.out.println("String are eual");
        }
        else{
            System.out.println("not Eql");
        }
    }
}
