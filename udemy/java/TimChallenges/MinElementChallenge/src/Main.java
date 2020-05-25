import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers to loop.");
        System.out.println(findMin(readIntegers(scanner.nextInt())));

    }

    private static int[] readIntegers(int count){
        System.out.println("Enter " + count + " numbers");
        int[] numberArray = new int[count];
        scanner = new Scanner(System.in);
        int i = 0;
        do{
            numberArray[i] = scanner.nextInt();
            i++;
            count--;
        }while (count > 0);
        return numberArray;
    }

    private static int findMin(int[] numberArray){
        int lowestInt = numberArray[0];
        for (int temp : numberArray) {
            if (temp < lowestInt) {
                lowestInt = temp;
            }
        }
        return lowestInt;
    }
}
