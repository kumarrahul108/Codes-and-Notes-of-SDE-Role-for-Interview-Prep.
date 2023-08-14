
// Ques 1 : Use 2 Stacks to implement Queue 


import java.util.*; 

public class P5_Ques_Queue 
{
    // ** Create Queue Class ** 
    static class Queue5 
    {
        Stack<Integer> s1 = new Stack<>();  // main stack 
        Stack<Integer> s2 = new Stack<>();  // helper stack 

        // ** Empty ** 
        public boolean isEmpty()
        {
            if(s1.isEmpty())
            {
                return true;
            } 
            else 
            {
                return false; 
            }
        }  


        // *** Enqueue *** 
        public void add(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }


        // *** Dequeue *** 
        public int remove()
        {
            return s1.pop(); 
        }


        // *** Peek *** 
        public int peek()
        {
            return s1.peek();
        }


        // *** Display *** 
        public void display()
        {
            while(!s1.isEmpty())
            {
                System.out.println(s1.pop());
            } 
        }
    }


    // *** Main Function *** 
    public static void main(String[] args) 
    {
        Queue5 q5 = new Queue5();

        q5.add(1);
        q5.add(2);
        q5.add(3);
        q5.add(4);
        q5.add(5);  

        System.out.print("\n\n2 Stack Implementing Queueu :   -->  \n");
        q5.display();
    }    
}
