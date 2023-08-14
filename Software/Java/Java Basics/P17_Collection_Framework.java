
// Collections Framework 


import java.util.*;
import java.time.LocalDate;
import java.time.*; 
import java.time.format.DateTimeFormatter;   

public class P17_Collection_Framework 
{
    public static void main(String[] args) 
    {
        // Data Types

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(78);
        l1.add(56);
        l1.add(2,67);

        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i) + "   ");
        }

        // Date - Class 
        System.out.println("\nDate Class :  \n"); 
        Date d = new Date(); 

        System.out.println(d);

        System.out.println("Current Time in miliseconds :  " + System.currentTimeMillis());

        System.out.println(d.getDate() + " " + d.getHours() + " " + d.getMinutes() +" " + d.getSeconds()); 


        // Calender Class 

        System.out.println("\nCalender Class : \n");
        Calendar c = Calendar.getInstance(); 
        System.out.println(c);
        System.out.println("Time in Digital Format :  " + c.get(Calendar.HOUR) + " : " + c.get(Calendar.MINUTE) + " : " + c.get(Calendar.SECOND)); 


        // Date Time Formatting 

        System.out.println("Date Time Formatting :  "); 
        LocalDate dt = LocalDate.now();
        System.out.println(dt); 

        LocalTime tt = LocalTime.now();
        System.out.println(tt);

        LocalDateTime dt2 = LocalDateTime.now();
        System.out.println(dt2); 

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myDate = dt2.format(df);
        System.out.println(myDate); 
    }    
}