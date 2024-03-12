public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (this.tonerLevel + tonerAmount > 100 || this.tonerLevel + tonerAmount < 0) {
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
        }
        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint){
        int sheetsOfPaper;
        if (!this.duplex)
            sheetsOfPaper = pagesToPrint;
        else{
            sheetsOfPaper = (int)Math.ceil((double)pagesToPrint / 2);
            System.out.println("Duplex printer.");
        }
        this.pagesPrinted += sheetsOfPaper;
        return this.pagesPrinted;
    }
}
