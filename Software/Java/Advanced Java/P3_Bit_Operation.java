
// Bit Opeartion in Java is

import java.util.Scanner;

public class P3_Bit_Operation 
{
    // Get Bit Operation 
    public static void getBit(int n,int pos)
    {
        int bitmask = n << pos;  // left shift 

        if((bitmask & n) == 0)
        {
            System.out.println("The number is Zero");
        }
        else 
        {
            System.out.println("The number is One");
        }
    } 

    // Set Bit Operation
    public static void setBit(int n,int pos)
    {
        int bitmask = n << pos;
        int new_No = (bitmask) | n; 

        System.out.println(new_No); 
    }

    // Clear Bit Opeartion 
    public static void clearBit(int n,int pos)
    {
        int mask = n << pos;
        int notmask = ~(mask);
        int new_No = (notmask) & (n); 
        
        System.out.println(new_No); 
    } 

    // Update Bit Operation 
    public static void updateBit(int n,int pos,int up)
    {
        int mask = n << pos;
        if(up == 1)
        {
            int new_No = (mask | n);
            System.out.println(new_No);
        } 
        else
        {
            int new_No = (mask & n);
            System.out.println(new_No);
        }
    }



    public static void main(String[] args) 
    {
        int n = 5;
        int pos = 2;

        getBit(n, pos);

        Scanner sc = new Scanner(System.in);

        System.out.println("ENter update Bit :   ");
        int up = sc.nextInt();

        setBit(n, pos);

        clearBit(n, pos);

        updateBit(n, pos, up); 

    }    
}
