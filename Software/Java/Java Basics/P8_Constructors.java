
// Getters - Setters  &  Constructors in Java 


class MyEmployee1 
{
    private int id;
    private String name; 

    // Getter
    public int getId()
    {
        return id;
    } 

    public String getName()
    {
        return name;
    } 

    // Setter
    public void setId(int id)
    {
        this.id = id; 
    } 

    public void setname(String name)
    {
        this.name = name; 
    }
} 

class MyEmployee2 
{
    int id;
    String name; 

    // non-para constructor 
    public MyEmployee2()
    {
        id = 5353;
        name = "Rahul Kumar"; 
    }
} 

class MyEmployee3 
{
    int id;
    String name; 

    MyEmployee3()
    {
        id = 5357;
        name = "Rohan Dhall"; 
    } 

    // para constructor 
    MyEmployee3(int id)
    {
        this.id = id;
    } 

    // constructor overloading 
    MyEmployee3(String name)
    {
        this.name = name;   
    } 

    MyEmployee3(String name,int id)
    {
        this.id = id;
        this.name = name; 
    } 

    public void display()
    {
        System.out.print("\nNamne :  " + name);
        System.out.print("\nId : " + id);
    }
}


public class P8_Constructors 
{
    public static void main(String[] args) 
    {
        System.out.print("\nFor Employee 1 : "); 

        MyEmployee1 e1 = new MyEmployee1();
        e1.setId(5656);
        e1.setname("Bharat");

        System.out.println("Name : " + e1.getName());
        System.out.println("Id : " + e1.getId()); 


        System.out.print("\n\nFor Employee 2 : ");

        MyEmployee2 e2 = new MyEmployee2();
        System.out.println("Name :  " + e2.name);
        System.out.println("Id :  " + e2.id); 


        System.out.println("\n\nFor Employeee 3 :  "); 

        MyEmployee3 e3 = new MyEmployee3(); 
        e3.display();

        System.out.println("\n");
        MyEmployee3 e32 = new MyEmployee3(7898);
        e32.display();

        System.out.println("\n");
        MyEmployee3 e33 = new MyEmployee3("Rahul");
        e33.display();

        System.out.println("\n"); 
        MyEmployee3 e34 = new MyEmployee3("Aryan",5353);
        e34.display();

    }    
}
