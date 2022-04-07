package labs.lab12;

public class DebitCard extends Card{
    private int cardNumber;
    private int pin;

    public DebitCard() {
        super("Jane Doe");
        cardNumber = 00000000;
        pin = 0;
    }
    public DebitCard(String aName, int aCardNumber, int aPin){
        super(aName);
        cardNumber = aCardNumber;
        pin = aPin;
    }

    @Override
    public String toString() {
        return super.toString() + " Card Number: " + cardNumber;
    }
}
