
// Arrays in Java 

import java.util.*;

public class P5_Array 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,5,8,11,34};
        System.out.println("Array Elements :  " + arr);
        System.out.println("Length of array  :  " + arr.length);
        System.out.println("Positio 2 element of array :  " + arr[1]);

        System.out.println("\n\n"); 

        int arr2[] = new int[5];

        // Taking Input 
        System.out.print("\nTaking Inpute of array elemenst from userr :  ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print("\nEnter elements for position : " +  (i+1) + " : ");
            arr2[i] = sc.nextInt(); 
        } 

        // Display 
        System.out.print("\nArray Elemnts :   ");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] + "  ");
        }

        System.out.println("\n\n");

        int a[][] = new int[2][3]; 
        // Take input 
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print("\nEnter vaslue for row : " + (i+1) + " and column : " + (j+1) + " : "); 
                a[i][j] = sc.nextInt(); 
            }
        } 

        System.out.println("\nDisplaying Matrix : ");

        // Display the matrix
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j] + "  ");    
            } 
            System.out.println();
        }


        System.out.println("\n"); 
        // for each loop :
        System.out.print("\n Displaying Using For Each Lopp :    ");
        int [] marks = {70,100,90,86,95};

        for(int e : marks)
        {
            System.out.print(e + "  ");
        }

    }    
}
