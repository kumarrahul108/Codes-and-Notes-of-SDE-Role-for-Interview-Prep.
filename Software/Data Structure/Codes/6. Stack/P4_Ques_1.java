
// Ques 1 : To push an element at the bottom of Stack 


import java.util.Stack; 

public class P4_Ques_1 
{
    // *** To push an element at the bottom of Stack ***
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


    public static void main(String[] args) 
    {
        Stack<Integer> s4 = new Stack<>();    

        s4.push(1);
        s4.push(2);
        s4.push(3);

        pushBottom(4, s4);

        while(!s4.isEmpty())
        {
            System.out.println(s4.peek());
            s4.pop();
        }
        
    }    
}