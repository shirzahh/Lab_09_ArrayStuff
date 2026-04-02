import java.util.Random;
import java.util.Scanner;

public class ArrayStuff {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];

        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a value between 1 and 100 to count the array: ");
        int userValue = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }
        System.out.println("Your value " + userValue + " was found " + count + " time(s) in the dataPoint array!");

       System.out.print("Enter a value between 1 and 100 to find the find its first position in the dataPoints array: ");
        int userValueFind = scanner.nextInt();
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValueFind) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("Your value " + userValueFind + " was found at array index " + position);
        } else {
            System.out.println("Your value " + userValueFind + " was not found in the array.");
        }


        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The min value in the array is: " + min);
        System.out.println("The max value in the array is: " + max);

        System.out.println("The average of the dataPoints is: " + getAverage(dataPoints));

        scanner.close();

    }
    public static double getAverage(int values[])
    {
        if (values.length == 0)
        {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return (double) sum / values.length;
    }
}