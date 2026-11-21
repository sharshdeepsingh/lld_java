package isp.good;

public class MultipurposePrinter implements Faxable,Scanable,Printable{
    @Override
    public void fax(String document) {
        System.out.println("Document Printed"+document);

    }

    @Override
    public void print(String document) {

            System.out.println("Document Printed"+document);

    }

    @Override
    public void scan() {
        System.out.println("Scanning Done");

    }
}
