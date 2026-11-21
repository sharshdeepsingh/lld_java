package lsp.bad;

public class BillPaymentService {

    public void payBill(Account account,double amount){
        account.withdraw(amount);

        System.out.println("Bill Payment Successfull");
    }
}
