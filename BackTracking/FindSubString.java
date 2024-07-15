public class FindSubString {
    public static void main(String[] args) {
        String str ="ABC";
    PrintSubstring(str, "", 0);
        
    }
    public static void PrintSubstring(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
            System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
       PrintSubstring(str,ans+str.charAt(i),i+1);
       PrintSubstring(str,ans,i+1);
    }
}
