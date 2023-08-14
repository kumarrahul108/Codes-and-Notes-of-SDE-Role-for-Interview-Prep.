
// Stack Using Collection FrameWork 


import java.util.Stack;

public class P3_Stack_FrameWork 
{
    public static void main(String[] args) 
    {
        Stack<Integer> s3 = new Stack<>();

        s3.push(76);
        s3.push(37);
        s3.push(15);
        s3.push(89);

        System.out.print("\nStack Using Collection FrameWork  :  \n");
        while(!s3.isEmpty())
        {
            System.out.println(s3.pop());  
        }
    }    
}    

