public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        findp(str, "");
    }
    public static void  findp(String str,String ans){
        //basecase
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String  newstr=str.substring(0, i)+str.substring(i+1);
            findp(newstr, ans+curr);
        }
    }
}
