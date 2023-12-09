package LinkedList;

public class SLL {
    
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //add node to last
    public void insertLast(int data){
        Node new_node = new Node(data);

        if (head == null){
            head = new_node;
        }else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new_node;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    public void print(){
        Node curr = head;

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);

        list.insertFirst(22);

        list.print();
    }
}
