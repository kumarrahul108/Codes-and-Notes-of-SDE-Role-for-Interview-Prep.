
// ArrayList in Java 

import java.util.ArrayList;
import java.util.Collections; 

public class Array_List 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> l1 = new ArrayList<>(); 
        
        l1.add(7);
        l1.add(2);
        l1.add(13);
        l1.add(23);
        l1.add(34);
        l1.add(67); 

        l1.set(2,11);
        l1.set(4,66);

        l1.remove(5);

        System.out.println("Array List :   " + l1);

        int size = l1.size();
        System.out.println("Length of Array List : " + size);

        System.out.print("Elements presen in Array List :   ");
        for(int i=0;i<size;i++)
        {
            System.out.print(l1.get(i) + "  ");
        } 

        Collections.sort(l1);
        System.out.print("\nSorted Array List : " + l1);
    }
}