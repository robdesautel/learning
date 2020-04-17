public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 0) {
            return -1;
        } else if(number == 2 || number == 3){
            return number;
        }

        while (number % 2 == 0)
        {
            number /= 2;
            if (number == 2){
                return number;
            }
        }

        for (int i = 3; i <= Math.sqrt(number); i+= 2)
        {
            while (number%i == 0)
            {
                number /= i;
            }
        }

        if (number > 2) {
            return number;
        }
        return -1;
    }
}