package lsp.good;

public class SavingAccount implements WithrawableAccount{

    protected double balance;

    public SavingAccount(double balance){
        this.balance=balance;
    }
    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
    if(amount <= 0){
        throw new UnsupportedOperationException("Amount Entered is Invalid");
    }
    balance +=amount;
        System.out.println("Amount Deposited" + amount);

    }


    @Override
    public void withdraw(double amount) {
        if(amount<=0 || amount >balance){
            throw new UnsupportedOperationException("Amount is greater than balance");
        }

        balance-=amount;
        System.out.println("Amount withdrawn"+amount);
    }
}
