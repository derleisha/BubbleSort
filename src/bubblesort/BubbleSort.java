package bubblesort;

import java.util.Scanner;

public class BubbleSort {

    static void printArray(int[] numbers) {

        int length = numbers.length;
        for (int i = 0; i < length; i++) {
            System.out.print(" " + numbers[i]);

        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" how many number you want to sort? : ");
        int number = input.nextInt();

        int[] inputNumbers = new int[number];
        System.out.println("enter the " + number + " numbers: ");

        for (int i = 0; i < number; i++) {
            inputNumbers[i] = input.nextInt();
        }
        System.out.print("numbers to be sorted: ");
        printArray(inputNumbers);

        boolean sorted = false;
        while (sorted == false) {
            sorted = true;

            for (int i = 0; i < inputNumbers.length - 1; i++) {
                if (inputNumbers[i] > inputNumbers[i + 1]) {

                    int numberSwapped = inputNumbers[i + 1];
                    inputNumbers[i + 1] = inputNumbers[i];
                    inputNumbers[i] = numberSwapped;
                    sorted = false;
                }
           
            }
        }
        for (int i = 0; i < inputNumbers.length; i++) {
            System.out.println(inputNumbers[i]);

        }

    }

}



