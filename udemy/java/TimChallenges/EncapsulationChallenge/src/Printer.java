public class Printer {
    private int tonerLever = 200;
    private int pagesPrinted;
    private boolean hasDuplex;

    public Printer(int tonerLever, boolean hasDuplex) {

        if(tonerLever > 0 ) {
            this.tonerLever = tonerLever;
        }
        this.hasDuplex = hasDuplex ;
    }

    private void pagePrinted(int page){
        System.out.println("Printing pages " + (int)page);
        if(page > 0 && this.tonerLever > 0){
            pagesPrinted += page;
        }
    }

    private void pagePrinted(double page){
        System.out.println("Printing pages " + (int)page);
        if(page > 0 && this.tonerLever > 0){
            pagesPrinted += page;
        }
    }

    private void printQue (double pages){
        System.out.println((int)pages + " pages in print que");
        if((int)pages < tonerLever){
            pagePrinted(pages);
            this.tonerLever -= pages;
        }else if ((int)pages == tonerLever){
            System.out.println("Toner may be getting low.");
        } else{
            System.out.println("Toner level is low, replace toner. Toner level " + tonerLever);
        }
    }

    public void printQue (int pages){
        if(pages < tonerLever){
            pagePrinted(pages);
            this.tonerLever -= pages;
        }
    }

    public void duplexPrint(int pages){
        double duplexPage = (double)pages / 2;
        printQue(Math.round(duplexPage));
    }

    public void refillToner(int addedToner){
        if((addedToner + tonerLever) <= 100){
            tonerLever += addedToner;
            System.out.println("Toner successfully refilled. Current level: " + tonerLever);
        }else{
            int tonerNeeded = addedToner - tonerLever;
            tonerLever += tonerNeeded;
            int remainingToner = addedToner - tonerNeeded;

            System.out.println("Toner refilled with remaining toner. Remaining toner: " + remainingToner);
        }

    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

    public int getTonerLever() {
        return tonerLever;
    }

    public boolean getHasDuplex(){
        return this.hasDuplex;
    }
}
