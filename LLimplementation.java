public class LLofstack {
    public static class Node {// user define data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static  class Stack {// user define data structure
        Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty ");
                return -1;
            }
            return head.val;


        }
        void disrec(Node h){// usind recursion  for display element
            if(h==null) return;
            disrec(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
      disrec(head);
            System.out.println();
        }
        void displayrec() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp= temp.next;
            }
            System.out.println();

        }

        int size() {// getter
            return size;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
       st.display();//4
        st.push(5);
        st.display();//4 5
        st.push(6);
      st.display();//4 5 6
        System.out.println(st.size());//3
        st.push(1);
        st.display();
        st.peek();
        st.display();

    }
}
