public class RotateKnodeAC {
    class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addNodeToLast(int data){
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

    public void addFirst(int data){
        Node node = new Node(data);

        if (head == null){
            head = node;
        }else {
            node.next = head;
            head = node;
        }
    }

    public void print(Node head){
        Node curr = head;

        if (head == null){
            System.out.println("Empty LinkedList !");
        }

        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public Node rotateKNodeAntiClock(Node head, int K){
        
        Node temp = head;

        for (int i=1; i<K; i++){
            temp = temp.next;
        }
        
        Node curr = temp.next;

        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = head;
        head = temp.next;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        RotateKnodeAC list = new RotateKnodeAC();

        list.addNodeToLast(2);
        list.addNodeToLast(3);
        list.addNodeToLast(4);
        list.addNodeToLast(5);
        list.addNodeToLast(6);
        list.addFirst(1);

        list.print(list.head);
        System.out.println("=========");
        Node newHead = list.rotateKNodeAntiClock(list.head, 4);
        list.print(newHead);
    }
}
