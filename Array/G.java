public class G {
    public static void maxsubarraysum(int n[]){
       int  currsum=0;
       int maxsum=Integer.MIN_VALUE;


        for(int i=0;i<n.length;i++){
            int start=i;
            for(int j=i;j<n.length;j++){
                int end=j;
            currsum=0;
                for(int k=start;k<=end;k++){
                   // System.out.print(n[k] +" ");
                   currsum +=n[k];
                }
        System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                
            }
          
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
       maxsubarraysum(n);
    }
}
