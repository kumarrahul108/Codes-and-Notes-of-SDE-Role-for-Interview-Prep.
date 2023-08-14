
// Basics Java  

import java.util.Scanner;

public class P1_Basic 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number :   ");
        int n = sc.nextInt();
        System.out.print("\nYour Inputed Number :  " + n);

        System.out.print("\nEnter your Name :  ");
        String str = sc.next();
        System.out.println("\nYour Inputed String : " + str);

        // To check the Validity 
        System.out.println("\nEnter Any Number : ");
        boolean d = sc.hasNextInt();
        if(d == true) 
        {
            System.out.println("Yes , Integeral Numbers  !!");
        }
        else 
        {
            System.out.println("Not a Integeral Numbers !!"); 
        } 

        int r1 = 78;
        int r2 = 45;
        char c = 'A';

        System.out.println("\n Sum of 2 Numbers :  " + (r1 + r2));

        System.out.println("Type Casting :    " + (char)r1);
        System.out.println("Type Castin  : " + (int)c);

    }
}