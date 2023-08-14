
// Conditiond in Java  

import java.util.Scanner; 

public class P3_Conditions 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("\nEnter your Age : ");
        int age = sc.nextInt(); 

        // if else 
        if(age < 18)
        {
            System.out.println("Child !");
        } 
        else if(age >=18 && age < 60)
        {
            System.out.println("Youth !!");
        } 
        else 
        {
            System.out.println("Old !");
        }

        System.out.println("\n\n");

        // switch case 
        switch(age)
        {
            case 18:
                System.out.println("Child");
                break;

            case 25:
                System.out.println("Adult ");
                break;
                
            case 60:
                System.out.println("Adult"); 
                break; 
                
            default:
                System.out.println("Little Confused !!");     
        } 

        System.out.println("\n\n");

        
        // Enhanced Switch Case
        switch(age)
        {
            case 18 -> System.out.println("Child ");
            case 25 -> System.out.println("Adult");
            default -> System.out.println("Confused !!");
        }

    }    
}
