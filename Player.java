/**
(c) C. Morgan - 2018
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Player
{
    private double points;
    private double bet;
    private String name;
    private ArrayList<Card> myCard;
    public Player(String nm, double p) {
        name = nm;
        points = p;
        myCard = new ArrayList<Card>();
    }
    public void getPlayerHand(){
        return myCard.get();   
    }
    public double bet() {
        Scanner points = new Scanner(System.in);
        System.out.println("Let's start with a bet. From your available balance, how much money are you willing to lose?");
        double bet = points.nextDouble();
        if (bet > points || bet < 0) {
            System.out.println("Sorry, you are trying to gamble on credit. That is not allowed.");
        } else {
            points -= bet;
        }
        return points;
    }
    public Card hit(Card c) {
        myCard.add(c);
        return c;
    }
    public Card addCard(Card c) {
        myCard.add(c);
        return c;
    }
    public boolean stay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stay or Hit? Stay/Hit");
        boolean temp = false;
        if(scan.next().equals("Stay")) {
            temp = true;
        }
        return temp;
    }
    public double updateWinnings() {
        double winnings = 0.0;
        double temp = 0.0;
        temp = (1000 - points);
        winnings = 2 * (temp) + points;
        return winnings;
    }
    public double updateWinningsDealer() {
        double winning = 0.0;
        double tem = 0.0;
        tem = (1000 - points);
        return tem;
    }
    public int handTotal() {
        int value = 0;
        for (Card c : myCard) {
            if (c.getValue() == 1) {
                if (value <= 10) {
                    value += 11;
                }
                value += 1;
            }
            value += c.getValue();
        }
        return value;
    }
    public Card DealerHand() {
        return myCard.get(1);
    }
    public String toString() {
        return name + " has " + points + " dollars";
    }
}
