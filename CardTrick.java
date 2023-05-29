package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            int randomValue = (int) (Math.random()*13)+1;
            String randomSuit = Card.SUITS[(int)(Math.random()*4)];
            Card c = new Card(randomSuit, randomValue);
            magicHand[i]= c;
            System.out.println(magicHand[i].getSuit() +" "+magicHand[i].getValue());
            
           
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of your Card(1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        
        
       System.out.println("enter the suit of your Card (Heart, Diamonds, Spades, Clubs");
       String userSuit= scanner.nextLine();
       
       boolean found = false;
       for(Card card : magicHand) {
           if(card.getValue()== userValue && card.getSuit().equalsIgnoreCase(userSuit)){
               found = true;
               break;
           }
       }
        if (found) {
            System.out.println("Your card is in the magicHand!");
        } else {
            System.out.println("Your card is not in the magicHand.");
        }
    }
    
}
