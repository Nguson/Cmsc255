package labs.lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab13 {
    //Main method, has creation of input and output, and calls method
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File(args[0]);
        File output = new File(args[0]);
        processFile(input, output);
    }
    //Method processFile
    public static void processFile(File inputFile, File outputFile) {
    //First try block
        try {
            String high = "";
            String low = "";

            Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFile);
            ArrayList<Team> teams = new ArrayList<>();
            while (in.hasNextLine()) {
                String[] array = in.nextLine().split(",");
                teams.add(new Team(array[0],Integer.parseInt(array[1]),Double.parseDouble(array[2])));
            }

            int maxGoals = teams.get(0).getNumGoals();
            for (Team team : teams) {
                if (team.getNumGoals() > maxGoals) {
                    maxGoals = team.getNumGoals();
                    high = team.getName();
                }
            }
            out.println("Maximum goals Scored: " + high + " " + maxGoals);

            int minGoals = teams.get(0).getNumGoals();
            for (Team team : teams) {
                if (team.getNumGoals() < minGoals) {
                    minGoals = team.getNumGoals();
                    low = team.getName();
                }
            }
            out.println("Minimum goals Scored: " + low + " " + minGoals);

            double avg;
            double total = 0;
            for (Team team : teams) {
                total += team.getNumShots();
            }
            avg = total / teams.size();
            out.printf("Average shots per game: %.3f", avg);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
