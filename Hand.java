import java.util.ArrayList;

/**
 * Hand models a hand of cards held by a player.
 * 
 * @author Lynn Marshall 
 * @version 1.2 Feb 19, 2019
 * 
 * @author Ahmed Ali (101181126).
 * @version February 27th, 2022.
 *
 */
public class Hand
{
    /** 
     * The cards are stored in an array-list implementation of the
     * List collection.
     */
    private ArrayList<Card> cards;

    /**
     * Constructs a new, empty hand.
     */
    public Hand()
    {   
        cards = new ArrayList<Card>();
    }
    
    /**
     * Adds the specified card to this hand.
     * 
     * @param the card to be added to the hand
     */
    public void addCard(Card aCard)
    {
        cards.add(aCard);
    }
     
    /**
     * Removes a card from this hand. Cards are removed in the order in
     * which they were added to the hand.
     * 
     * @return card to be played from the hand
     */
    public Card playCard()
    {
        return cards.remove(0);
    }

    /**
     * Returns the number of cards that are currently in this hand.
     * 
     * @return how many cards are in hand
     */    
    public int size()
    {
        return cards.size();
    }

    /**
     * Determines if this hand is empty.
     * 
     * @return true if hand is empty, false otherwis
     */    
    public boolean isEmpty()
    {
        return size() == 0;
    }

    /**
     * Returns a String that lists the ranks (but not the suits) of all the 
     * cards in this hand, starting with the first card and finishing with
     * the last card. For example, if the first card is the two of hearts, 
     * the second card is the five of diamonds, and the last card is the
     * queen of clubs, the String returned by this method will be: "2 5 12".
     * 
     * @return string of all ranks in hand
     */
    public String toString()
    {
        String sRanks = "";
        for (int i = 0; i < size(); i++){
            if (i == size() - 1){
                sRanks += cards.get(i).rank();
            } else{
                sRanks += cards.get(i).rank() + " ";
            }
        }
        return sRanks;
    }
}
