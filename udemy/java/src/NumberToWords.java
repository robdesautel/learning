public class NumberToWords {
    public static void numberToWords(int number){

        if(number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int numOfDigits = getDigitCount(number);

        if(numOfDigits < 0){
            System.out.println("Invalid Value");
            return;
        }

        int numberReversed = reverse(number);
        int singleDigit = 0;

        while(numOfDigits > 0){

            if ((number < 10) && (numOfDigits > 1)){
                System.out.println("Zero");
                numOfDigits--;
                continue;

            } else if (number > 9){
                singleDigit = numberReversed % 10;
                numberReversed /= 10;

            }  else {
                singleDigit = numberReversed;
            }

            switch (singleDigit){
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

            numOfDigits--;
        }
    }

    public static int reverse (int number){
        int numberReversed = 0;

        while(true){
            numberReversed += number % 10;

            if(number / 10 != 0){
                numberReversed *= 10;
                number /= 10;
            }else {
                break;
            }

        }

        return numberReversed;
    }

    public static int getDigitCount(int number){

        if (number < 0){
            return -1;
        }

        int totalNumberOFDigits = 0;

        if (number == 0){
            totalNumberOFDigits++;
        }

        while(number > 0){
            totalNumberOFDigits++;
            number /= 10;
        }

        return totalNumberOFDigits;
    }
}
