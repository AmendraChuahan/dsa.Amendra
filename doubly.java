// doubly linkedlist 
public class doublylinkedlist {
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    // print reverse
    public  static  void reverse( Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp= temp.prev;
        }
        System.out.println();
    }
    public static  void main(String [] agas){
            Node a = new Node(1);
            Node b = new Node(6);
            Node c = new Node(7);
            Node d = new Node(65);
            a.prev = null;
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            d.next = null;
            display(a);
            reverse(d);




    }
}
