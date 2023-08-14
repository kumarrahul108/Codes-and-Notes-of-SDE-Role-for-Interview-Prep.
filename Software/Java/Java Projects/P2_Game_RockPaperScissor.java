
/* 
    Project 2:

    Game - Rock , Paper & Scissor
    
    Game Rule : -->  Rock wins against scissors
                     Paper wins against rock
                     Scissors wins against paper
*/


import java.util.Scanner;
import java.util.Random;

public class P2_Game_RockPaperScissor 
{
    public static void game(int u,int c)
    {
        if(u == c)
        {
            System.out.println("Match is Tie !!");
        } 

        else if (c == 0)
        {
            if(u == 1)
            {
                System.out.println("You Won the Match !!");
            }

            if(u == 2)
            {
                System.out.println("You Loose the Match !!"); 
            }
        }

        else if (c == 1)
        {
            if(u == 0)
            {
                System.out.println("You Loose the Match !!"); 
            }

            if(u == 2) 
            {
                System.out.println("You Won the Match !!");
            }
        }

        else 
        {
            if(u == 0)
            {
                System.out.println("You Loose the Match !!");
            }

            if(u == 1)
            {
                System.out.println("You Won the Match !!");
            }
        }
    }



    public static void main(String[] args) 
    {
        // Scanner Class Object 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n0 : Rock  \n1 : Paper  \n2 : Scissors");
        int user = sc.nextInt();

        // Random Class Object 
        Random r =  new Random();
        int comp = r.nextInt(3);  // 0 to 2

        game(user, comp);

        System.out.println("Computer Choose : " + comp);
        System.out.println("User Choose : " + user);
    }    
}
