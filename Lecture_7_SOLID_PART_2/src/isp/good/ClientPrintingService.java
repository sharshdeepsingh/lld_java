package isp.good;



public class ClientPrintingService {

    private final BasicPrinter printer;

    public ClientPrintingService(BasicPrinter printer){
        this.printer=printer;
    }

    public void print(String document){
        printer.print(document);
    }
}
