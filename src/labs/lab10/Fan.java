package labs.lab10;

public class Fan {

    public final static int SLOW = 1;
    public final static int MEDIUM = 2;
    public final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this(SLOW, false, 5, "blue");
    }
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(int speed, boolean on, double radius, String color){
        if (on){
            return ("fan is " + speed + ", " + color + ", and the size " + radius);
        }
        else{
            return "fan is off";
        }
    }
}
