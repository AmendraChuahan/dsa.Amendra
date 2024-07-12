
public class implemetationofstack  {
    public static  class stack {
        private int[] arr = new int[4];
        private int idx = 0;

        void push(int x) {// esme element bharna hai
            if(isfull()){// 
                System.out.print("Stack is full");
                return;
            }
            arr[idx] = x;// x element hai x ko idx me bhara
            idx++;

        }

        int peek() {// top most element accesses karke dega
            if(idx==0){
                System.out.println("Stacks is empty");
                return -1;
            }
            return arr[idx - 1];// q ki idx ek step aage rahega
        }
        int pop(){// pop element
            int top= arr[idx-1];// pop element by one
            arr[idx-1]=0;// java me by default value zero hoti hai
            idx--;
            return top;

        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.println(arr[1]+ " ");
            }

        }

        int size(){
            return idx;
        }
        boolean isempty(){
            if(idx==0)
                return true;
            else return false;

        }
        boolean isfull(){
            if (idx==arr.length) return true;
        }

    }
    public static void main (String[]args){
        Stack  st= new Stack();
        st.push(2);
        st.push(43);
        st.push(32);
        st.push(44);
        st.push(4);
        st.pop();
        st.display();
        st.push(1);
        st.display();
        
        System.out.println(st.size());
    }


 }

