public class Accessmodifiers {
    public static void main(String[] args) {
       BankAccount myAccount =new BankAccount();
       myAccount.username="Shivam kumar";
       myAccount.setPassword("123456");
       
    }
}
    class BankAccount{
        public String username;
        private String password;
        public void setPassword(String pwd){
            password=pwd;
        }
    }

