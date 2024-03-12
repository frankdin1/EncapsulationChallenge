public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        if (tonerLevel < 0 || tonerLevel > 100)
            this.tonerLevel = -1;
        else this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
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
