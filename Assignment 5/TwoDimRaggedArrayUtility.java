/* 

 * Class: CMSC203  

 * Instructor: 

 * Description: The TwoDimRaggedArrayUtility class is a utility class that provides various methods to perform operations on two-dimensional ragged arrays. It is used in conjunction with the HolidayBonusGui class to read, write, and perform calculations on sales data. 

 * Due: 04/17/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby__________ 

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {

    public static double[][] readFile(File file) throws FileNotFoundException {
        ArrayList<ArrayList<Double>> data = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            ArrayList<Double> row = new ArrayList<>();
            Scanner rowScanner = new Scanner(scanner.nextLine());
            while (rowScanner.hasNextDouble()) {
                row.add(rowScanner.nextDouble());
            }
            data.add(row);
            rowScanner.close();
        }
        scanner.close();

        double[][] raggedArray = new double[data.size()][];
        for (int i = 0; i < data.size(); i++) {
            raggedArray[i] = new double[data.get(i).size()];
            for (int j = 0; j < data.get(i).size(); j++) {
                raggedArray[i][j] = data.get(i).get(j);
            }
        }
        return raggedArray;
    }

    public static void writeToFile(double[][] data, File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        for (double[] row : data) {
            for (int j = 0; j < row.length; j++) {
                pw.print(row[j] + (j < row.length - 1 ? " " : ""));
            }
            pw.println();
        }
        pw.close();
    }

    public static double getTotal(double[][] data) {
        double total = 0;
        for (double[] row : data) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] data) {
        double total = getTotal(data);
        int numElements = 0;
        for (double[] row : data) {
            numElements += row.length;
        }
        return total / numElements;
    }

    public static double getRowTotal(double[][] data, int rowIndex) {
        double total = 0;
        for (double value : data[rowIndex]) {
            total += value;
        }
        return total;
    }

    public static double getColumnTotal(double[][] data, int columnIndex) {
        double total = 0;
        for (double[] row : data) {
            if (columnIndex < row.length) {
                total += row[columnIndex];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] data, int rowIndex) {
        double highest = data[rowIndex][0];
        for (double value : data[rowIndex]) {
            highest = Math.max(highest, value);
        }
        return highest;
    }

    public static int getHighestInRowIndex(double[][] data, int rowIndex) {
        int highestIndex = 0;
        for (int j = 0; j < data[rowIndex].length; j++) {
            if (data[rowIndex][j] > data[rowIndex][highestIndex]) {
                highestIndex = j;
            }
        }
        return highestIndex;
    }

    public static double getLowestInRow(double[][] data, int rowIndex) {
        double lowest = data[rowIndex][0];
        for (double value : data[rowIndex]) {
            lowest = Math.min(lowest, value);
        }
        return lowest;
    }

    public static int getLowestInRowIndex(double[][] data, int rowIndex) {
        int lowestIndex = 0;
        for (int j = 0; j < data[rowIndex].length; j++) {
            if (data[rowIndex][j] < data[rowIndex][lowestIndex]) {
                lowestIndex = j;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInColumn(double[][] data, int columnIndex) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            if (columnIndex < row.length) {
                highest = Math.max(highest, row[columnIndex]);
            }
        }
        return highest;
    }

    public static int getHighestInColumnIndex(double[][] data, int columnIndex) {
        int highestIndex = -1;
        double highest = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (columnIndex < data[i].length && data[i][columnIndex] > highest) {
                highest = data[i][columnIndex];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    public static double getLowestInColumn(double[][] data, int columnIndex) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            if (columnIndex < row.length) {
                lowest = Math.min(lowest, row[columnIndex]);
            }
        }
        return lowest;
    }

    public static int getLowestInColumnIndex(double[][] data, int columnIndex) {
        int lowestIndex = -1;
        double lowest = Double.POSITIVE_INFINITY;
        for (int i = 0; i < data.length; i++) {
            if (columnIndex < data[i].length && data[i][columnIndex] < lowest) {
                lowest = data[i][columnIndex];
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static double getHighestInArray(double[][] data) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                highest = Math.max(highest, value);
            }
        }
        return highest;
    }

    public static double getLowestInArray(double[][] data) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double[] row : data) {
            for (double value : row) {
                lowest = Math.min(lowest, value);
            }
        }
        return lowest;
    }
}
     

