public class Game
{
    public void play() {
        //Make players
        Player dealer = new Player("Dealer", 0);
        Player you = new Player("Player", 500);
        //Let player know holdings
        System.out.println(you.toString());
        System.out.println("You know have " + you.bet());
        //Make a deck
        Deck cards = new Deck();
        cards.createDeck();
        //Deal a card from the deck 
        Card card = cards.deal();
        Card card1 = cards.deal();
        Card card2 = cards.deal();
        Card card3 = cards.deal();
        //Add that card to player...
        you.addCard(card);
        you.addCard(card1);
        you.addCard(card2);
        you.addCard(card3);
        //Players handtotal
        System.out.println("The dealer has a " + dealer.DealerHand() + " hang");
        System.out.println("You have a " + you.handTotal() + " hand");
        if (you.handTotal() > 21) {
                    System.out.println("You have lost to the dealer.");
                    System.out.println("The dealer now has " + dealer.updateWinningsDealer());
                }
        //Player turn  
        while (you.stay() == true) {
            if (you.handTotal() < 21) {
                Card temp4 = cards.deal();
                you.hit(temp4);
                if (you.handTotal() > 21) {
                    System.out.println("The dealer wins, sorry");
                }
                System.out.println("Your cards are now worth " + you.handTotal());
            }
        }
        if (you.stay() == false) {
            if (you.handTotal() < 21 && you.handTotal() > dealer.handTotal()) {
                if (dealer.handTotal() <= 17) {
                    Card temp5 = cards.deal();
                    dealer.hit(temp5);
                    System.out.println("The Dealer's cards are now worth " + dealer.handTotal());
                }
            }
        }
        //Determine winner
        if (you.handTotal() == 21) {
            System.out.println("Jackpot!");
            System.out.println("You now have " + you.updateWinnings());
        } else if (you.handTotal() > dealer.handTotal() && you.handTotal() < 21) {
            System.out.println("The Dealer's cards are worth " + dealer.handTotal());
            System.out.println("The player wins!");
            System.out.println("You now have " + you.updateWinnings());
        } else {
            System.out.println("Your cards are worth " + you.handTotal());
            System.out.println("The dealer wins, sorry");
            System.out.println("The dealer now has " + dealer.updateWinningsDealer());
        }
        //End Game
        System.out.println("Game Over!");
    }
}
