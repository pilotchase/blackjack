/**
(c) C. Morgan - 2018
*/

import java.util.ArrayList;
import java.util.Random;
public class Deck
{
    private Card holder;
    private ArrayList<Card> deck;
    public Deck() {
         deck = new ArrayList<Card>();
    }
    public Card deal() {
        int val = 0;
        Random rand = new Random();
        int index = rand.nextInt(51 - val);
        Card holder =  deck.get(index);
        deck.remove(index);
        val++;
        return holder;
    }
    public void createDeck() {
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", 
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        for(String s : suits) {
            int value = 1;
            for(String r : ranks) {
                Card holder = new Card(value , s, r);
                value++;
                if(value > 10) {
                    value = 10;
                }
                deck.add(holder);
            }
        }
    }
    
}
