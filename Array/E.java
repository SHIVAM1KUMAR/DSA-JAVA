public class E {
    public static void reverse ( int number[] ) {
        int first=0;int last=number.length-1;
        while(first<last){
            int t=number[last];
            number[last]=number[first];
            number[first]=t;
            
            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int number[]={10,2,0,30,40,50};
        reverse(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
System.out.println();
    }
}
