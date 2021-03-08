package testexcept;

public class Account {
    private String name;
    private double balance;

    public Account(String name) {
        this.name = name;
        this.balance = 100.0;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double money){
        balance += money;
        return balance;
    }
    public double withdraw(double money) throws OverdraftException{
        System.out.printf("之前余额为%.2f\n",balance);
        balance -= money;
        if (balance < 0)
            throw new OverdraftException(name,balance);
        return balance;
    }
    public static void main(String args[]){
        Account account = new Account("老八");
        try{
            for(int i = 0; i < 10; i++){
                account.withdraw(20.5);
            }
        } catch (OverdraftException e){
            account.deposit(500.0);
        }
    }
}
