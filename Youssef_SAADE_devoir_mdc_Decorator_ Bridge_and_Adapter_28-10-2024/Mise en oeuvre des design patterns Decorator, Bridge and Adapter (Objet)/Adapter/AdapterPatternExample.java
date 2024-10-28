public class AdapterPatternExample {
    public static void main(String[] args) {
        Printer adapter = new PrintAdapter(new LegacyPrinter());
        adapter.print("Hello World");
    }
}