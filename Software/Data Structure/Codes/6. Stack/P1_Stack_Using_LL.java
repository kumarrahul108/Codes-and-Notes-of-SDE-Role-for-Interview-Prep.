
// Stack Using Linked List 


public class P1_Stack_Using_LL
{
    static Node head;

    // *** Create Node Class *** 
    static class Node 
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    } 


    // *** Create Stack Class *** 
    static class Stack 
    {
        // *** Check for Empty Stack ***
        public boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            } 
            else 
            {
                return false; 
            }
        }


        // *** Insert element into stack ***
        public void push(int data)
        {
            Node n = new Node(data);

            // Base 
            if(isEmpty())
            {
                head = n;
                return;
            } 

            // like adding elements to 1st position of L.L
            n.next = head;
            head = n;
        }


        // *** REmoving elements from stack ***
        public int pop()
        {
            // Base 
            if(isEmpty())
            {
                return -1;
            } 

            int top = head.data;
            head = head.next;

            return top;
        }


        // *** Remove top element from stack ***
        public int peek()
        {
            // Base 
            if(isEmpty())
            {
                return -1;
            } 

            int x = head.data;

            return x;
        }


        // *** Display Stack element *** 
        public void display()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("Empty tack !!!");
                return; 
            }  

            Node ptr = head;

            while(ptr != null)
            {
                System.out.println(ptr.data);
                ptr = ptr.next;
            } 
        }
    }


    // *** Main Function *** 
    public static void main(String[] args) 
    {
        Stack s1 = new Stack();

        s1.push(67);
        s1.push(34);
        s1.push(12);
        s1.push(56);
        s1.push(76);

        System.out.println("Stack : --> First In Last Out --> ");
        s1.display();

        System.out.print("\n\nPop Elements from Stack  :   " + s1.pop());

        System.out.print("\n\nPeek Elements from Stack  :   " + s1.peek());

        System.out.println("\n\nStack : --> First In Last Out --> ");
        s1.display();
    }
}