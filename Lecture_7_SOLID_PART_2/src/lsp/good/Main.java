package lsp.good;


public class Main {
    public static void main(String[] args) {


        // GOOD DESIGN
        WithrawableAccount account=new SavingAccount(1000);

        BillPaymentService billPaymentService = new BillPaymentService();

        billPaymentService.payBill(account,500);
    }
}