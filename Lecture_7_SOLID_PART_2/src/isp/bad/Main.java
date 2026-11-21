package isp.bad;

public class Main {
    public static void main(String[] args) {
        OfficeMachine officeMachine= new PrintingMachine();

        ClientPrintService service= new ClientPrintService(officeMachine);
        service.printDocument("Hi This is Harshdeep Singh Saini");
    }
}
