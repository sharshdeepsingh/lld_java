package isp.bad;

public class ClientPrintService {

    private final OfficeMachine machine;

    public ClientPrintService(OfficeMachine machine){
        this.machine=machine;
    }

    public void printDocument(String document){
        machine.fax(document);
        machine.print(document);
        machine.scan();
    }
}
