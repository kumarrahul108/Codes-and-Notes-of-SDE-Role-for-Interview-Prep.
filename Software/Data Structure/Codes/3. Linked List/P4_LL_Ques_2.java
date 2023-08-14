
// *** Ques 2 :  Check whether a Linked List is pallindrome or not ! *** 


class LL3 
{
    Node head;

    // *** Node Class *** 
    public class Node 
    {
        int data;
        Node next;

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

        while(ptr != null)
        {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }

        System.out.print("null");
    }


    // *** delete element from the list *** 
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


    // *** size of the list *** 
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


    // *** Question : *** 
    
    // *** reverse *** 
    public Node reverse(Node head)
    {
        Node p = head;
        Node c = head.next;

        while(c != null)
        {
            Node n = c.next;
            c.next = p;

            // update 
            p = c;
            c = n;
        }

        return p; 
    }  


    // *** middle element *** 
    public Node middle(Node head)
    {
        Node h = head;
        Node t = head;

        while(h.next != null && h.next.next != null)
        {
            h = h.next.next; 
            t = t.next;
        }

        return t; 
    }


    // *** pallindrome *** 
    public boolean isPalli(Node head)
    {
        // Base Case 
        if(head == null || head.next == null)
        {
            return true; 
        } 

        Node mid = middle(head);  // 1st half ka end 

        Node secondHalf = reverse(mid.next);
        Node firstHalf = head; 

        while(secondHalf != null)
        {
            if(secondHalf.data != firstHalf.data)
            {
                return false;
            } 

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; 
    }
}


// *** MAin Class *** 
public class P4_LL_Ques_2 
{
    public static void main(String[] args) 
    {
         LL3 l3 = new LL3();

        l3.addFirst(34); 
        l3.addFirst(78);
        l3.addLast(89);
        l3.addLast(55); 
        l3.addFirst(45);
        l3.addLast(37);  

        l3.display();

        l3.removeFirst();
        l3.removeLast();

        System.out.println("\n");
        l3.display();

        if(l3.isPalli(l3.head)) 
        {
            System.out.println("\n\nPallindrome List");
        }
        else 
        {
            System.out.println("\n\nNon - Pallindrome List ");
        }
    }    
}
