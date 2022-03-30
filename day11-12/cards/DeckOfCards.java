package cards;

import java.util.ArrayList;
import java.util.List;

import static cards.Card.Rank.*;
import static cards.Card.Suit.*;

public class DeckOfCards {
    public static void main(String args[]) {
        int cardsToDistribute = 36;
        int flag = 1;
        Card.Suit[] suit = {Clubs,Diamonds,Hearts,Spades};
        Card.Rank[] rank = {Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King,Ash};
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        List<Card> player4 = new ArrayList<>();
        List<Card> distributedCards = new ArrayList<>();

        while(cardsToDistribute != 0) {
            int randomSuit = (int) (Math.round(Math.random()*10))%4;
            int randomRank = (int) (Math.round(Math.random()*10))%13;
            Card card = new Card(suit[randomSuit],rank[randomRank]);
            boolean cardCheck = distributedCards.contains(card);
            if(cardCheck == false) {
                distributedCards.add(card);
                cardsToDistribute--;
                switch (flag) {
                    case 1:
                        player1.add(card);
                        flag = 2;
                        break;
                    case 2:
                        player2.add(card);
                        flag = 3;
                        break;
                    case 3:
                        player3.add(card);
                        flag = 4;
                        break;
                    case 4:
                        player4.add(card);
                        flag = 1;
                        break;
                }
            }
        }
        System.out.println("player1 cards are " + player1);
        System.out.println("player2 cards are " + player2);
        System.out.println("player3 cards are " + player3);
        System.out.println("player4 cards are " + player4);
    }
}
