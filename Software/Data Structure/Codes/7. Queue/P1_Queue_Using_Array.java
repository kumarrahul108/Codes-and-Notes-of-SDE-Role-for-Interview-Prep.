
// *** Queue Using Array *** 


public class P1_Queue_Using_Array
{
    // ** Queue Class ** 
    static class Queue    // static is must -> otherwise throws error
    {
        public static int arr[];
        public static int size;
        public static int back = -1;

        Queue(int size)
        {
            this.size = size;
            arr = new int[size];
        } 


        // *** Empty Queue *** 
        public boolean isEmpty()
        {
            if(back == -1)
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
            if(back == (size-1))
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

            back++;

            arr[back] = data;
        }


        // *** Dequeue Operation *** 
        public int remove()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("Queue Underflow !!");
                return -1;
            } 

            int front = arr[0];

            for(int i=0;i<back;i++)
            {
                arr[i] = arr[i+1];
            }

            back--; 

            return front;
        }


        // *** Peek Operation ***
        public int peek()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("Queue Underflow !!");
                return -1;
            }    

            return arr[0];
        } 


        // *** Display Queue ***
        public void display()
        {
            for(int i=0;i<=back;i++)
            {
                System.out.print(arr[i] + "   ");
            }
        } 
    }



    // *** Main Function *** 
    public static void main(String[] args) 
    {
        Queue q1 = new Queue(10);

        System.out.print("\nIs Empty : --> " + q1.isEmpty());

        q1.add(45);
        q1.add(22);
        q1.add(89);
        q1.add(37);
        q1.add(66); 
        q1.add(67);  

        // q1.remove();

        System.out.print("\nIs Full : --> " + q1.isFull());

        System.out.print("\nPeek : -->   " + q1.peek());

        System.out.print("\nQueue Elements :  ->   ");

        q1.display();
    }
}