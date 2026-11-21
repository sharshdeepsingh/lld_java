package lsp.bad;
import lsp.bad.BillPaymentService;

import lsp.good.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Bad Design
        Account account= new FixedDepositAccount(1000);

        BillPaymentService billPaymentService= new BillPaymentService();

        billPaymentService.payBill(account,500);

    }
}