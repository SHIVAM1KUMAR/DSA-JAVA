public class MergeSortLL {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.Print();
        ll.head = ll.mergeSort(ll.head); // Assign sorted head back to the list
        ll.Print();
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data; // Assigning the value 
            this.next = null;
        }
    }

    public static class Linkedlist {
        public static Node head;

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void Print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        private Node merge(Node head1, Node head2) {
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            // Use head1 and head2 instead of head
            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head1.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                }
                temp = temp.next;
            }

            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            return mergedLL.next; // Return the merged list, skipping the dummy node
        }

        private Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow; // Return the middle node
        }

        // The correct mergeSort method in Linkedlist
        public Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            // Find mid
            Node mid = getMid(head);

            // Split into left and right
            Node rightHead = mid.next;
            mid.next = null;

            // Sort both halves recursively
            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);

            // Merge both halves
            return merge(newLeft, newRight);
        }
    }
}
