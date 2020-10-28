
import java.util.Scanner;

//        Write a program that does the following:
//        Asks the user for 5 numbers
//        Stores them in an array list
//        Finds the sum, product, largest, and smallest of those numbers

public class SolutionTask1 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Setting of array size
        int arraySize = 5;
        // Creating array
        int[] array = new int[arraySize];
        int sumResult = 0;
        int productResult = 1;

        System.out.println("Enter 5 numbers:");
        // Saving numbers in to array
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        // Calling getSumOfNumbers() method
        int sumNumber = getSumOfNumbers(array, sumResult);
        System.out.println("Sum value is: " + sumNumber);

        // Calling getProductOfNumbers() method
        int productNumber = getProductOfNumbers(array, productResult);
        System.out.println("Product value is: " + productNumber);

        // Calling getMaxNumber() method
        int maxNumber = getMaxNumber(array);
        System.out.println("Maximum value is: " + maxNumber);

        // Calling getMinNumber() method
        int minNumber = getMinNumber(array);
        System.out.println("Minimum value is: " + minNumber);

    }

    public static int getSumOfNumbers(int[] inputArray, int sumResult) {
        int minValue = inputArray[0];
        for (int num : inputArray) {
            sumResult = sumResult + num;
        }
        return sumResult;
    }

    public static int getProductOfNumbers(int[] inputArray, int productResult) {
        int productValue = inputArray[0];
        for (int num : inputArray) {
            productResult = productResult * num;
        }
        return productResult;
    }

    public static int getMaxNumber(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMinNumber(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}



