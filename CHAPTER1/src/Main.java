

class BankAccount {

    private double _balance;



    public BankAccount(double openingBalance) {
        _balance = openingBalance;
    }

    public void deposit(double amount) {
        _balance = _balance + amount;
    }

    public void withdraw(double amount) {
        _balance = _balance - amount;
    }
    public void printBalance(){
        System.out.println("balance=" + _balance);
    }


}