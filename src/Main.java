import java.util.Scanner;
import java.util.Random;



public class Main {
    public static void main(String[] args) {

        // Task 1
        int[] dataPoints = new int[100];

        // Task 2
        Random random = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Task 3
        for (int i = 0; i < dataPoints.length; i++) {
            if (i == dataPoints.length - 1) {
                System.out.print(dataPoints[i]);
            } else {
                System.out.print(dataPoints[i] + " | ");
            }
        }

        System.out.println();

        // Task 4
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        // Output the sum and average with descriptive text
        System.out.println("The sum of the values in the dataPoints array is: " + sum);
        System.out.println("The average of the values in the dataPoints array is: " + average);

        // Task 5
        Scanner scn = new Scanner(System.in);
        int userValue = SafeInput.getRangedInt(scn, "Enter a number", 1, 100);
        System.out.println("You entered: " + userValue);

        // Task 6
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("The value " + userValue + " is found " + count + " times in the dataPoints array.");

        // Task 7
        int userValue2 = SafeInput.getRangedInt(scn, "Enter a value between ", 1, 100);
        System.out.println("You entered: " + userValue2);

        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                System.out.println("The value " + userValue2 + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value  " + userValue2 + " was not found in the array.");
        }

        // Task 8
        int minValue = dataPoints[0];
        int maxValue = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < minValue) {
                minValue = dataPoints[i];
            }
            if (dataPoints[i] > maxValue) {
                maxValue = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the dataPoints array is: " + minValue);
        System.out.println("The maximum value in the dataPoints array is: " + maxValue);

        // Task 9 calling in main
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));


    }

    // Task 9
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }


}