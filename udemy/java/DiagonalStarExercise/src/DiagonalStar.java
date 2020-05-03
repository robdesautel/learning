public class DiagonalStar {

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");;
        }
        int row = 1;
        int column = 1;
        int currentRow = 0;
        for (int i = number; i > 0; i--){ //Initialize loop
            currentRow++;
            if (currentRow == 1 || currentRow == number){
                for (int j = 0; j < number; j++){
                    System.out.print("*");
                }
                System.out.println();
            }else {
                System.out.println("stars");
            }

        }
    }
}
