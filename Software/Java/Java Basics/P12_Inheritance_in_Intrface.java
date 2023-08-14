
// Inheritance in Interfaces 

interface Ek 
{
    public void meth1();

    public void meth2(); 

    private void greet()
    {
        System.out.println("Good Mornihng !!");
    }   

    // Defaults Methods 
    default void meth22()
    {
        greet();

        System.out.println(("Hi ! Rahul Bhaiya !! "));
    }
}   

interface Do extends Ek 
{
    public void meth3();

    public void meth4(); 
}    


class Sample implements Do 
{
    // Derived interface methods
    @Override
    public void meth3()
    {
        System.out.println("I am Method 3");
    }    

    @Override
    public void meth4()
    {
        System.out.println("I am Method 4"); 
    }  

    // Base interface methods
    @Override
    public void meth2()
    {
        System.out.println("I am Method 2 ");
    } 

    @Override
    public void meth1()
    {
        System.out.println("I am Method 1"); 
    }
}

public class P12_Inheritance_in_Intrface 
{
    public static void main(String[] args) 
    {
        Sample s =new Sample();

        System.out.println(); 

        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();

        System.out.println();

        s.meth22();
    }    
}   