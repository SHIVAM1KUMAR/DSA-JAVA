public class stringBuild {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<'x';ch++){
            sb.append(ch);
        }
        System.out.println (sb.length());
    }
}
