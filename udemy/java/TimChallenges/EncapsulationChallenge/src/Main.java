public class Main {
    public static void main(String[] args) {
        Printer laserPrinter = new Printer(50, true);

        if (laserPrinter.getHasDuplex()){
            laserPrinter.duplexPrint(5);
        }
        System.out.println(laserPrinter.getPagesPrinted() + " Pages printed");
        System.out.println(laserPrinter.getTonerLever() + " Remaining toner");

        laserPrinter.printQue(20);

        System.out.println(laserPrinter.getPagesPrinted() + " Pages printed");
        System.out.println(laserPrinter.getTonerLever() + " Remaining toner");

        laserPrinter.refillToner(10);
        System.out.println(laserPrinter.getTonerLever() +" amount of toner");

        laserPrinter.refillToner(100);
        System.out.println(laserPrinter.getTonerLever() + " amount of toner");

    }
}
