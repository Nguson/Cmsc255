package labs.lab12;

public class Card {
    private String name;

    public Card(){
        name = "";
    }

    public Card(String aname) {
        name = aname;
    }

    @Override
    public String toString() {
        return "Card Holder: " + name;
    }

}

