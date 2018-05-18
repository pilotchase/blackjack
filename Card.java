/**
* (c) C. Morgan - 2018
*/

public class Card
{
    public int value;
    public String suit;
    public String face;
    public Card(int constValue, String constSuit, String constFace) {
        value = constValue;
        suit = constSuit;
        face = constFace;
    }
    public String getSuit() {
        return "This is a" + suit + " card.";
    }
    public int getValue() {
        return value;
    }
    public String toString() {
        return "This is a " + value + " of " + suit;
    }
}
