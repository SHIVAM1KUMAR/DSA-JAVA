public class B_powercheck {
    public static void main(String[] args) {
        System.out.println(ispowerofTwo(16));
    }
    public static boolean ispowerofTwo(int n){
        return (n&(n-1))==0;
    }
}
