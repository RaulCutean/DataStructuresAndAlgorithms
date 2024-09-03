
public class BankApp {

    public static void main(String[] args){



        BankAccount b = new BankAccount(100.00);
        System.out.println("Before transaction");
        b.printBalance();

        System.out.println("After transaction:");

        b.deposit(74.35);
        b.withdraw(20.00);

        b.printBalance();


    }


}

