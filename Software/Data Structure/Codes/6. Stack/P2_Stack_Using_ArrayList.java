
// Stack Using Array List 

import java.util.*;

public class P2_Stack_Using_ArrayList 
{
    // *** CReate Stack Class *** 
    static class Stack2 
    {
        ArrayList<Integer> l1 = new ArrayList<>(); 

        // *** Empty Stack ***
        public boolean isEmpty()
        {
            if(l1.size() == 0)
            {
                return true;
            } 
            else 
            {
                return false; 
            }
        }


        // *** Insert ELements into Stack ***
        public void push(int data)
        {
            l1.add(data);   // always add at its end 
        }


        // *** Remove elements from stack *** 
        public int pop()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("EMpty Stack !!");
                return -1;
            } 

            int top = l1.get(l1.size()-1);
            l1.remove(l1.size()-1);

            return top; 
        }


        // *** Remove top element from stack ***
        public int peek()
        {
            // Base 
            if(isEmpty())
            {
                System.out.println("Empty Stack !!");
                return -1;
            }

            int x = l1.get(l1.size()-1);
            return x;
        }
    }



    // *** Main FUnction *** 
    public static void main(String[] args) 
    {
         Stack2 s2 = new Stack2();

        s2.push(67);
        s2.push(34);
        s2.push(15);
        s2.push(89); 

        System.out.println("\nStack Using Array-List :  \n");
        while(!s2.isEmpty())
        {
            System.out.println(s2.peek());
            s2.pop();
        }
    }    
}
