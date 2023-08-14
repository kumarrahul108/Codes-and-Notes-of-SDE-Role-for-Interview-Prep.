
// Inheritance in Java 


class Base 
{
    int x;

    public void setX(int x)
    {
        System.out.println("I am in Base Class !");
        this.x = x;
    } 

    public int getX()
    {
        return x; 
    } 

    public void meth()
    {
        System.out.println("hello , Anjali "); 
    }
} 


class Derived extends Base 
{
    int y;

    public void setY(int y)
    {
        System.out.println("I am in Derived Class ! ");
        this.y = y; 
    } 

    public int getY()
    {
        return y; 
    } 

    // Overridding methods 
    // Basically , in term of Polymorphism the latest method will be printed finally 
    @Override
    public void meth()
    {
        System.out.println("Hello , Kajol "); 
    }
}

public class P9_Inheritamce 
{
    public static void main(String[] args) 
    {
        System.out.println("\nFor Base Class : "); 

        Base b = new Base(); 
        b.meth();
        b.setX(56);
        System.out.println("Value of x :  " + b.getX()); 

        System.out.println("\nDerived Class :  "); 
        Derived d = new Derived(); 
        d.meth();
        d.setX(78);
        d.setY(26);
        System.out.println("\nValue of X : " + d.getX());
        System.out.println("Value of Y : " + d.getY());


        System.out.println("\nPolyMorphism :  "); 
        Base bb = new Derived();   // alll reference used from derived class 
        bb.meth();
        bb.setX(78);
        System.out.println("value of X : " + bb.getX());
    }    
}
