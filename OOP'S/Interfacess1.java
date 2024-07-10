public class Interfacess1{
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}



 interface  ChessPlayers {
void moves();
    
}

class Queen implements ChessPlayers{
   public  void moves(){
System.out.println("all four directons");
    }
}

class Rook implements ChessPlayers{
    public  void moves(){
 System.out.println("up, down,lef right");
     }
 }

 class King implements ChessPlayers{
    public  void moves(){
 System.out.println("up,down,left,right,1-step");
     }
 }