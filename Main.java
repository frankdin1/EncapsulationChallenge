public class Main {
    public static void main(String[] args){
        Printer printer = new Printer(40, false);
        System.out.println(printer.addToner(70));
        System.out.println(printer.addToner(50));
        System.out.println(printer.addToner(-91));

        System.out.println(printer.printPages(7));
    }
}
