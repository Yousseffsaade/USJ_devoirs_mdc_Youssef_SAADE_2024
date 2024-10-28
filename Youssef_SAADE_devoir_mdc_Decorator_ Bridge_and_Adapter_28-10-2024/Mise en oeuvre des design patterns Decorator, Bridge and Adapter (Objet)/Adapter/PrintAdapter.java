class PrintAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public PrintAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String text) {
        legacyPrinter.printLegacy(text);
    }
}