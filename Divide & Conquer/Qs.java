public class Qs {
    public static void main(String[] args) {
        int arr[]={5,2,3,1,6,4,8,7,9};
        qs(arr,0,arr.length-1);
        pa(arr);
    }
    public static void pa(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void qs(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        qs(arr, si, pidx-1);//left
        qs(arr, pidx+1, ei);//right

    }
    public static int partition(int arr[],int si, int ei){
           int pivot =arr[ei];
           int i=si-1;//jagah banana
           for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
           }
           i++;
           int temp=pivot;
           arr[ei]=arr[i];
           arr[i]=temp;
           return i;
    }
}
