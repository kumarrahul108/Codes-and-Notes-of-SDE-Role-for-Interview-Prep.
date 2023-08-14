
// Ques 2 : To REverse a Stack 


import java.util.Stack;

public class P5_Ques_2 
{
    // *** Push element at the end of stack *** 
    public static void pushBottom(int data,Stack<Integer> s)
    {
        // Base 
        if(s.isEmpty())
        {
            s.push(data);
            return; 
        } 

        int top = s.pop(); 
        pushBottom(data, s);
        s.push(top); 
    }



    // *** Reverse the stack *** 
    public static void reverse(Stack<Integer> s)
    {
        // Base 
        if(s.isEmpty())
        {
            System.out.println("EMpty Stack !!");
            return;
        } 

        int top = s.pop();
        reverse(s);
        pushBottom(top,s);
    }


    public static void main(String[] args) 
    {
        Stack<Integer> s5 = new Stack<>();

        s5.push(1);
        s5.push(2);
        s5.push(3);
        s5.push(4); // top   

        reverse(s5);

        while(!s5.isEmpty())
        {
            System.out.println(s5.peek());
            s5.pop();
        }
    }    
}
