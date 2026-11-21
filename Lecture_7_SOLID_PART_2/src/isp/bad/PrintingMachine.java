package isp.bad;

public class PrintingMachine implements OfficeMachine{
    @Override
    public void print(String document) {
        System.out.println("Printing the document "+ document);
    }

    @Override
    public void scan() {
throw new UnsupportedOperationException("Scanning not allowed");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Faxing not allowed");

    }
}
