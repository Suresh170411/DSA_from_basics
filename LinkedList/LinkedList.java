package LinkedList;

public class LinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    private int size;

    // add element to the last of the linkdedlist
    public void addLast(int data){
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
        size++;
    }

    // add element to the begining of the linkedlist
    public void addFast(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // for odd length linked list this function will find the middle node
    public int findMiddleNodeODD(){
        Node slow = head;
        Node fast = head;

        if (head == null){
            return -1;
        }
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // this function will return middle node of a Even size linkedlist
    public int findMiddleNodeEVEN(){
        Node slow = head;
        Node fast = head;
        Node prev = null;

        if (head == null){
            return -1;
        }

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return prev.data;
    }

    public void print(){
        Node curr = head;

        if (head == null){
            System.out.println("Empty LinkedList !");
            return;
        }

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    //iterative approach using length
    public int kThNodeFromEnd(int k){
        Node curr = head;
        if (size < k){
            return -1;
        }
        for (int i=1; i<size-k+1; i++){
            curr = curr.next;
        }
        return curr.data;
    }

    // finding without using length
    public int kThNodeFromEndOPT(int k){
        Node slow = head;
        Node fast = head;

        if (head == null){
            return -1;
        }

        for (int i=1; i<k && slow != null; i++){
            slow = slow.next;
        }

        if (slow == null){
            return -1;
        }

        while (slow.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast.data;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        System.out.println(list.kThNodeFromEndOPT(2));
    }
}