
// Throws - throw keyword in Java 


class NegativeException extends Exception 
{
    @Override
    public String toString()
    {
        return "Radius cannot be Negative";
    } 

    @Override
    public String getMessage()
    {
        return "Radius cannot be negative";
    }
}

public class P16_throws_and_throw 
{
    public static int divide(int a, int b)
    {
        int result = a/b;
        return result;
    } 

    public static double area(int r) throws NegativeException
    {
        if(r < 0)
        {
            throw new NegativeException();
        } 

        double result = Math.PI * r * r;
        return result;
    }


    public static void main(String[] args) 
    {
        try 
        {
            int c = divide(6, 0);
            System.out.println(c);
        } 
        catch(Exception e) 
        {
            System.out.println("Exception Occurd !!"); 
        }
    }    
}
