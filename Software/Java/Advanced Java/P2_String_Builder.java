
// String Builder in Java 

public class P2_String_Builder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Toony");
        System.out.println("\n" + sb); 

        System.out.println(sb.charAt(2));

        sb.setCharAt(1, 'R');
        System.out.println(sb);

        sb.insert(2,'n');
        System.out.println(sb);

        sb.delete(2,3);
        System.out.println(sb);

        sb.insert(2,'r');
        System.out.println(sb);

        sb.append('e');  // add at the last of the string
        sb.append('r');
        sb.append('t');
        System.out.println(sb); 

        System.out.println("\nReversing a String using String Builder :  \n");

        StringBuilder sb1 = new StringBuilder("Tanisha Jain");
        System.out.println("Original String :  " + sb1);

        int ln = sb1.length();
        System.out.println("Length of String :  " + ln);

        for(int i=0;i<ln/2;i++) 
        {
            int f_idx = i;  // forward index
            int b_idx = ln-i-1;  // last index
            
            char f_char = sb1.charAt(f_idx);  // forard character
            char b_char = sb1.charAt(b_idx);  // last character

            // setting characters
            sb1.setCharAt(f_idx,b_char);
            sb1.setCharAt(b_idx,f_char);
        } 

        System.out.println("\nReverse String :  " + sb1);
        
    }    
}
