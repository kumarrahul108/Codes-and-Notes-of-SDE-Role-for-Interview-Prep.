
// *** Using Scratch Implementation *** 


class LL 
{
    Node head;

    // *** Node class *** 
    public class Node
    {
        int data;
        Node next;

        // constructor 
        Node(int data)
        {
            this.data = data;
            this.next = null;
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


    // *** display list *** 
    public void display()
    {
        // Base Case
        if(head == null)
        {
            System.out.println("Emplty Linked List !!");
        } 

        Node ptr = head;
        while(ptr != null)
        {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }
        System.out.print("null"); 
    }  


    // *** delete elements from list *** 
    public void removeFirst()
    {
        // Base Case 
        if(head == null)
        {
            System.out.println("Emplty Linked List !");
            return;
        } 

        head = head.next;
    }



    public void removeLast()
    {
        // Base Case - 1
        if(head == null)
        {
            System.out.println("Emplty Linked List !!");
            return; 
        } 

        // Base Case - 2
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


    // *** size of list *** 
    public int size()
    {
        // Base Case
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



    // *** Reverse a Linked List *** 
    public void reverseIter()
    {
        // Base Case
        if(head == null || head.next == null) 
        {
            return;
        }  

        Node Previous = head;
        Node Current = head.next;

        while(Current != null)
        {
            Node Next = Current.next;
            Current.next = Previous;

            // update 
            Previous = Current;
            Current = Next;
        }

        head.next = null;
        head = Previous; 
    }


    public Node reverseReccursive(Node head)
    {
        // Base Case
        if(head == null || head.next == null)
        {
            return head;
        } 

        Node new_Head = reverseReccursive(head.next); 

        head.next.next = head;
        head.next = null;

        return new_Head;
    }
}



// *** MAin Function *** 
public class P2_LL_Scratch 
{
    public static void main(String[] args) 
    {
        LL l1 = new LL();
        
        l1.addFirst(34);
        l1.addFirst(78);
        l1.addLast(89);
        l1.addLast(55); 
        l1.addFirst(45);
        l1.addLast(37);

        System.out.print("\nLinked List :    ");
        l1.display();

        l1.removeFirst();
        l1.removeLast();

        System.out.print("\nUpdated Linked List :    ");
        l1.display();  

        System.out.print("\n\nSize of Linked List :    " + l1.size());

        // Reverse LL 

        l1.reverseIter();
        System.out.print("\n\nReversed LL Using Iteration :   ");
        l1.display(); 

        
        l1.head = l1.reverseReccursive(l1.head); 
        System.out.print("\n\nReversed LL Using Recursion :    ");
        l1.display();  
    }    
} 