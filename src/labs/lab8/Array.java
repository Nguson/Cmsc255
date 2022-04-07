package labs.lab8;

import java.util.Arrays;

public class Array {

    public static void main(String[]args){
        String[] tokens = args[0].split(",");
        String[] customerName = new String[8];
        for (int i = 0; i < tokens.length; i++) {
            customerName[i] = tokens[i];
        }
        displayNames(customerName);
        customerName[4] = "Rick";
        customerName[5] = "Jessica";
        customerName[6] = "Summer";
        customerName[7] = "Morty";
        displayNames(customerName);
        reverseNames(customerName);
        displayNames(customerName);
        int i;
        for (i = 0; i < customerName.length; i++) {
            if (customerName[i].equals("Rick") && customerName[i] != null) {
                customerName[i] = customerName[i + 1];
            }
        }
        customerName[4] = "Beth";
        customerName[6] = null;
        customerName[7] = null;
        customerName[3] = "Jerry";
        customerName[5] = null;
        displayNames(customerName);
        reverseNames(customerName);
    }

    public static void displayNames(String[] names) {
        for (String element: names) {
            System.out.println(element);



        }
        System.out.println("");
    }
        public static String[] reverseNames(String[] names){
        String[] temporary = new String[8];
            temporary[0] = names[0];
            temporary[1] = names[1];
            temporary[2] = names[2];
            temporary[3] = names[3];
            temporary[4] = names[4];
            temporary[5] = names[5];
            temporary[6] = names[6];
            temporary[7] = names[7];
            names[0] = temporary[7];
            names[1] = temporary[6];
            names[2] = temporary[5];
            names[3] = temporary[4];
            names[4] = temporary[3];
            names[5] = temporary[2];
            names[6] = temporary[1];
            names[7] = temporary[0];

            return names;
        }
       /*
       public static String[] reverseNames(String[] names){
            String[] result = new String[names.length];

            for (int i = 0; i < names.length; i++) {
                result[i] = names[i];
                names[i] = result[(names.length - 1) - i];
                names[names.length - 1 - i] = result[i];
            }
            return result;
        }
        */
}







