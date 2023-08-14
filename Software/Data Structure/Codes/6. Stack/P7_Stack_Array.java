
// *** Stack Using Arrays ***  


public class P7_Stack_Array 
{   
    static int size ;
    static int top = -1;
    static int arr[];

    // *** Constructor *** 
    P7_Stack_Array(int size)
    {
        this.size = size;
        arr = new int[size];
    } 


    // *** Check for Empty Stack ***
    public boolean isEmpty()
    {
        if(top < 0)
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }


    // ** Check for Full Stack ***
    public boolean isFull()
    {
        if((size - 1) == top)
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }


    // *** Push Operation *** 
    public void push(int data)
    {
        // Base 
        if(isFull())
        {
            System.out.println("Stack OverFlow !!");
        } 

        top++;
        arr[top] = data;
    } 


    // *** Pop Operation ***
    public int pop()
    {
        // Base 
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow !!");
            return -1;  
        } 

        int x = arr[top];
        top--;

        return x;
    } 


    // *** Peak Operation ***
    public int peek()
    {
        // Base 
        if(isEmpty())
        {
            System.out.println("Stack UnderFlow !!");
            return -1;  
        } 

        return arr[top];
    }


    // *** Display *** 
    public void display()
    {
        // Base 
        if(isEmpty())
        {
            System.out.print("Stack UnderFlow !!");
        }

        for(int i=top;i>-1;i--)
        {
            System.out.println(arr[i]);
        } 
    }



    // *** MAin Function *** 
    public static void main(String[] args) 
    {
        P7_Stack_Array s7 = new P7_Stack_Array(10);

        s7.push(5);
        s7.push(8);
        s7.push(11);
        s7.push(15);
        s7.push(19);
        s7.push(26);

        System.out.print("\nStack Elements :   \n");
        s7.display();

        System.out.print("\n\nTop elemets in Stack :  " + s7.peek()); 

        s7.pop();

        System.out.print("\n\nUpdated Stack Elements :  \n");  
        s7.display();
    }    
}
