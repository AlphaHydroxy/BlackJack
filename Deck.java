package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 30/06/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        populate();
    }

    public void populate() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));//rank and suit in this order, they are in this order in Card class.
            }
        }
    }

    public Card getCard() {
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }


}

