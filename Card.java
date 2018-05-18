/**
* (c) C. Morgan - 2018
**/

public class Card
{
    public int value;
    public String suit;
    public String face;
    public Card(int val, String s, String f) {
        value = val;
        suit = s;
        face = f;
    }
    public String getSuit() {
        return "This is a" + suit + " card.";
    }
    public int getValue() {
        return value;
    }
    public String toString() {
        return value + " of " + suit;
    }
}
