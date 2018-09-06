// All the cards of one suit always the same
    // GET THE points correct ACE is 11
    // type all cards
    // for loop
public class BlackJackGame {
    public static void main(String[] args){
        Card card = new Card("Clubs", "King", 10);
        card.print();  // given
        String[] values = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King", "Ace"};

        for(int a = 0; a < values.length; a++){
            Card kaart = new Card("Clubs", values[a], a);
            kaart.print();
        }
    }
}
class Card{
    String suit;
    String myValue;
    int points;

    Card(String mySuit, String value, int points) {
        suit = mySuit;     // beginner way
        myValue = value;   // beginner way
        this.points = points;  // not afraid of shadowing
    }

    void print(){
        System.out.println(myValue + " of "+suit + " : "+ getValue() + " points");
    }


}

