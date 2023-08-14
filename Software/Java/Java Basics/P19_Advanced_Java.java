
// Advanced Java Functions 


class KeyPhone 
{
    @Deprecated
    void sendMess()
    {
        System.out.println("Text Message Sent !!");
    } 
} 

class Android extends KeyPhone
{
    @Override
    void sendMess()
    {
        System.out.println("Message sent via Telegram !!");
    }
}  

interface DemoAnoo
{
    void meth1();

    void meth2(); 
}  

// Functional Interface --> only 1 method in the interface 
@FunctionalInterface
interface myFunc 
{
    void methhod1(int a); 
}



public class P19_Advanced_Java 
{
    public static void main(String[] args) 
    {
        // Anoonomous Class --> Creating directly object for the interface 
        DemoAnoo obj = new DemoAnoo()
        {
            @Override
            public void meth1()
            {
                System.out.println("I am method 1 ");
            }

            @Override
            public void meth2()
            {
                System.out.println("I am method 2 ");
            } 
        }; 

        obj.meth1();
        obj.meth2();


        myFunc objj = (a) -> 
        {
            System.out.println("I am Lambda function with value of a  : ->  " + a);       
        };
        objj.methhod1(78); 


        @SuppressWarnings("deprecation")
        Android a = new Android();
        a.sendMess(); 

    }    
}
