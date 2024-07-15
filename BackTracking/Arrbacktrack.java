public class Arrbacktrack{
    public static void main(String[] args) {
        int arr[]=new int[5];
        Changearr(arr,0,1);
        Printarr(arr);
    }
    public static void Changearr(int arr[],int i,int val){
        //bae case
        if(i==arr.length){
            Printarr(arr);
            return;

        }

        //Recursion //Backtrack
        arr[i]=val;
        Changearr(arr, i+1, val+1);//fn can step
        arr[i]=arr[i]-1;//backtrack

    }
    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}