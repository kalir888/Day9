package cards;

import java.util.ArrayList;
import java.util.List;

import static cards.Card.Rank.*;
import static cards.Card.Suit.*;

public class Check {
    public static void main(String args[]) {

        Card card = new Card(Clubs,Nine);
        Card card2 = new Card(Clubs,Nine);
        System.out.println(card);
        System.out.println(card2);
        List<Card> cards = new ArrayList<>();
        System.out.println(card.equals(card2));
    }
}
