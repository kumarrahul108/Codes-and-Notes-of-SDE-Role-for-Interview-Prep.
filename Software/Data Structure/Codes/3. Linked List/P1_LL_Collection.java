
// Linked List Using Collections FrameWork 

import java.util.LinkedList;
import java.util.Collections; 

public class P1_LL_Collection
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        
        l1.add(34);
        l1.add(16);
        l1.add(28);
        l1.add(67);

        l1.addFirst(44);
        l1.addLast(99);

        l1.add(2,59);

        System.out.println("\nLinked List :  " + l1); 

        int sz = l1.size();
        System.out.println("Length of Linked List : " + sz);

        System.out.print("\nElements of Linked List :  ");
        for(int i=0;i<sz;i++)
        {
            System.out.print(l1.get(i) + "  ");
        } 

        System.out.println("Index 3 value :  " + l1.get(3));

        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();

        System.out.println("\nUpdated Linked List :  " + l1);

        // Reversing our Linked List
        Collections.reverse(l1);
        System.out.println("\nReversed Linked List :  " + l1);
    }
}