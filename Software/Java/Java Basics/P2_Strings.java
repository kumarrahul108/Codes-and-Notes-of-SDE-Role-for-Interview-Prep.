
// Strings in Java 

import java.util.Scanner; 

public class P2_Strings 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String :  ");
        String str = sc.nextLine(); 
        System.out.println("Inputed String " + str); 

        String s = new String("Hi , My name is Rahul Aryan . I am a software Developer !!"); 
        System.out.println(s);
        System.out.println("Length of this string :  " + s.length());
        String s1 = s.toLowerCase();
        String s2 = s.substring(4, 11);
        System.out.println(s1);
        System.out.println(s2); 

        // Different printing format 

        String st = "Aryan"; 
        float f = 2.54f;
        double d = 45.23;
        char c = 'a';  

        System.out.printf("\nThe value of double d  %f ",d);
        System.out.printf("\nThe value of float f %f  ",f);
        System.out.printf("\nTyhe value of character ch %c ",c);
        System.out.printf("\nThe value of string ss %s ",s);        

        char ch = s.charAt(15);
    }    
}
