import java.util.*;
public class Menu
{
   static Scanner console = new Scanner(System.in);
   public static void main(String[] args)
   {     
     Christmas rfChristmas;
    
   
     String[] cards = {"Christmas", "ValentinesDay", "Birthday", "GetWellSoon", "Anniversary", "NewBaby", "ThankYou", "Congratulations", "BlankCard"};
     
     System.out.println("What is the name of the sender of the card?");
     String from2 = console.next();
     System.out.println("What is the name of the recipient of the card?");
     String recipient2 = console.next();
     
     
     
     
     System.out.println("Choose the number from 1 through 9 that corresponds with the type of card you'd like to send");
     System.out.println("1. Christmas 2. Valentine's Day 3.Birthday 4. Get Well Soon 5. Anniversary 6. New Baby 7. Thank You 8. Congratulations 9. Blank Card.");
     int numberChosen = console.nextInt();
     if (numberChosen.isInt == true)
     {
     rfChristmas = new Christmas(recipient2, from2);
     rfChristmas.makeCard();
     }
     
    
     
     
       
   }
     
}