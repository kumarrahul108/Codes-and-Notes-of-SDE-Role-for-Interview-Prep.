
// Multi-Threading in Java  



// Creating Thread extending Thread Class 

class Mythread1 extends Thread 
{
    // Constructor in Thread 
    Mythread1(String name)
    {
        super(name);
    } 

    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Cooking Thread !!");
            i++; 
        }
    }
}  

class Mythread2 extends Thread 
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Playing Music Thread !!"); 
            i++; 
        }
    }
}


// Creating Thread Using Interfaces 

class Mythread3 implements Runnable 
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Dancing Thread !!");
            i++;
        }
    }
}  

class Mythread4 implements Runnable 
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println("Chatting Thread !!");
            i++;
        }
    }
}  


// Implementing methods in hread 
class Mythread5 extends Thread 
{
    @Override
    public void run()
    {
        int i = 0;
        while(i < 20)
        {
            System.out.println(("Methods in Thread !!")); 
            try 
            {
                Thread.sleep(100);
            } 
            catch(Exception e)
            {
                System.out.println(e); 
            }
            i++;  
        }
    }
}



public class P14_Multithreading 
{
    public static void main(String[] args) 
    {
        System.out.println("Extending Thread Class : \n");  
        Mythread1 t1 = new Mythread1("Rahul");
        Mythread2 t2 = new Mythread2(); 

        t1.start();
        System.out.println("Name of Thread 1  " + t1.getName()); 
        System.out.println("Id of Threaed 1 :   " + t1.getId()); 


        System.out.println("Runnable Intrfaces Thread :  \n"); 

        Mythread3 t3 = new Mythread3();
        Mythread4 t4 = new Mythread4(); 

        Thread tt3 = new Thread(t3);
        Thread tt4 = new Thread(t4);

        tt3.start();
        tt4.start();       

        Mythread5 t5 = new Mythread5();
        t5.start();  

        try 
        {
            t5.join();
        } 
        catch(Exception e)
        {
            System.out.println(e); 
        }

        t2.start();

    }    
}
