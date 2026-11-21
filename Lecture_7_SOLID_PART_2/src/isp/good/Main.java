package isp.good;

public class Main {
    public static void main(String[] args) {
        BasicPrinter printer= new BasicPrinter();

        ClientPrintingService service= new ClientPrintingService(printer);

        service.print("INV-2026");
    }
}
