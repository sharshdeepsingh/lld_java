package lsp.good;

public class BillPaymentService {

    public void payBill(WithrawableAccount account,double amount){
        account.withdraw(amount);
        System.out.println("Bill Payment Successfull");
    }
}
