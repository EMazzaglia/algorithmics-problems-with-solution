package LinkedLists;

public class RemoveDups {

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(8);
        head.next.next = new Node(5);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next = new Node(11);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next = new Node(27);

        removeDups(head);

        while(head != null) {
            System.out.println(head.value);
            head = head.next;
        }

    }
    public static void removeDups(Node head){
        if(head.next == null) return;
        Node p1 = head;
        while(p1 != null){
            Node p2 = p1.next;
            Node previousNode = p1;
            while(p2 != null){
                if(p2.value == p1.value){
                    previousNode.next = p2.next;
                } else {
                    previousNode = p2;
                }
                p2 = p2.next;
            }
            p1 = p1.next;
        }
    }

    // Time complexity of the first approach is O(N^2) but the space complexity is O(1) since we do it on the same list.
}
