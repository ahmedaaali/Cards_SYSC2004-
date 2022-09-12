import java.util.ArrayList;
import java.util.Random;

/**
 * Deck models a deck of 52 Anglo-American playing cards.
 * 
 * @author Lynn Marshall 
 * @version 1.1 October 11, 2012
 * 
 * @author Ahmed Ali (101181126).
 * @version February 27th, 2022.
 *
 */
public class Deck
{
    /** 
     * The cards are stored in a linked-list implementation of the
     * List collection.
     */
    private ArrayList<Card> cards;
    
    /** Lowest ranking card (the ace). */
    private static final int ACE = 1;
    
    /** Highest ranking card (the king). */
    private static final int KING = 13;
    
    /** 
     * Total number cards in the deck (4 suits, each with 13 cards of 
     * different ranks).
     */ 
    private static final int TOTAL_CARDS = 52;
    
    /** 
     * Some constants that define the Strings for the various suits.
     */ 
    private static final String HEARTS = "hearts";
    private static final String DIAMONDS = "diamonds";
    private static final String CLUBS = "clubs";
    private static final String SPADES = "spades";

    /**
     * Constructs a new, unshuffled deck containing 52 playing cards.
     */
    public Deck()
    {              
        cards = new ArrayList<Card>();
        buildSuit(HEARTS);
        buildSuit(DIAMONDS);
        buildSuit(CLUBS);
        buildSuit(SPADES);
    }
    
    /**
     * Creates the 13 cards for the specified suit, and adds them
     * to this deck.
     * 
     * @param the suit that 13 cards will be added to
     */
    private void buildSuit(String suit)
    {
        for (int i = ACE; i <= KING; i++){
            cards.add(new Card(suit, i));
        }
    }
 
    /**
     * Shuffles this deck of cards.
     */
    public void shuffle()
    {   
        Random rand = new Random();
        for (int i = 0; i < 10000; i++){
            int rand1 = rand.nextInt(TOTAL_CARDS);
            int rand2 = rand.nextInt(TOTAL_CARDS);
            Card temp1 = cards.get(rand1);
            Card temp2 = cards.get(rand2);
            cards.set(rand1, temp2);
            cards.set(rand2, temp1);
        }
    }
 
    /**
     * Removes a card from this deck.
     * 
     * @return card that was dealt from the front of the deck
     */
    public Card dealCard()
    {
        return cards.remove(0);
    }
 
    /**
     * Determines if this deck is empty.
     * 
     * @return true if deck is empty, false otherwise
     */
    public boolean isEmpty()
    {
        return (size() == 0);
    }
  
    /**
     * Returns the number of cards that are currently in the deck.
     * 
     * @return number of cards in the deck
     */
    public int size()
    {
        return cards.size();
    }
}
