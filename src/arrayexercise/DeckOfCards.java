package arrayexercise;

import java.util.Arrays;

import static java.lang.System.arraycopy;
import static java.lang.System.in;

public class DeckOfCards {

    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suitOfCards = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] rankOfCards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "king"};
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;
        //initilze the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random()  * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // shuffle the cards
        for (int i = 0; i < 4; i++) {
            // int index = (int) (Math.random() * deck.length);
            String suit = suitOfCards[deck[i] / 13];
            String rank = rankOfCards[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }

            int[] source = {1, 2, 3, 4, 5};
            int[] t = new int[source.length];
            System.arraycopy(source,0, t, 0, source.length);
            System.out.println(Arrays.toString(t));


            int[] sourceArray = {6, 7, 8, 9, 10};
            int[] targetArray = new int[source.length];
            for (int j = 0; j < source.length; j++)
                targetArray[j] = sourceArray[j];
            System.out.println(Arrays.toString(targetArray));

            int[] myList;
            myList = new int[10];
            myList = new int[20];
            System.out.println(Arrays.toString(myList));




    }
}