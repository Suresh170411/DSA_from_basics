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
    public void print(){
        Node curr = head;

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // reverse SLL
    public void reverseSLL(Node curr){

        if (curr == null){
            return;
        }else {
            reverseSLL(curr.next);
            System.out.println(curr.data);
        }
    }

    public static void main(String[] args) {
        SLLProblems list = new SLLProblems();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.print();
        list.reverseSLL(list.head);
    }
}
