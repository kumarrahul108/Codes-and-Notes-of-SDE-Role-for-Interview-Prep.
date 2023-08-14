
// Pattern in Java 

public class P1_Pattern 
{
    // P -1 : Solid Rectangle 
    public static void p1()
    {
        // row
        for(int i=1;i<=4;i++)
        {
            // column
            for(int j=1;j<=5;j++)
            {
                System.out.print("*" + " ");
            } 
            System.out.println();  // line change
        }
    }  

    // P -2 : Hollow Rectangle  
    public static void p2()
    {
        // row
        for(int i=1;i<=4;i++)
        {
            // column
            for(int j=1;j<=5;j++)
            {
                // condition
                if(i==1 || j==1 || i==4 || j==5)
                {
                    System.out.print("*" + " "); 
                } 
                else 
                {
                    System.out.print("  ");  
                }
            }
            System.out.println();  // line change 
        }
    } 

    // P -3 : Half Pyramid 
    public static void p3()
    {
        // row 
        for(int i=1;i<=5;i++)
        {
            // column
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            } 
            System.out.println();
        }
    } 

    // P -4 : Inverted Half Pyramid 
    public static void p4()
    {
        // row
        for(int i=1;i<=5;i++)
        {
            // column
            for(int j=5;j>=i;j--)
            {
                System.out.print("*" + " ");
            } 
            System.out.println(); 
        }
    } 

    // P -5 : Inverted Half Pyramid rotated by 180 degree
    public static void p5()
    {
        // row
        for(int i=1;i<=5;i++)
        {
            // column spaces
            for(int j=5;j>i;j--)
            {
                System.out.print("  ");
            } 

            // star 
            for(int k=1;k<=i;k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }  

    // P -6 : Half Pyramid with Numbers 
    public static void p6()
    {
        // row
        for(int i=1;i<=5;i++)
        {
            // column
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // P -7 : Half Pyramid with Numbers
    public static void p7()
    {
        // row
        for(int i=5;i>=1;i--)
        {
            // column
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    } 

    // P -8 : Floyd's Triangle 
    public static void p8()
    {
        int num = 1;
        // row
        for(int i=1;i<=5;i++) 
        {
            // column 
            for(int j=1;j<=i;j++)
            {
                System.out.print(num + " ");
                num++; 
            }
            System.out.println();
        }
    }

    // P -9 : 0 - 1 Triangle
    public static void p9()
    {
        // row
        for(int i=1;i<=5;i++)
        {
            // column 
            for(int j=1;j<=i;j++)
            {
                if((i + j)%2 == 0)
                {
                    System.out.print("1" + " ");
                }
                else 
                {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }   

    // P -10 : Butterfly Pattern 
    public static void p10()
    {
        // 1st Half

        // row
        for(int i=1;i<=5;i++)
        {
            // column star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }

            // column space
            for(int k=1;k <= 2*(5-i);k++)
            {
                System.out.print("  "); 
            }

            // column star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 


        // 2nd Half

        // row
        for(int i=5;i>=1;i--) 
        {
            // column star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }

            // column space
            for(int k=1;k <= 2*(5-i);k++)
            {
                System.out.print("  "); 
            }

            // column star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 
    }

    // P -11 : Solid Rhombus 
    public static void p11()
    {
        // row 
        for(int i=1;i<=5;i++)
        {
            // column space
            for(int j=i;j<5;j++)
            {
                System.out.print("  ");
            } 

            // column star
            for(int j=1;j<=5;j++)
            {
                System.out.print("*" + " "); 
            }
            System.out.println();
        }
    }

    // P -12 : Number Pyramid 
    public static void p12()
    {
        // row 
        for(int i=1;i<=5;i++)
        {
            // column space
            for(int j=i;j<5;j++)
            {
                System.out.print("  ");
            }

            // column number
            for(int j=1;j<=i;j++)
            {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }

    // P -13 : Pallindrome Pattern
    public static void p13()
    {
        // row
        for(int i=1;i<=5;i++)
        {
            // column space
            for(int j=i;j<5;j++)
            {
                System.out.print("  ");
            } 

            // column 1st half number
            for(int j=i;j>=1;j--)
            {
                System.out.print(j + " ");
            } 

            // column 2nd half number
            for(int j=2;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    } 

    // P -14 : Diamond Pattern
    public static void p14()
    {
        // 1st Half

        // row
        for(int i=1;i<=5;i++)
        {
            // column space
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");
            } 

            // column star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println(); 
        }

        
        // 2nd Half

        // row
        for(int i=5;i>=1;i--)
        {
            // column space
            for(int j=i;j<5;j++)
            {
                System.out.print(" ");
            } 

            // column star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println(); 
        }
    }




    public static void main(String[] args) 
    {
        System.out.println("\nPattern - 1 :  Solid Rectangle  \n");
        p1();

        System.out.println("\nPattern - 2 :  Hollow Rectangle  \n");
        p2();

        System.out.println("\nPattern - 3 :  Half Pyramid  \n");
        p3();

        System.out.println("\nPattern - 4 :  Inverted Half Pyramid  \n");
        p4(); 

        System.out.println("\nPattern - 5 :  Inverted Half Pyramid rotated by 180 degree  \n");
        p5();

        System.out.println("\nPattern - 6 :  Half Pyramid with Numbers  \n");
        p6();

        System.out.println("\nPattern - 7 :  Inverted Half Pyramid with Numbers  \n");
        p7();

        System.out.println("\nPattern - 8 :  Floyd's Triangle  \n");
        p8();

        System.out.println("\nPattern - 9 :  0 - 1 Triangle  \n");
        p9();

        System.out.println("\nPattern - 10 :  Butterfly Pattern \n"); 
        p10();

        System.out.println("\nPattern - 11 :  Solid Rhombus \n");  
        p11();

        System.out.println("\nPattern - 12 :  Number Pyramid \n");  
        p12();

        System.out.println("\nPattern - 13 :  Pallindrome Pattern \n");  
        p13();

        System.out.println("\nPattern - 14 :  Diamond Pattern \n");  
        p14();
    }
}