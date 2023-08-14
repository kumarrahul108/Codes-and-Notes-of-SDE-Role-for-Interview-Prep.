
// Claases & Objects in Java 

class Employee1
{
    int id;
    String name;
} 

class Employee2 
{
    int id;
    String name; 

    public void printDetails()
    {
        System.out.println("For Employee 2 :  ");
        System.out.println("Name  : " + name);
        System.out.println("id : " + id);
    }

}


public class P7_OOPs 
{
    public static void main(String[] args) 
    {
        Employee1 e1 = new Employee1();
        e1.name = "Aryan";
        e1.id = 5253;

        System.out.println("For Employee 1 :  ");
        System.out.println("Name of Employee1 : " + e1.name);
        System.out.println("Id of Employee1 : " + e1.id);


        System.out.println("\n\n");

        Employee2 e2 = new Employee2();
        e2.name = "Rahul";
        e2.id = 5353;
        e2.printDetails();

    }    
}
