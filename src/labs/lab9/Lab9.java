package labs.lab9;

public class Lab9 {

    public static void main(String[] args) {
        int [][] addTo10Input = {
                {  6,  3,  2,  0,  4},
                { 34, 53,  0, 23,  1},
                {  0, 23, 54, 11,  7}
        };

        double [][] findAvgInput = {
                {  5, 4.5,  6.8},
                {  6,  0,  3.4},
                { 7,  8.4,  2.3}
        };

        double [][] findAvgInputLarge = {
                { 6.7,  23.8,  0,  5.9,  12.8,  45.7},
                {  0,  36.8,  13.5,  6.7,  54.9,  67.4},
                {  37.4,  2.5,  39.8,  0,  2.4,  43.6},
                {  44.6,  76.5,  4.5, 2.4,  0, 54.6},
                {  5.4,  76.3,  6.5, 28.5,  54.7,  0},
                {  19.4,  0,  5.3,  65.4,  93.5,  3.5}
        };

        addTo10 (addTo10Input);
        System.out.println();
        findAverage (findAvgInput);
        System.out.println();
        findAverage (findAvgInputLarge);
        }

    public static void addTo10 (int [][] array) {
        int totalRow = 0;
        int whereColumn = 0;
        int whereRow = 0;
        int newNumber = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
               if(array[i][j] == 0){
                   whereRow = i;
                   whereColumn = j;
                   for(int g = 0;g < array[i].length; g++){
                       totalRow += array[i][g];
                   }
//                   newNumber = 10 - totalRow;
//                   array[whereRow][whereColumn] = newNumber;
//                   System.out.println(array[i][j]);
               }
            }
            newNumber = 10 - totalRow;
            array[whereRow][whereColumn] = newNumber;
            //System.out.println(array[i][j]);
            //System.out.println(newNumber);
            //System.out.println(totalRow);
            totalRow = 0;
        }
    }

    public static void findAverage (double [][] array) {
        double totalRow = 0;
        double totalColumn = 0;
        double columnAverage = 0;
        double rowAverage = 0;
        int whereRow = 0;
        int whereColumn = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == 0){
                    whereRow = i;
                    whereColumn = j;
                    for(int r = 0; r < array[i].length; r++){
                        totalRow += array[i][r];
                    }
                    for(int c = 0; c < array.length; c++){
                        totalColumn += array[c][j];
                    }
                    rowAverage = totalRow / array[i].length;
                    columnAverage = totalColumn / array.length;
                    if (totalRow > totalColumn){
                        array[whereRow][whereColumn] = rowAverage;
                        System.out.println(totalRow);
                    }
                    else{
                        array[whereRow][whereColumn] = columnAverage;
                        System.out.println(totalColumn);
                    }
                    totalColumn = 0;
                    totalRow = 0;
                }

            }
        }

    }
}


