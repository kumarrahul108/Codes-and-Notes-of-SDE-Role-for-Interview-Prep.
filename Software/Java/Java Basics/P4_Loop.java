
// Loops in Java 

import java.util.Scanner; 

public class P4_Loop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("For Loop :   \n");

        // for loop 
        for(int i=1;i<=10;i++)
        {
            System.out.print(i + " ");
        } 

        System.out.println(); 

        for(int i=10;i>=1;i--)
        {
            System.out.print(i + " "); 
        } 

        System.out.println("\n\nWhile Loop : \n");

        // while loop
        int i=1;
        while(i<=10)
        {
            System.out.print(i + " ");
            i++; 
        } 

        System.out.println("\n\nDo while Loop   :  \n"); 

        // do..while loop 
        int j=0;
        do 
        {
            System.out.print(j + " ");
            j++;
        }
        while(j <= 5);

        /*
             while & for  :-> 1st condition is checked before entering into loop body
             do while  :-> Without checking the condition it 1st enters in loop body
                       :-> Even if the condition is false here , it will print the 1st output
        */  


        // Break Statement
        System.out.println("\n\nUsing Break Statement  :  "); 

        for(int k=1;k<=10;k++)
        {
            System.out.print(k + "  "); 
            System.out.println("Java is Great !!");

            if(k == 5)
            {
                System.out.println("Ending Loop using break statement");
                break; 
            }
        }
        System.out.println("Loop ends here !!"); 


        // Continue Statement
        System.out.println("\n\nUsing Continue Statement : "); 

        for(int k =1;k<=5;k++)
        {
            if(k == 3)
            {
                continue; 
                // move for next iteration , leave the below statements
            } 
            System.out.print(k + "  "); 
            System.out.println("Java is Great !!");
        }

    }    
}
