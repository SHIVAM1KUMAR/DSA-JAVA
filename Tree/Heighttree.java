public class Heighttree {
    static class Node {
        int data;
        Node left,right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height( Node root){
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
         return Math.max(lh, rh)+1;
    }
    public static int count (Node root){
        if( root == null){ 
            return 0;

        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }
    public static int diameter(Node root){
        if( root == null){ 
            return 0;

        }
        int ld=diameter(root.left);
        int lht=height(root.left);
        int rd=diameter(root.right);
        int rht=height(root.right);
        int selfD=lht+rht+1;
        return  Math.max(selfD,Math.max(ld,rd));
    }
    public static void main(String[] args) {
        /*
         *  1
         * /  \
         * 2   3
         * /\  /\
         * 4 5 6 7
         */
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);
    System.out.println(diameter(root));
    }
}
