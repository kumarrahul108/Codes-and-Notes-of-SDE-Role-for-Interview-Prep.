
// Hash Set in Java  


import java.util.HashSet;
import java.util.Iterator; 

public class Hash_Set 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet();

        set.add(67);
        set.add(34);
        set.add(90);
        set.add(34);
        set.add(17);

        System.out.print("Size : " + set.size());

        if(set.contains(34))
        {
            System.out.println("\nPresent");
        }
        else 
        {
            System.out.println("\nNot Present");
        } 

        set.remove(17);
        System.out.println("Set :  " + set);

        // Iterator 

        System.out.println();

        Iterator it = set.iterator();

        while(it.hasNext()) 
        {
            System.out.print(it.next() + "  ");
        }
    }
}