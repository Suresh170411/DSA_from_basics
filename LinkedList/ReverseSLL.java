public class ReverseSLL {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            System.out.println("Empty LinkedList !");
        }else {
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void print(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node nxt = null;

        while (curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        ReverseSLL list = new ReverseSLL();

        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(1);

        list.print(list.head);
        Node list2 =  list.reverseList(list.head);
        list.print(list2);
    }
}
