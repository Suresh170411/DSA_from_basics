public class FindKElmFromEnd {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void addLast(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int length(Node head){
        Node curr = head;

        if (head == null){
            return 0;
        }

        int count = 0;
        while (curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void findKthElementFromEndApproach1(Node head, int k){
        Node curr = head;

        if (head == null){
            System.out.println("Empty LinkedList !");
        }else {
            for (int i=1; i<length(head)-k+1; i++){
                curr = curr.next;
            }
            System.out.println("Number "+ k +" Element From End is : "+curr.data);
        }
    }

    public void findKthElementFromEnd(Node head, int k){
        Node fast = head;
        Node slow = head;

        if (fast == null){
            System.out.println("Empty LinkedList !");
        }else {
            for (int i=1; i<k && fast != null; i++){
                fast = fast.next;
            }

            if (fast == null){
                System.out.println("Empty LinkedList !");
            }

            while (fast.next != null && slow.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            System.out.println(slow.data);
        }
    }

    public static void main(String[] args) {
        FindKElmFromEnd list = new FindKElmFromEnd();

        list.addLast(0);
        list.addLast(2);
        list.addLast(3);

        list.addFirst(1);

        list.print(list.head);

        list.findKthElementFromEndApproach1(list.head, 2);
        list.findKthElementFromEnd(list.head, 2);
    }
}
