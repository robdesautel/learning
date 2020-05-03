public class DiagonalStar {

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }
        int currentRow = 0;
        for (int i = number; i > 0; i--){
            currentRow++;
            if (currentRow == 1){
                for (int j = 0; j < number; j++){
                    System.out.print("*");
                }
            }else if (currentRow > 1 && currentRow < number) {
                System.out.println();
                int column = 1;
                for(int j = 0; j < number; j++){
                    if(column == 1 ||
                       column == currentRow ||
                       column == number ||
                       column == (number - currentRow + 1)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    column++;
                }
            }
        }
        if(currentRow == number){
            System.out.println();
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
        }
    }
}
