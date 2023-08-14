
// Functions in Java 


public class P6_Functions 
{
    public int logic(int a,int b)
    {
        return (a+b);
    } 

    public static int loggic(int a,int b)
    {
        return (a+b);
    } 


    // method overloading 
    public static void greet()
    {
        System.out.println("Good Morning !!");
    } 

    public static void greet(String s)
    {
        System.out.println("Good Morning ,  " + s); 
    } 

    // Variable Arguments 
    public static int sum(int ...a)
    {
        int res = 0;
        for(int e : a)
        {
            res += e;
        } 
        return res; 
    }


    public static void main(String[] args) 
    {
        P6_Functions f = new P6_Functions();
        int c = f.logic(5,9); 
        System.out.println(c); 

        int d = loggic(5, 9);
        System.out.println(d);

        System.out.println(loggic(5, 9)); 

        greet(); 

        greet("Rahul !!");
        String s = new String("Aryan !!");
        greet(s);    

        int s1 = sum(4,56,78,26,45,89);
        System.out.println(s1);
    }    
}
