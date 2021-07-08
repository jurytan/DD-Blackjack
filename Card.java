public class Card {
    // Card card = new Card('A', Suit.SPADES, Color.BLACK, 11);
    
    //custom types
    enum Suit {
        SPADES, HEARTS, DIAMOND, CLUBS;
    } 
    enum Color {
        RED, BLACK;
    }
    
    //fields
    char face;
    Suit suit;
    Color color;
    int value;
    
    public Card(char face, Suit suit, Color color, int value) {
        this.face = face;
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return this.color; 
    }

}


