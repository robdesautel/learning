public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int numberReversed = 0;
        int numOfDigits = numberOfDigits(number);
        while(numOfDigits > 0){
            numberReversed += number % 10;
            numberReversed *= 10;
            number /= 10;
            numOfDigits--;
            switch (numberReversed){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }

        }
    }
    public static int reverse (int number){
        return -1;
    }
    public static int numberOfDigits(int number){
        if (number > 0){
            System.out.println("Invalid Number");
        }
        int totalNumberOFDigits = 0;
        while(number > 0){
            totalNumberOFDigits++;
            number /= 10;
        }
        return totalNumberOFDigits;
    }
}
