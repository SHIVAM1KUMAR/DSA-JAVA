public class F {
    public static void pairs(int []n){
        int tp=0;
        for(int i=0;i<n.length;i++){
            int curr=n[i];
            for(int j=i+1;j<n.length;j++){
                System.out.print("(" + curr +" ,"+n[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+tp);
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        pairs(n);
    }
}
