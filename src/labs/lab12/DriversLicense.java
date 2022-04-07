package labs.lab12;

public class DriversLicense extends IDCard{
    private int expirationYear;
    private Month expirationMonth;

    public DriversLicense() {
        super();
        expirationYear = 1969;
        expirationMonth = Month.JANUARY;
    }
    public DriversLicense(String aName,int aIdNumber, int aExpirationYear, Month aExpirationMonth){
        super(aName, aIdNumber);
        expirationMonth = aExpirationMonth;
        expirationYear = aExpirationYear;
    }

    @Override
    public String toString() {
        return super.toString() + " Expiration Month & Year: " + expirationMonth + " " +  expirationYear;
    }
}
