import java.io.*; 
import java.util.*;

public class Hand{

    //fields - cards, point value, bet
    List <Card> currentCards = new ArrayList<Card>();
    int pointValue;
    double bet;

    public Hand()
    {
        Card randomCard1 = new Card();
        Card randomCard2 = new Card();

        currentCards.add(randomCard1); //Add the first card
        currentCards.add(randomCard2); //Add the second card
        pointValue = 0;
        bet = 100;
    }

    public Hand(List<Card> cards, int pointValue, double bet)
    {
        this.currentCards = cards;
        this.pointValue = pointValue;
        this.bet = bet;
    }

    //Getters
    public List<Card> getCurrentCards()
    {
        return this.currentCards;
    }

    // I believe this getter below will satisfy the "get num of points" action method.
    public int getPointValue() 
    {
        return this.pointValue;
    }

    public double getBet()
    {
        return this.bet;
    }

    // Setters
    public void setCurrentCards(List<Card> currentCards)
    {
        this.currentCards = currentCards;
    }

    public void setPointValue(int pointValue)
    {
        this.pointValue = pointValue;
    }

    public void setBet(double bet)
    {
        this.bet = bet;
    }

    public void addCards()
    {

    }

    public void revealCards()
    {

    }

};
