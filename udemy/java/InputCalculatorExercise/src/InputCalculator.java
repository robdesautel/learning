import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0L;
        int counter = 0;
        float avgrslt = 0.0F;

        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            sum += number;
            counter++;
        }
        avgrslt = (float) sum / counter;
        average = Math.round(avgrslt);
        System.out.println("SUM = "+ sum + " AVG = " + average);
        scanner.close();
    }
}
