public class RemoveDupsSorted {
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
            System.out.println("Empty !");
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
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public Node removeDups(Node head){
        Node curr = head;
        Node prev = head;

        while (curr != null){
            if (curr.data != prev.data){
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDupsSorted list = new RemoveDupsSorted();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);

        Node li = list.removeDups(list.head);
        list.print(li);
    }
}
