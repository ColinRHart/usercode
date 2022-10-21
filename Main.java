import java.util.Scanner;
import java.lang.Math;
public class Main 
    {
    static String [] [] field = new String [10] [11];
    public static void main(String[] args)
        {
        instructorYOrN();
        toContinue();
        beginGame();
        }
    public static void instructorYOrN()
        {
        Scanner instruct = new Scanner(System.in);
        System.out.println("Would you like instructions? 1)Yes 2) No");
        int yOrN = instruct.nextInt();
        if(yOrN == 1)
            {
            instructMe();
            }
        }
    public static void spacer()
        {
        System.out.println(" ");
        }
    public static void instructMe() 
        {
        System.out.println("* Before we play let me explain how to play");
        spacer();
        System.out.println("* To play you will be given a selection of 4 plays on either side of the ball.(Only run plays for now....)");
        spacer();
        System.out.println("* For example: 1) Strong Iso 2) Weak Iso 3) Strong Outside 4) Weak Outside");
        spacer();
        System.out.println("* You will then Enter 1, 2, 3, or 4.");
        spacer();
        System.out.println("* The defensive play will be selected by the AI and you will be given a few choices as you watch your play unfold, such as cutback or continue.");
        spacer();
        System.out.println("* You will only get to adjust the play once while the defense will attempt to tackle you, if they get to your space you will likely be tackled");
        spacer();
        }
    public static void toContinue()
        {
        Scanner enter = new Scanner(System.in);
        System.out.println("Press Enter to continue...");
        String entered = enter.nextLine();
        }
    public static void printField()
        {
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [0] [0] + "|" +  field [0] [1] + "|" +  field [0] [2] + "|" +  field [0] [3] + "|" +  field [0] [4] + "|" + field [0] [5] + "|" +  field [0] [6] + "|"  +  field [0] [7] + "|" +  field [0] [8] +"|" +  field [0] [9] + "|" + field [0] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [1] [0] + "|" +  field [1] [1] + "|" +  field [1] [2] + "|" +  field [1] [3] + "|" +  field [1] [4] + "|" + field [1] [5] + "|" +  field [1] [6] + "|"  +  field [1] [7] + "|" +  field [1] [8] +"|" +  field [1] [9] + "|" + field [1] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [2] [0] + "|" +  field [2] [1] + "|" +  field [2] [2] + "|" +  field [2] [3] + "|" +  field [2] [4] + "|" + field [2] [5] + "|" +  field [2] [6] + "|"  +  field [2] [7] + "|" +  field [2] [8] +"|" +  field [2] [9] + "|" + field [2] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [3] [0] + "|" +  field [3] [1] + "|" +  field [3] [2] + "|" +  field [3] [3] + "|" +  field [3] [4] + "|" + field [3] [5] + "|" +  field [3] [6] + "|"  +  field [3] [7] + "|" +  field [3] [8] +"|" +  field [3] [9] + "|" + field [3] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [4] [0] + "|" +  field [4] [1] + "|" +  field [4] [2] + "|" +  field [4] [3] + "|" +  field [4] [4] + "|" + field [4] [5] + "|" +  field [4] [6] + "|"  +  field [4] [7] + "|" +  field [4] [8] +"|" +  field [4] [9] + "|" + field [4] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [5] [0] + "|" +  field [5] [1] + "|" +  field [5] [2] + "|" +  field [5] [3] + "|" +  field [5] [4] + "|" + field [5] [5] + "|" +  field [5] [6] + "|"  +  field [5] [7] + "|" +  field [5] [8] +"|" +  field [5] [9] + "|" + field [5] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [6] [0] + "|" +  field [6] [1] + "|" +  field [6] [2] + "|" +  field [6] [3] + "|" +  field [6] [4] + "|" + field [6] [5] + "|" +  field [6] [6] + "|"  +  field [6] [7] + "|" +  field [6] [8] +"|" +  field [6] [9] + "|" + field [6] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [7] [0] + "|" +  field [7] [1] + "|" +  field [7] [2] + "|" +  field [7] [3] + "|" +  field [7] [4] + "|" + field [7] [5] + "|" +  field [7] [6] + "|"  +  field [7] [7] + "|" +  field [7] [8] +"|" +  field [7] [9] + "|" + field [7] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [8] [0] + "|" +  field [8] [1] + "|" +  field [8] [2] + "|" +  field [8] [3] + "|" +  field [8] [4] + "|" + field [8] [5] + "|" +  field [8] [6] + "|"  +  field [8] [7] + "|" +  field [8] [8] +"|" +  field [8] [9] + "|" + field [8] [10] + "|");
        System.out.println(" _________________________________________________________________");
        System.out.println("|" +  field [9] [0] + "|" +  field [9] [1] + "|" +  field [9] [2] + "|" +  field [9] [3] + "|" +  field [9] [4] + "|" + field [9] [5] + "|" +  field [9] [6] + "|"  +  field [9] [7] + "|" +  field [9] [8] +"|" +  field [9] [9] + "|" + field [9] [10] + "|");
        System.out.println(" _________________________________________________________________");
        }
    public static void peopleAd()
        {
        for(int row = 0; row <  field.length; row++)
            {
            for(int col = 0; col < field[0].length; col++) 
                {
                field [row] [col] = "     ";
                }
            } 
        field [5] [7] = "  O  ";
        field [5] [6] = "  O  ";
        field [5] [5] = "  C  ";
        field [5] [4] = "  O  ";
        field [5] [3] = "  O  ";

        field [4] [7] = "   X ";
        field [4] [6] = " X   ";
        field [4] [4] = "  X  ";
        field [4] [3] = "X    ";

        field [7] [5] = "  Q  ";
        field [8] [5] = "  R  ";
        field [6] [6] = "  F  ";

        field [2] [6] = "  L  ";
        field [2] [4] = "  L  ";
        field [3] [2] = "  L  ";
        field [3] [8] = "  L  ";
        }
    public static void firstChoice()    
        {
        Scanner move = new Scanner(System.in);
        System.out.println("Run left or run right? 1)Left 2)Right");
        int rOrL = move.nextInt();
        if(rOrL == 1)
            {
            int randOne = (int)(Math.random()*100) + 1;
            int randTwo = (int)(Math.random()*100) + 1;
            int randThree = (int)(Math.random()*100) + 1;
            int randFour = (int)(Math.random()*100) + 1;
            int randFive = (int)(Math.random()*100) + 1;
            int randSix = (int)(Math.random()*100) + 1;
            field [8] [5] = "     ";
            field [7] [4] = "  R  ";
            field [6] [6] = "     ";
            field [6] [5] = "  F  ";
            field [4] [2] = "  L  ";
            field [4] [8] = "  L  ";
            field [3] [2] = "     ";
            field [3] [8] = "     ";
            if(randOne >= 80) 
                {
                field [5] [3] = "     ";
                field [4] [3] = "xO   ";
                }
            else if(randOne >= 40 && randOne < 80)
                {
                field [5] [3] ="     ";
                field [4] [3] ="XO   ";
                }
            else if(randOne < 40)
                {
                field [4] [3] ="     ";
                field [5] [3] ="  Xo ";
                }

            if(randTwo >= 80) 
                {
                field [5] [4] = "     ";
                field [4] [4] = " xO  ";
                }
            else if(randTwo >= 40 && randTwo < 80)
                {
                field [5] [4] ="     ";
                field [4] [4] =" XO  ";
                }
            else if(randTwo < 40)
                {
                field [4] [4] = "     ";
                field [5] [4] = " Xo  ";
                }

            if(randThree >= 80) 
                {
                field [5] [6] = "     ";
                field [4] [6] = "xO   ";
                }
            else if(randThree >= 40 && randThree < 80)
                {
                field [5] [6] ="     ";
                field [4] [6] ="XO   ";
                }
            else if(randThree < 40)
                {
                field [4] [6] = "     ";
                field [5] [6] = "Xo   ";
                }

            if(randFour >= 80) 
                {
                field [5] [7] = "     ";
                field [4] [7] = " O  x";
                }
            else if(randFour >= 40 && randFour < 80)
                {
                field [5] [7] ="     ";
                field [4] [7] ="OX   ";
                }
            else if(randFour < 40)
                {
                field [4] [7] = "     ";
                field [5] [7] = "oX   ";
                }
            field [5] [5] = "     ";
            field [4] [5] = "  C  ";

            field [2] [6] = "     ";
            field [2] [4] = "     ";
            field [2] [3] = "  L  ";
            field [2] [5] = "  L  ";

            field [4] [2] = "     ";
            field [4] [8] = "     ";
            field [5] [2] = "  L  ";
            field [5] [8] = "  L  ";

            printField();
            toContinue();

            field [7] [4] = "     ";
            field [6] [3] = "F    ";
            field [6] [5] = "     ";
            field [6] [4] = "  R  ";
            field [4] [5] = "     ";
            if(randFive >= 80) 
                {
                field [2] [5] = "     ";
                field [3] [5] = "lC   ";
                }
            else if(randFive >= 40 && randFive < 80)
                {
                field [2] [5] ="     ";
                field [3] [5] =" LC  ";
                }
            else if(randFive < 40)
                {
                field [2] [5] = "     ";
                field [3] [5] = "  Lc ";
                }
            field [5] [8] = "     ";
            field [5] [7] = "  L  ";
            
            printField();
            toContinue();
            if(randSix >= 80) 
                {
                field [5] [2] = "     ";
                field [6] [3] = "     ";
                field [5] [3] = "lF   ";
                }
            else if(randSix >= 40 && randSix < 80)
                {
                field [5] [2] ="     ";
                field [6] [3] ="     ";
                field [5] [3] =" LF  ";
                }
            else if(randSix < 40)
                {
                field [5] [2] = "     ";
                field [6] [3] = "     ";
                field [5] [3] = "   Lf";
                }
            field [5] [7] = "     ";
            field [5] [6] = "  L  ";
            printField();
            
            }
        }
    public static void beginGame() 
        {
        System.out.println("WELCOME TO THE GAME OF ELECTRIC FOOTBALL!!!");
        peopleAd();
        printField();
        firstChoice();
        }
    
    }
