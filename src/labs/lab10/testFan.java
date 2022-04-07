package labs.lab10;

public class testFan {
    public static void main(String[]args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        System.out.println(fan1.toString(3,true, 10, "yellow"));
        System.out.println(fan2.toString(2, false, 20, "blue"));

    }

}
