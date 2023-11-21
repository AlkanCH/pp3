public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountName;
    private String accountOwner;
    private boolean isActive;

    public void withdraw(double value) {
        balance-=value;
    }
    public void deposit(double value) {
        balance+=value;
    }
    public double getBalance() {
        return balance;
    }
    public void transfer(String num, double value) {
        balance-=value;
    }
    public void deactivate() {
        isActive=false;
    }

    

    public BankAccount(String accountNumber, double balance, String accountName, String accountOwner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountName = accountName;
        this.accountOwner = accountOwner;
        this.isActive = true;
    }
    public BankAccount(String accountNumber, String accountName, String accountOwner) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.accountName = accountName;
        this.accountOwner = accountOwner;
        this.isActive = true;
    }
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount("00000000000000000000000001","Oszczednosciowe","Jan Zamoysky");
        B1.deposit(500);
        System.out.println(B1.getBalance());
        B1.deposit(200);
        System.out.println(B1.getBalance());
        B1.withdraw(300);
        System.out.println(B1.getBalance());
    }
}