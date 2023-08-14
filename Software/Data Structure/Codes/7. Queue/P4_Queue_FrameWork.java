
// *** Queue Using Collection FrameWork *** 

import java.util.*;

public class P4_Queue_FrameWork 
{
   public static void main(String[] args) 
   {
        Queue<Integer> q4 = new LinkedList<>();   // Queue is a Interface

        q4.add(66);
        q4.add(89);
        q4.add(90);
        q4.add(21);
        q4.add(56);
        q4.add(67);

        q4.remove(); 

        while(!q4.isEmpty())
        {
            System.out.println(q4.remove());
            q4.peek(); 
        }
   } 
}
