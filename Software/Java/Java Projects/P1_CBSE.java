
/*
    Project 1 : 
    
    CBSE Percentage Calculator 

*/


import java.util.Scanner; 

public class P1_CBSE 
{
    public static void main(String[] args) 
    {
       System.out.print("** Welcome to CBSE Percentage Calculator ** \n");    

       Scanner sc = new Scanner(System.in); 
       String name; 
       System.out.print("Emter Your Name :  ");
       name = sc.next(); 

       // Array to store 5 subjects Marks 
       double marks[] = new double[5]; 
       double sum = 0.0;
       for(int i=0;i<5;i++)
       {
        System.out.print("ENter marks for Subject  " + (i+1) + " =  " );
        marks[i] = sc.nextDouble(); 
        sum += marks[i];
       } 

       System.out.print("\nName of the Student :  " + name);
       System.out.print("\nSum of his Marks : " + sum);
       System.out.print("\nPercentage of his Marks : " + (sum/5)); 
    }    
}
