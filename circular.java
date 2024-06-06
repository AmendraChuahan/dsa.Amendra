//  circular linkedlist


public class circular {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

    }
   
    public static void cir (Node head ) {
        Node temp = head.next;
        while (temp!= head) {
            System.out.print(temp.val +" ");
            temp = temp.next;


        }

        System.out.println();
    }
        public static void main (String agrs[]) {
            Node a = new Node(1);
            Node b = new  Node (6);
            Node c = new Node(7);
            Node d = new Node(65);

            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            cir(a);


        }
    }
