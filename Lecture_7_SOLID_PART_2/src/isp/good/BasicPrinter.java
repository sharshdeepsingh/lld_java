package isp.good;

public class BasicPrinter implements Printable{

    @Override
    public void print(String document) {
        System.out.println("Document Printed"+document);
    }
}
