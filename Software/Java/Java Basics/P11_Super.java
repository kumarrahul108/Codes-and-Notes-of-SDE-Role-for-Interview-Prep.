
// this - super -> keywords in Java  


class Ek 
{
    int a;

    Ek()
    {
        System.out.println("I am non-para constructor of Ek class");
    }

    Ek(int a)
    {
        this.a = a;
        System.out.println("I am para constructor of Ek class");
    } 

    public int getA()
    {
        return a; 
    }
}


class Do extends Ek
{
    Do()
    {
        System.out.println("I am non-para constructor of Do class");
    } 

    Do(int b)
    {
        super(b);  // callimng para constructr from base class 
        System.out.println("I am para constructor of Do class");

    }  
    
     /* 
        --> Throws Error bcz there is no constructor in parent / base class without parameter 
    Do()
    {
        System.out.println("Hello !!");
    }

    */
}


public class P11_Super 
{
    public static void main(String[] args) 
    {
        Ek e1 = new Ek();
        Ek e2 = new Ek(58); 

        System.out.println("Value of A : " + e1.getA());
        System.out.println("Value of A : " + e2.getA()); 


        System.out.println("\n");
        Do d1 = new Do();  
        System.out.println(); 
        Do d2 = new Do(566); 
        System.out.println();

        System.out.println("Value of B : " + d1.getA());
        System.out.println("Value of B : " + d2.getA()); 
    }    
}
