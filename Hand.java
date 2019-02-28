import java.io.*; 
import java.util.*;

public class Hand{

    //fields - cards, point value, bet
    List <Card> currentCards;
    int pointValue;
    double bet;

    public Hand()
    {
        currentCards = new ArrayList<Card>();
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

    public int calculateHandScore(List <Card> userCards)
    {
        return 0;
    }

    public void addCards(List <Card> userCards)
    {

    }

    public void revealCards(List <Card> userCards)
    {

    }

};
