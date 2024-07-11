public class Firstoccurance {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4,6,5,7,8};
      System.out.println(LastOccurance(arr, 5, 0));
    }


    //First Occurance
    public static int FirstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
          if(arr[i]==key){
              return i;
    }
  return  FirstOccurance(arr,key,i+1);
}



//last Occurance
public static int LastOccurance(int arr[],int key,int i){
    if(i==arr.length){
        return -1;
    }
    int isfound=LastOccurance(arr,key,  i+1);
if(isfound==-1 && arr[i]==key){
    return i;
}
return isfound;
    }
}
