

import java.util.Scanner;
public class GuessingNoGame {
    public static void main(String args[]) 
    {
        int New_Attempt = 0;
        int Total_Attempts = 1;
        
        int RanDom_No=(int)(Math.random() * 99 + 1);           
        Scanner som = new Scanner(System.in);
        System.out.println("Welcome to Guessing Number Game!!");
        System.out.println("Guess the correct number and win the game!");
        System.out.println("You have Maximum of 5 Attempts.");
        do {
            System.out.println("Guess the number between 1 to 100");
            if(som.hasNextInt()) {
                New_Attempt = som.nextInt();
                if (New_Attempt == RanDom_No)
                {    
                    System.out.println("OH My Goodness!, Your Number is Correct. You Win the Game! ");
                    System.out.println(" Nice Guess yar! ");
                    break;
                }
                else if (New_Attempt < RanDom_No)
                    System.out.println("Your Guessed Number is Quiet Smaller!");
                else if (New_Attempt > RanDom_No)
                    System.out.println("Your Guessed Number is Quiet Greater!");
                if(Total_Attempts == 5) {
                    System.out.println("You have exceeded the maximum attempts. \n Try Again Later !");
                    break;
                }
                Total_Attempts++;
            }else {
                System.out.println("Enter a Valid Integer Within The Range");
                break;
            }
        } while (New_Attempt!=RanDom_No);
    }
}