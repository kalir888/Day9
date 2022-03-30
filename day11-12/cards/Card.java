package cards;

public class Card {
    public enum Suit {Clubs,Diamonds,Hearts,Spades}
    public enum Rank {Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King,Ash}
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return suit + "-" + rank;
    }
}
