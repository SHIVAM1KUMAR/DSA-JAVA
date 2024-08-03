public class Linkedlist{

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

    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
     
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.Print();
        System.out.println(ll.size);

    }
    public void removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }
}