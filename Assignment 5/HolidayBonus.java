/* 

 * Class: CMSC203  

 * Instructor: 

 * Description: The HolidayBonus class is responsible for calculating the holiday bonuses for retail store employees based on their sales performance in various categories. The class provides two public static methods: calculateHolidayBonus and calculateTotalHolidayBonus.

 * Due: 04/17/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Kyle Newby__________ 

*/
public class HolidayBonus {

    private static final double HIGHEST_BONUS = 5000.0;
    private static final double LOWEST_BONUS = 1000.0;
    private static final double OTHER_BONUS = 2000.0;

    public HolidayBonus() {
    }

    public static double[] calculateHolidayBonus(double[][] data) {
        double[] bonuses = new double[data.length];
        int maxColumns = 0;

        for (double[] row : data) {
            maxColumns = Math.max(maxColumns, row.length);
        }

        for (int col = 0; col < maxColumns; col++) {
            int highestIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, col);
            int lowestIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, col);

            if (highestIndex == lowestIndex) {
                if (data[highestIndex][col] > 0) {
                    bonuses[highestIndex] += HIGHEST_BONUS;
                }
            } else {
                if (data[highestIndex][col] > 0) {
                    bonuses[highestIndex] += HIGHEST_BONUS;
                }
                if (data[lowestIndex][col] > 0) {
                    bonuses[lowestIndex] += LOWEST_BONUS;
                }

                for (int row = 0; row < data.length; row++) {
                    if (data[row].length > col && row != highestIndex && row != lowestIndex && data[row][col] > 0) {
                        bonuses[row] += OTHER_BONUS;
                    }
                }
            }
        }
        return bonuses;
    }

    public static double calculateTotalHolidayBonus(double[][] data) {
        double totalHolidayBonus = 0;
        double[] bonuses = calculateHolidayBonus(data);
        for (double bonus : bonuses) {
            totalHolidayBonus += bonus;
        }
        return totalHolidayBonus;
    }
}






