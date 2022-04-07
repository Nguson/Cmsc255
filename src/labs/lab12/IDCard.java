package labs.lab12;

public class IDCard extends Card{
    private int idNumber;

    public IDCard() {
        super("Jane Smith");
        idNumber = 0;
    }
    public IDCard(String aName, int aIdNumber){
        super(aName);
        idNumber = aIdNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " ID Number: " + idNumber;
    }
}
