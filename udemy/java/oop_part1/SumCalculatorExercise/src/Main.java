public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(8);
        calculator.setSecondNumber(16);
        System.out.println(calculator.getFirstNumber());
        System.out.println(calculator.getSecondNumber());
        System.out.println("Added " + calculator.getFirstNumber() + " & " + calculator.getSecondNumber() + " = " + calculator.getAdditionResult());
        System.out.println("Subtracted " + calculator.getFirstNumber() + " & " + calculator.getSecondNumber() + " = " + calculator.getSubtractionResult());
        System.out.println("Multiplied " + calculator.getFirstNumber() + " & " + calculator.getSecondNumber() + " = " + calculator.getMultiplicationResult());
        System.out.println("Divided " + calculator.getFirstNumber() + " & " + calculator.getSecondNumber() + " = " + calculator.getDivisionResult());
    }
}
