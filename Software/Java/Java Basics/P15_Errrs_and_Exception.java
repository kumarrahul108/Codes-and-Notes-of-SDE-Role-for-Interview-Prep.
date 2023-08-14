
// Errors in Java 


import java.util.Scanner; 

public class P15_Errrs_and_Exception 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        // simple try - catch block 
        int a = 4587;
        int b = 0;

        try 
        {
            int c = a/b;
            System.out.println("Result: " + c);
        } 

        catch(Exception e)  
        {
            System.out.println("We failed to divide Reason : \n");
            System.out.println(e); 
        } 

        finally 
        {
            System.out.println("End of this Part !"); 
        }  


        System.out.println("\n\n Quick Quiz Nested try - catch block :   \n");
        // Quick Quiz Nested try - catch block

        int arr[] = new int[5];
        arr[0] = 23;
        arr[1] = 24;
        arr[2] = 25;
        arr[3] = 26;
        arr[4] = 27; 

        while(true)
        {
            System.out.println("Enter any number for Index :   ");
            int idx = sc.nextInt(); 

            try 
            {
                System.out.println("Welcome to Nested try-catc block : \n");
                try 
                {
                    System.out.println(arr[idx]);
                    break;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Opps ! Please give a vlid Index !!");
                }
            } 
            catch(Exception e)
            {
                System.out.println(e); 
            }
        }
    }   
}
