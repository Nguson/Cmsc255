package labs.lab13;

public class Team {
    //instance variables declared
    private String name;
    private int numGoals;
    private double numShots;

    // default constructor
    // sets default values
    public Team() {
        name = "";
        numGoals = 0;
        numShots = 0.0;
    }

    // Parameterized constructor
    public Team(String aName, int aNumGoals, double aNumShots){
        name = aName;
        numGoals = aNumGoals;
        numShots = aNumShots;
    }

    // Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getNumGoals() {
        return numGoals;
    }

    public void setNumGoals(int aNumGoals) {
        numGoals = aNumGoals;
    }

    public double getNumShots() {
        return numShots;
    }

    public void setNumShots(double aNumShots) {
        numShots = aNumShots;
    }
}
