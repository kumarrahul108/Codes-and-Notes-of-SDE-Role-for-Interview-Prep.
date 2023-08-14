
// Recurssion in Java 


import java.util.*;

public class P4_Recursion 
{

    // 1. Print numbers from 5 to 1 
    public static void r1(int n)
    {
        // Base Case 
        if(n == 0)
        {
            return;
        }

        System.out.print(n + "   ");
        r1(n-1);
    }


    // 2. Print numbers from 1 to 5
    public static void r2(int n)
    {
        // Base Case
        if(n == 6)
        {
            return;
        }

        System.out.print(n + "   ");
        r2(n+1);
    }


    // 3. Sum of Natural Numbers from 1 to n
    public static void r3(int i,int n,int sum)
    {
        // Base Case 
        if(i == n)
        {
            sum += i; 
            System.out.print(sum);
            return; 
        }

        sum += i; 

        r3(i+1,n,sum);
    }


    // 4. Factorial of Number 
    public static void r4(int f,int n) 
    {
        // Base Case 
        if(n == 0)
        {
            System.out.print(f);
            return;
        } 

        f = f * n;
        r4(f,n-1);
    } 


    // 5. Factorial of Number
    public static int r5(int n)
    {
        // Base Case
        if(n == 0 || n == 1) 
        {
            return 1;
        } 

        int f1 = r5(n-1);

        int f2 = n * f1;

        return f2;
    } 


    // 6. Fibonacci Series
    public static void r6(int a,int b,int n)
    {
        // Base Case 
        if(n == 0)
        {
            return;
        } 

        int c = a + b;
        System.out.print(c + "  ");

        r6(b,c,n-1);
    } 


    // 7. X ^ n  --> stack height - n 
    public static int r7(int x,int n)
    {
        // Base Case 
        if(n == 0)
        {
            return 1;
        }

        if(x == 0)
        {
            return 0;
        }

        int x1 = r7(x,n-1);

        int x2 = x * x1;

        return x2; 
    }


    // 8. X ^ n --> stack height - log(n)
    public static int r8(int x,int n)
    {
        // Base Case 
        if(x == 0)
        {
            return 0;
        } 

        if(n == 0)
        {
            return 1; 
        } 

        // even case 
        if(n % 2 == 0)
        {
            return r8(x,n/2) * r8(x,n/2);
        }

        // odd case 
        if(n % 2 != 0)
        {
            return x * r8(x,n/2) * r8(x,n/2);
        }

        return 1; 
    } 


    // 9. Tower of Hanoi 
    public static void r9(String S,String H,String D,int n)
    {
        // Base Case 
        if(n == 1)
        {
            System.out.println("Transferred Disc from " + S + " to " + D);
            return; 
        } 

        r9(S,D,H,n-1);
        System.out.println("Transferred Disc from " + n + " from " +  S + " to " + H + " Using " + D);

        r9(H,S,D,n-1);
         System.out.println("Transferred Disc from " + n + " from " +  S + " to " + D + " Using " + H);

    } 


    // 10. Reverse a String 
    public static void r10(String s,int idx)
    {
        // Base Case 
        if(idx == 0)
        {
            System.out.print(s.charAt(idx));
            return;
        } 

        System.out.print(s.charAt(idx));
        r10(s,idx-1);
    } 


    // 11. Find first & last occurance of an element in a String 
    public static int first = -1;
    public static int last = -1; 
    public static void r11(String s,int idx,char element)
    {
        // Base Case
        if(idx == s.length())
        {
            System.out.println("First Position : " + first); 
            System.out.println("Last Position  : " + last);
            return;
        } 

        char curr = s.charAt(idx);

        if(curr == element)
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx; 
            }
        }

        r11(s,idx+1,element);
    }


    // 12. Check whether an array is sorted 
    public static boolean r12(int a[],int idx)
    {
        // Base Case 
        if(idx == a.length-1)
        {
            return true;
        } 

        if(a[idx] < a[idx+1])
        {
            return r12(a,idx+1);
        }
        else 
        {
            return false;
        }
    }


    // 13. Move all 'x' to the end of the String
    public static void r13(String s,int idx,int count,String newStr)
    {
        // Base Case 
        if(idx == s.length())
        {
            for(int i=0;i<count;i++)
            {
                newStr = newStr + "x";
            }

            System.out.print(newStr);
            return;
        } 

        char curr = s.charAt(idx);
        if(curr == 'x')
        {
            count++;
            r13(s,idx+1,count,newStr); 
        }
        else 
        {
            newStr += curr;
            r13(s,idx+1,count,newStr);
        }
    } 


    // 14. Remove Duplicate in a String 
    public static boolean map[] = new boolean[26];

    public static void r14(String s,int idx,String newStr)
    {
        // Base Case 
        if(idx == s.length())
        {
            System.out.print(newStr);
            return;
        }  

        char curr = s.charAt(idx);
        if(map[curr - 'a'] == true)  
        {
            r14(s,idx+1,newStr);
        }
        else 
        {
            newStr += curr; 
            map[curr - 'a'] = true;
            r14(s,idx+1,newStr);
        }
    }


    // 15. Print all the Subsequences of a String "abc" 
    public static void r15(String s, int idx, String new_str)
    {
        // Base Case 
        if(idx == s.length())
        {
            System.out.println(new_str);
            return; 
        } 

        char curr = s.charAt(idx); 

        // Choose to be 
        r15(s,idx+1,new_str + curr);

        // Choose not to be 
         r15(s,idx+1,new_str);
    }


    // 16. Print all the Unique Subsequence of a String  
    public static void r16(String s,int idx,String new_str,HashSet<String> set)
    {
        // Base Case 
        if(idx == s.length())
        {
            if(set.contains(new_str))
            {
                return;
            }     
            else 
            {
                System.out.println(new_str);
                set.add(new_str);
                return;
            }       
        }  

        char curr = s.charAt(idx);

        // choose to be 
        r16(s,idx+1,new_str + curr,set);

        // choose not to be 
        r16(s,idx+1,new_str,set); 
    }


    // 17. Print KeyPad Combination  
    public static String keypad[]= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void r17(String s,int idx,String comb)    
    {
        // Base Case 
        if(idx == s.length())
        {
            System.out.println(comb);
            return; 
        }   

        char curr = s.charAt(idx);

        String mapping = keypad[curr - '0'];

        for(int i=0;i<mapping.length();i++)
        {
            r17(s,idx+1,comb + mapping.charAt(i));
        }
    }


    // 18. Print all the Permutation of a String 
    public static void r18(String s,String perm)
    {
        // Base Case 
        if(s.length() == 0)
        {
            System.out.println(perm);
            return;
        } 

        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            String nst = s.substring(0,i) + s.substring(i+1);

            r18(nst,perm + curr);
        }
    } 


    // 19. Total Path in a Maze to move from (0,0) to (n,m)
    public static int r19(int i,int j,int n,int m)
    {
        // Base Case    
        if(i == n || j == m)
        {
            return 0;
        } 

        if(i == n-1 || j == m-1)
        {
            return 1;
        } 

        // move downward
        int downpath = r19(i+1,j,n,m);

        // move rightward
        int rightpath = r19(i,j+1,n,m);

        return (rightpath + downpath);
    } 


    // 20. Place Tiles of size (1 X m) in a floor of size (n X m)
    public static int r20(int n,int m)
    {
        // Base Case 
        if(n == m)
        {
            return 2;   // either put horitonally or vertically 
        } 

        if(n < m)
        {
            return 1;  // only 1 way possible 
        } 

        // vertically 
        int ver = r20(n-m,m);

        // horizontlly
        int hor = r20(n-1,m);

        return (ver + hor); 
    } 


    // 21. No. of ways in which 'n' people can be invited to ypur party (single or pair)
    public static int r21(int n)
    {
        // Base Case 
        if(n <= 1)
        {
            return 1;
        } 

        // single 
        int way1 = r21(n-1);

        // pair  
        int way2 = (n-1) * r21(n-2);

        return (way1 + way2);
    }


    // 22. Print all the subset of a set of 1st 'n' natural numbers 
    public static void r22(int n,ArrayList<Integer> subset)
    {
        // Base Case 
        if(n == 0) 
        {
            printSubset(subset);
            return;
        } 

        // add hoga 
        subset.add(n);
        r22(n-1, subset);

        // add nahi hoga 
        subset.remove(subset.size()-1);
        r22(n-1, subset);
    }

    public static void printSubset(ArrayList<Integer> subset)
    {
        for(int i = 0; i < subset.size(); i++)
        {
            System.out.print(subset.get(i) + "  ");
        }
        System.out.println();
    }

    
    // 23. Find Permutation using Back-Tracking
    public static void r23(String s,String str,int idx)
    {
        // Base Case 
        if(idx == s.length()) 
        {
            System.out.println(str);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            String ns = s.substring(0, i) + s.substring(i + 1);

            r23(ns,str + curr,idx + 1);
        }
    }




    public static void main(String[] args) 
    {
        System.out.print("\nRecurssion 1 : Print Numbers from 5 to 1  :   ");  
        r1(5);
        
        System.out.print("\n\nRecurssion 2 : Print Numbers from 1 to 5  :   ");  
        r2(1);

        System.out.print("\n\nRecurssion 3 : Sum of Natural Numbers from 1 to 10  :   ");  
        r3(1,10,0);

        System.out.print("\n\nRecurssion 4 : Factorial of Number 5  :   ");  
        r4(1,5); 

        System.out.print("\n\nRecurssion 5 : Factorial of Number 5  :   " + r5(5));  
        
        System.out.print("\n\nRecurssion 6 : Febbonacci Series    :   ");
        int n = 10;
        int a = 0,b =1;
        System.out.print(a + "  " + b + "  "); 
        r6(a,b,n-2);  

        System.out.print("\n\nRecurssion 7 : X ^ n   :   " + r7(2,5));

        System.out.print("\n\nRecurssion 8 : X ^ n   :   " + r8(2, 5));

        System.out.println("\n\nRecurssion 9 : Tower of Hanoi :  ");
        r9("Source","Helper","Destination",3);

        System.out.print("\n\nRecurssion 10 : Reversing our String    :   "); 
        String s = "Tanisha";
        r10(s,s.length()-1);

        System.out.print("\n\nRecurssion 11 : Find first & last occurance of an element in a String   :     \n");
        String str = "abaacdabad";
        r11(str,0,'a');

        System.out.print("\n\nRecurssion 12 : Check whether an array is sorted   :     ");
        int arr[] = {1,3,5,7,9};
        System.out.print(r12(arr,0));

        System.out.print("\n\nRecurssion 13 : Move all 'x' to the end of the String   :     ");
        String st = "axbcxxdexgxh";
        r13(st,0,0,"");  

        System.out.print("\n\nRecurssion 14 : Remove Duplicate in a String  :     "); 
        String ss = "abbccda";
        r14(ss,0,""); 

        System.out.print("\n\nRecurssion 15 : Print all the Subsequences of a String abc   :     \n"); 
        r15("abc",0,""); 

        System.out.print("\nRecurssion 16 : Print all the Unique Subsequences of a String aaa   :     \n"); 
        HashSet<String> set = new HashSet<>();
        r16("aaa",0,"",set); 

        System.out.print("\nRecurssion 17 : Print KeyPad Combination  :   \n"); 
        r17("25",0,""); 

        System.out.print("\nRecurssion 18 : Print all the Permutation of a String  :   \n");
        r18("abc",""); 

        System.out.print("\nRecurssion 19 : Total Path in a Maze to move from (0,0) to (n,m)  :   " + r19(0,0,3,3));

        System.out.print("\n\nRecurssion 20 : Place Tiles of size (1 X m) in a floor of size (n X m)  :   " + r20(3,2));
        
        System.out.println("\n\nRecurssion 21 : No. of ways in which 'n' people can be invited to ypur party (single or pair)   :  " + r21(5));
        
        System.out.println("\n\nRecurssion 22 : Print all the subset of a set of 1st 'n' natural numbers  :  ");
        ArrayList<Integer> subset = new ArrayList<>();
        r22(3,subset);

        System.out.println("\n\nRecurssion 23 : Find Permutation using Back-Tracking  :   "); 
        r23("ABC","",0);
    }    
}
