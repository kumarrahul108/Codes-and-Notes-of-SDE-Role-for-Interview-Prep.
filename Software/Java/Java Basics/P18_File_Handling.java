
// File Handling in Java 


import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P18_File_Handling 
{
    public static void main(String[] args) 
    {
        File f = new File("rk.txt"); 

        // File Creation 
        try 
        {
            f.createNewFile();
            System.out.println("File Created !!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }  

        // writting a File 
        try 
        {
            FileWriter fw = new FileWriter("rk.txt");
            fw.write("Files In Java !!");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("File not Found !!");
            e.printStackTrace();
        } 

        // Reading file in Java 

        try 
        {
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                String st = sc.nextLine();
                System.out.println(st); 
            } 
            sc.close(); 
        }  

        catch(Exception e)  
        {
            System.out.println("File Not Found !!");
            e.printStackTrace();
        }


        // Deleting file in Java 

        if(f.delete())
        {
            System.out.println("File Deleted !!");
        } 
        else 
        {
            System.out.println("Some Error Occured !!");
        }
    }    
}
