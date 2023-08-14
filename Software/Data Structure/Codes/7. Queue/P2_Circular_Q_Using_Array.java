
// *** Circular Queue Using Array *** 


public class P2_Circular_Q_Using_Array 
{
    // ** Queue Class ** 
    static class Queue2 
    {
        static int size;
        static int arr[];
        static int front = -1;
        static int back = -1; 

        // ** Constructor ** 
        Queue2(int size)
        {
            this.size = size;
            arr = new int[size];
        } 


        // *** Empty Queue *** 
        public boolean isEmpty()
        {
            if(front == -1 && back == -1) 
            {
                return true;
            }
            else 
            {
                return false;
            }
        }


        // *** Full Queue *** 
        public boolean isFull()
        {
            if((back + 1) % size == front)
            {
                return true;
            }
            else 
            {
                return false;
            }
        }


        // *** Enqueue Operation *** 
        public void add(int data)
        {
            // Base 
            if(isFull())
            {
                System.out.println("Queue Overflow !!");
                return;
            } 

            if(front == -1)
            {
                front = 0;
            }

            back = (back + 1) % size;
            arr[back] = data;
        }


        // *** Dequeue Operation *** 
        public int remove()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("Underflow Queue !!");
                return -1; 
            }

            int res = arr[front];

            if(front == back)
            {
                front = back = -1;
            } 
            else 
            {
                front = (front + 1) % size;
            }

            return res; 
        }


        // *** Peek Operation *** 
        public int peek()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("Underflow Queue !!");
                return -1; 
            } 

            return arr[front]; 
        }

    } 



    // *** Main Function *** 
    public static void main(String[] args) 
    {
        Queue2 q2 = new Queue2(10);

        System.out.print("\nIs Empty : -->  " + q2.isEmpty());

        System.out.print("\nIs Full : -->  " + q2.isFull());  

        q2.add(67);
        q2.add(90);
        q2.add(24);
        q2.add(34);
        q2.add(62);

        // System.out.print("\nPeek : --> " + q2.peek());  

        System.out.print("\n Display ::  ->  \n");

        while(!q2.isEmpty())
        {
            System.out.println(q2.peek());
            q2.remove();
        }
    }    
}
