public class First{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;//cq
        Queue(int n){
            arr=new int [n];
            size=n;
            rear=-1;
            front=-1;//cq

        }
        public static boolean isEmpty(){
            return rear ==-1 && front==-1;//cq
        }
        public static boolean isFull(){
            //cq
            return (rear +1)%size==front;
            
        }
        //add
        public static void  add(int data){
            // if(rear ==size-1){
                if(isFull()){//cq
                System.out.println("queuq is full");
                return;
            }
            if(front ==-1){
                front =0;
            }
           // rear=rear+1;
           rear=(rear+1)%size;//cq
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return-1;
            }
            //int front =arr[0];
                //   for(int i=0;i<rear;i++){
                //     arr[i]=arr[i+1];
                //   }
                      // rear =rear-1;
           // return front;

                int result =arr[front];
                 
                  //last element delete
                  if(rear ==front){
                    rear =front=-1;
                  }else{
                    front =(front+1)%size;
                  }
              return result;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
       
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()){
            
            System.out.println(q.peek());
           
            q.remove();
            
        }
        
    }
}