package LinkedList;

public class SLLProblems {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // add to last
    public void add(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }else {
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }
    
    // print all nodes
    public void print(Node head){
        Node curr = head;

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // reverse SLL without reversing SLL using recursion
    public void reverseSLL(Node curr){

        if (curr == null){
            return;
        }else {
            reverseSLL(curr.next);
            System.out.println(curr.data);
        }
    }

    // reverse SLL
    public void reverseLinkedList(){
        Node curr = head;
        Node nextNode = null;
        Node prevNode = null;

        while (curr != null){
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        head = prevNode;
        print(head);
    }

    // reverse linkedlist by k groups
    public Node reverseByK(Node head, int k){
        Node nextNode = null, prev = null, curr = head;

        int count = 0;

        while (curr != null && count < k){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            count++;
        }
        if (nextNode != null){
            head.next = reverseByK(nextNode, k);
        }
        return prev;
    }    

    public static void main(String[] args) {
        SLLProblems list = new SLLProblems();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        // list.print();
        // list.reverseSLL(list.head);
        // list.reverseLinkedList();
        Node curr = list.reverseByK(list.head, 3);
        list.print(curr);
    }
}
