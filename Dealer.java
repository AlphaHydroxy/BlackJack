package com.example.user.blackjack;

/**
 * Created by user on 30/06/2017.
 */

public class Dealer {
    Deck deck;
    Hand hand;

    public Dealer(Deck newDeck){
        this.deck = newDeck;
        this.hand = new Hand();
        shuffle(); // method from Deck
    }

    public void shuffle(){
        this.deck.shuffle();
    }

    public Card deal(){
        return deck.getCard(); //method from Deck
    }

    public void addCardToHand(Card card){
        hand.addCard(card);
    }

    public Card showFirstCard(){
        return hand.showFirstCard();
    }

    public Hand showHand(){
        return hand;
    }

}
