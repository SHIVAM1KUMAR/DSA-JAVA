public class ReversingLL{

    public static class  Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;//Assigning the value 
            this.next=null;
        }
    
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
    
        //1.create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
    
        //2.newnode=head
        newNode.next=head;//link
        //3.head=newnode
        head=newNode;
    }
    public void  addLast(int data){
         //1.create a new node
         Node newNode=new Node(data);
         size++;
         if(head==null){
            head=tail=newNode;
            return;
        }
         //2.tail->next=null==new node
         tail.next=newNode;
         //3 tail=new node
         tail=newNode;
    }
    public void Print(){
        if(head==null){
            System.out.println("LL Is Empty");
            return;
        }
        Node temp=head;
        while(temp != null){
              System.out.print(temp.data+"->");
              temp=temp.next;
        }
        System.out.println("null");
    }
    
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1
        newNode.next=temp.next;
        temp.next=newNode;
    
    }

    public int removeFirst(){
        if(size==0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val =head.data;
        head=head.next;
        size--;
        return val;//remove first ot
    }

public int removeLast(){
    if(size==0){
        System.out.print("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
        int val =head.data;
        head=tail=null;
        size=0;
        return val;
    }
    //pre :i=size-2
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev =prev.next;
    }
    int val=prev.next.data;//tail data
    prev.next=null;
    tail=prev;
    size--;
    return val;
}
//liner search
public int itrSearch(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){//key found
            return i;
        }
        temp =temp.next;
        i++;
    }
    return -1;
}

//recursion Search
public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next, key);
    if(idx==-1){
        return -1;
    }
    return idx+1;

}
public int Rsearch(int key){
 return helper (head,key);
}

//reverse LL
public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}

public void deleteNthfromEnd(int n){
    //calculate size
    int sz = 0;
    Node temp=head;
    while(temp != null){
        temp=temp.next;
       sz++;
    }
    if(n ==sz){
        head=head.next;//return remove first
        return;
    }
    //size -n
    int i=1;
    int iToFind=sz-n;
    Node prev =head;
    while(i<iToFind){
prev =prev.next;
i++;
    }
    prev.next=prev.next.next;
    return;
}
    
        public static void main(String[] args) {
        ReversingLL ll=new ReversingLL();
         
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(4);
            ll.addLast(5);
            ll.add(2, 3);
            ll.Print();
            ll.deleteNthfromEnd(3);
            ll.Print();
            // ll.reverse();
            // ll.Print();
            // ll.removeFirst();
            // ll.Print();
            // ll.removeLast();
            // ll.Print();
            // System.out.println(ll.Rsearch(3));
            // System.out.println(ll.Rsearch(10));
            System.out.println(ll.size);
    
        }
    }