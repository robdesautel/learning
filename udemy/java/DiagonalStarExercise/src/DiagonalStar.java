public class DiagonalStar {

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");;
        }
        int row = 1;
        int currentRow = 0;
        for (int i = number; i > 0; i--){ //Initialize loop
            currentRow++;
            if (currentRow == 1 || currentRow == number){
                for (int j = 0; j < number; j++){
                    System.out.print("*");
                }
            }else {
                int column = 1;
                for(int j = 0; j <= number; j++){

                    if(column == 1 ||
                       column == currentRow ||
                       column == number){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    column++;
                }
                System.out.print(row);

            }

            System.out.println();
            row++;
        }
    }
}
