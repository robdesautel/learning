public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(25, 30);
        Carpet carpet = new Carpet(0.80);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
    }
}
