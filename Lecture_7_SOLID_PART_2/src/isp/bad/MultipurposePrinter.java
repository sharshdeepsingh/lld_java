package isp.bad;

public class MultipurposePrinter implements OfficeMachine{
    @Override
    public void print(String document) {
        System.out.println("Printing Completed"+ document);
    }

    @Override
    public void scan() {
        System.out.println("Scanning Completed");
    }

    @Override
    public void fax(String document) {
        System.out.println("Document Faxed"+ document);
    }
}
