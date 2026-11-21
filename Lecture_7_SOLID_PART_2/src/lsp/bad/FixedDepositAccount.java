package lsp.bad;

public class FixedDepositAccount extends Account{

    public FixedDepositAccount(double balance){
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount<=0 ){
            throw new UnsupportedOperationException("Invalid Deposit amount");
        }
        balance+=amount;

        System.out.println("Deposit successfull "+amount);
    }

    @Override
    public void withdraw(double amount) {
    throw new UnsupportedOperationException("Withdrawl is not allowed before maturity");
    }


}
