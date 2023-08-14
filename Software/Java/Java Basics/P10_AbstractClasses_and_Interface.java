
// Abstract Classes & Interfaces 


abstract class Parent 
{
    public void greet()
    {
        System.out.println("I am a Praent Class ! ");
    }  

    // abstract methods  
    abstract public void sayHello(); 

    abstract public void greet2(); 
} 


class Child extends Parent
{
    public void greetChild()
    {
        System.out.println("I am a Child class extending from parenrt class"); 
    } 

    @Override   // repeating same methiods from prev or above class 
    public void sayHello()
    {
        System.out.println("Hello , Mr. Kumar"); 
    }  

    @Override
    public void greet2()
    {
        System.out.println("Hello , Mr.Aryan"); 
    }
}  

// Interfaces 

interface Horn 
{
    int a= 56;
    public void blowHorn();
}  

interface Speed 
{
    public void increaseSpeed();
}  

class Bicycle implements Horn , Speed 
{
    @Override
    public void blowHorn()
    {
        System.out.println("Pee..Pee..Poo...Pooo"); 
    }  

    @Override
    public void increaseSpeed()
    {
        System.out.println("Increasing the speed ");
    } 

    public void display()
    {
        System.out.println("I am riding Avon Bicycle !");
    }
}   


public class P10_AbstractClasses_and_Interface 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        Parent p = new Child(); 
        
        /* 
            Parent p = new Parent();  --> Throws an Error 
            Bzc abstract class object can't be created 
        */   
        System.out.println();

        p.greet();
        p.sayHello();
        p.greet2();

        System.out.println();

        c.greetChild();
        c.greet2();
        c.sayHello(); 
        
        System.out.println();
        
        Bicycle b = new Bicycle();
        b.display();
        b.increaseSpeed();
        b.blowHorn(); 

        //  Value in any Interface is Final 
        // b.a = 78; --> throws an Error 
        
        
    }    
}
