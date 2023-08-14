
// *** Ques 1 :  To find the nth node from the end & remove it ! *** 

class LL2 
{
    Node head;

    // *** Node Class ***
    public class Node 
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }


    // *** add elements to list *** 
    public void addFirst(int data)
    {
        Node n = new Node(data); 

        n.next = head;
        head = n;
    }  


    public void addLast(int data)
    {
        Node n = new Node(data);

        // Base Case
        if(head == null)
        {
            n.next = head;
            head = n;
            return; 
        } 

        Node ptr = head;

        while(ptr.next != null)
        {
            ptr = ptr.next;
        } 
        ptr.next = n;
        n.next = null; 
    }


    // *** display *** 
    public void display()
    {
        // Base Case 
        if(head == null)
        {
            System.out.println("Empty Linked List !!");
            return;
        } 

        Node ptr = head; 

        while(ptr.next != null)
        {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next; 
        }
        System.out.print("null"); 
    }


    // *** delete elements *** 
    public void removeFirst()
    {
        // Base Case
        if(head == null)
        {
            System.out.println("Empty Linked List !!");
            return;
        }

        head = head.next;
    }


    public void removeLast()
    {
        // Base Case
        if(head == null)
        {
            System.out.println("Empty Linked List !!");
            return;
        }

        if(head.next == null)
        {
            head = null;
            return;
        }

        Node ptr = head;
        while(ptr.next.next != null)
        {
            ptr = ptr.next;
        }

        ptr.next = null;  
    }

    // *** Length of list *** 
    public int size()
    {
        // base     
        if(head == null)
        {
            return 0;
        }   

        int s = 0;
        Node ptr = head;
        while(ptr != null)
        {
            s++;
            ptr = ptr.next;
        }

        return s;
    }


    //  *** Question : *** 
    public Node remove_nth(Node head,int size,int n)
    {
        // Base Case - 1
        if(head.next == null)
        {
            return null; 
        }

        // Base Case - 2
        if(n == size)
        {
            return head.next; 
        } 

        int idx = (size - n); 
        int i = 1;
        Node ptr = head;

        while(i < idx)
        {
            ptr = ptr.next; 
            i++; 
        }  

        ptr.next = ptr.next.next;
        return head; 
    } 
}


public class P3_LL_Ques_1 
{
    public static void main(String[] args) 
    {
        LL2 l2 = new LL2();

        l2.addFirst(34);
        l2.addFirst(78);
        l2.addLast(89);
        l2.addLast(55); 
        l2.addFirst(45);
        l2.addLast(37);  

        System.out.print("\nLinked List :   ");
        l2.display();

        l2.removeFirst();
        l2.removeLast();

        System.out.print("\n\nLinked List :   ");
        l2.display();

        int sz = l2.size();  
        System.out.println("\n Size :   "+ sz);
        
        System.out.print("\n\nNth Node from Last :   " + l2.remove_nth(l2.head, sz,3));  
        
    }    
}
