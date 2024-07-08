import java.util.*;
public class TwoD_Array {

    public static boolean search(int Twodmatrix[][],int key){
        for(int i=0;i<Twodmatrix.length;i++){
            for(int j=0;j<Twodmatrix[0].length;j++){
                if(Twodmatrix[i][j]== key){
                    System.out.println("Found at cell"+ i + j);
                    return true;
                }
            }
           
        }
        System.out.println("NOt FOUND");
        return false;
    }
    public static void main(String[] args) {
        int Twodmatrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int m=Twodmatrix.length, n=Twodmatrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Twodmatrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(Twodmatrix[i][j] + " ");
            }
            System.out.println();
        }
        search(Twodmatrix, 5);
        
    }
}

