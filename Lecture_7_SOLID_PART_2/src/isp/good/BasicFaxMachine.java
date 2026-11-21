package isp.good;

public class BasicFaxMachine implements Faxable{
    @Override
    public void fax(String document) {
        System.out.println("Document faxes"+document);
    }
}
