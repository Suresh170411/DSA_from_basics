package LinkedList;

public class BasicSLLop {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void add(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void print(Node head){
        Node curr = head;

        if (head == null){
            System.out.println("Empty SLL !");
        }else {
            while (curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public void addAfterParticular(int element, int data){
        Node curr = head;
        Node node = new Node(data);

        while (curr.data != element){
            curr = curr.next;
        }

        node.next = curr.next;
        curr.next = node;
    }

    public void insertBeforeParticular(int element, int data){
        Node curr = head;
        Node prev = null;

        while (curr.data != element){
            prev = curr;
            curr = curr.next;
        }
        Node node = new Node(data);
        node.next = curr;
        prev.next = node;
    }

    public void deleteAtBegining(){
        Node curr = head;
        head = curr.next;
    }

    public void deleteLast(){
        Node curr = head;
        Node prev = null;
        while (curr.next != null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
    }

    public void deletParticular(int ele){
        Node curr = head;
        Node prev = null;

        while (curr.data != ele){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
    }

    public void deleteBeforeElement(int element){
        Node curr = head;
        Node prev = null;
        Node pprev = null;

        while (curr.data != element){
            pprev = prev;
            prev = curr;
            curr = curr.next;
        }
        pprev.next = curr;
    }

    public static void main(String[] args) {
        BasicSLLop list = new BasicSLLop();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // list.addAfterParticular(2, 5);
        list.insertBeforeParticular(3, 5);

        list.print(list.head);

        // list.deleteAtBegining();
        // list.deleteLast();
        // list.deletParticular(5);

        list.deleteBeforeElement(3);
        list.print(list.head);
    }
}
