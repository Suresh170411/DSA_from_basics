public class FindEleInY {
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
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = node;
        }
    }

    public void print(Node head){
        Node curr = head;

        while (curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int findCommonInY(Node head1, Node head2){
        int l1 = findLength(head1);
        int l2 = findLength(head2);

        if (l1==0 || l2==0) return -1;

        if (l1 > l2){
            int diff = l1-l2;
            return findCommon(diff, head1, head2);
        }else {
            int diff = l2-l1;
            return findCommon(diff, head2, head1);
        }
    }

    public int findCommon(int diff, Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;

        for (int i=1; i<=diff; i++){
            curr1 = curr1.next;
        }

        while (curr1 != null && curr2 != null){
            if (curr1 == curr2) return curr1.data;

            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }

    public int findLength(Node head){
        int count = 0;
        if (head == null) return 0;

        Node curr = head;
        while (curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        FindEleInY list1 = new FindEleInY();
        FindEleInY list2 = new FindEleInY();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        list2.add(7);
        list2.add(8);
        
        list2.head.next.next = list1.head.next.next.next;
        list2.head.next.next.next = list1.head.next.next.next.next;
        list2.head.next.next.next.next = list1.head.next.next.next.next.next;

        list1.print(list1.head);
        list2.print(list2.head);

        int res = list1.findCommonInY(list1.head, list2.head);
        System.out.println(res);
    }
}
