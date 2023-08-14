
// Queue Using Linked List 


public class P3_Queue_Using_LL 
{
    static Node head;
    static Node tail;

    // ** Node Class ** 
    static class Node 
    {
        Node next;
        int data; 

        Node(int data)
        {
            this.data = data;
            next = null;
        } 
    } 


    // *** Queue Class ***  
    static class Queue3 
    {
        // ** Empty Queue ** 
        public boolean isEmpty()
        {
            if(head == null && tail == null)
            {
                return true;
            } 

            return false;
        }


        // *** Enqueue Operation *** 
        public void add(int data)
        {
            Node n = new Node(data);

            if(isEmpty())
            {
                head = tail = n;
            } 
            else 
            {
                tail.next = n;
                tail = n;
            }
        } 


        // *** DEqueue Operation ***
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("UnderFlow Queue !!");
                return -1; 
            } 

            int f = head.data; 

            if(head == tail)
            {
                tail = null;
            } 

            head = head.next;

            return f;
        }


        // *** Peek Operation *** 
        public int peek()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("UnderFlow !!");  
                return -1 ;
            }  

            return head.data;
        }


        // *** Dispaly *** 
        public void display()
        {
            // Base
            if(head == null)
            {
                System.out.println("UnderFlow");
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
        Queue3 q3 = new Queue3();

        q3.add(78);
        q3.add(82);
        q3.add(34);
        q3.add(16);

        System.out.print("\nPeek  ->   " + q3.peek());

        q3.remove();

        System.out.print("\nPeek  ->   " + q3.peek());

        System.out.print("\nQueueu :   -->  \n");
        q3.display();  
    }    
}