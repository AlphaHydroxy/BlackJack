package com.example.user.blackjack;

/**
 * Created by user on 30/06/2017.
 */

public class Player {

    Hand hand;

    public Player(){
        hand = new Hand();
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public Hand showHand(){
        return this.hand;
    }
}
