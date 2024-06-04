//  insertion at head
public class inserthead {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }



            public static void display (Node head){
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();


            }
        public static Node insertionhead(Node head, int x) {
            Node t = new Node(89);
            t.next = head;
            head.prev = t;
            head = t;
            return head;
        }


            public static void main (String agrs[]){
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

                Node newhead = insertionhead(a, 89);
                display(newhead);

            }
        }
    }

