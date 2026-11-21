package lsp.good;

public class FixedDepositAccount implements BankAccount{

    protected double balance;
    public FixedDepositAccount(double balance){
        this.balance=balance;
    }


    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
if(amount<=0 ){
    throw new UnsupportedOperationException("Amount is invalid");
}
balance+=amount;
        System.out.println("Amount Deposited"+amount);
    }
}
