/**
 * A Card is a playing card from an Anglo-American deck of cards.
 * 
 * @author Lynn Marshall
 * @version 1.1 October 11, 2012
 * 
 * @author Ahmed Ali (101181126).
 * @version February 27th, 2022.
 */
public class Card
{
    /** The card's suit: "hearts", "diamonds", "clubs", "spades". */
    private String suit;
    
    /** 
     * The card's rank, between 1 and 13 (1 represents the ace, 11 represents
     * the jack, 12 represents the queen, and 13 represents the king.)
     */
    private int rank;

    /**
     * Constructs a new card with the specified suit and rank.
     */
    public Card(String suit, int rank)
    {
        this.rank = rank;
        this.suit = suit;
    }
    
    /**
     * Returns this card's suit.
     * 
     * @return this card's suit
     */
    public String suit()
    {
        return suit;
    }
    
    /**
     * Returns this card's rank.
     * 
     * @return this card's rank
     */
    public int rank()
    {
        return rank;
    }
    
    /**
     * Determines if this card has the same rank as the specified card.
     * 
     * @param a specific card which will be compared with this card
     * @return true if they have the same rank, false otherwise
     */
    public boolean hasSameRank(Card aCard)
    {
        return rank == aCard.rank();
    }
    
    /**
     * Determines if this card is equal to the specified card.
     *
     * @param a specific card which will be compared with this card
     * @return true if they have they are equal, false otherwise
     */
    public boolean isEqualTo(Card aCard)
    {
        return (hasSameRank(aCard) && suit.equals(aCard.suit()));
    }
}
