public class subString {
    public static void main(String[] args) {
        String str="Shivam kumar";
        System.out.println(Substr(str, 0, 6));
    }
    public static String Substr(String str,int si,int ei){
        String Substr="";
        for(int i=si;i<ei;i++){
            Substr +=str.charAt(i);
        }
        return Substr;
    }
}
