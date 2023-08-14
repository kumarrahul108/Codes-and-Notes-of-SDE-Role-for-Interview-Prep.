
// *** Stack Using Linked List from Scratch *** 


public class P6_Stack_LL 
{
    static Node top;

    // *** Create Node Class *** 
    static class Node 
    {
        Node next;
        int data;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    } 


    // *** Check for EMpty Stack *** 
    public boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        } 
        else 
        {
            return false; 
        }
    }


    // *** Display Stack ***
    public void display()
    {
        // Base 
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow !!");
        } 

        Node ptr = top;
        while(ptr != null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        } 

        System.out.println("null"); 
    }


    // *** Push Operation ***
    public void push(int data)
    {
        Node n = new Node(data);

        // insert like adding elemment to 1st position of list
        n.next = top;
        top = n;
    }  


    // *** Pop Operation ***
    public int pop()
    {
        // Base 
        if(isEmpty())
        {
            System.out.println("Empty Stack !!");
            return -1; 
        } 

        int x = top.data;
        top = top.next;

        return x;
    }


    // *** Peak Operation ***
    public int peek()
    {
        // Base 
        if(isEmpty())
        {
            System.out.println("Empty Stack !!");
            return -1;
        } 

        int x = top.data;
        return x;
    }



    // *** Main Function *** 
    public static void main(String[] args) 
    {
        P6_Stack_LL s6 = new P6_Stack_LL();

        s6.push(3);
        s6.push(7);
        s6.push(12);
        s6.push(17);
        s6.push(21); 

        System.out.print("\nStack Elements :   \n");
        s6.display();  

        System.out.print("\n\nTop elemets in Stack :  " + s6.peek());

        s6.pop();

        System.out.print("\n\nUpdated Stack Elements :  \n");
        s6.display();
    }    
}