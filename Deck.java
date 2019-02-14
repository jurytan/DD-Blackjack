public class Deck
{
 enum Numberofcards {
     1,2,3,.....54;
 }
enum NumberOfdecks
{
1,2;
}
    //  Fields//
    int shuffle;
    int draw;
    int cut;
    int add;
    //Constructor
    public Deck(int shuffle, int draw, int cut, int add) {
        this.shuffle = shuffle;
        this.draw = draw;
        this.cut = cut;
        this.add = add;
    }
//getter/setter



public int getDraw(){

    return this.draw;
}

public int getAdd(){

    return this.add;
}

public void setNumberofdecks{

    this.numberofdecks = numberofdecks;
}


//method 

public void discard(){

    //Discard the card
}

}
