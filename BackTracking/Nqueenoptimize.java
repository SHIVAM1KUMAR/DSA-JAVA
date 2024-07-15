public class Nqueenoptimize{
    public static void main(String[] args) {
        int n=4;
        char board [][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
       if(nqueen(board,0)){
            System.out.println("SOlution possible");
            printboard(board);
        }else{
            System.out.println("not possiblke");
        }
        System.out.println("Total number to solve n queen"+ count);
    }
    static int count =0;

    public static boolean issafe(char board[][], int row,int col){
        //verticalup
          for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
          }
        //diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
                      if(board[i][j]=='Q'){
                        return false;
                      }
        }

        //diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++ ){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true; 
    }
    public static  boolean nqueen(char board[][], int row){
        if(row==board.length){
           // printboard(board);
           count++;
            return true;
        }
        //column 
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
            board[row][j]='Q';
           if(nqueen(board, row+1)){
            return true;
           }
           board[row][j]='X';//back track
        }
       
    }
    return false;
    }
    public static void printboard(char board[][]){
        System.out.println("-----------chessboard-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
