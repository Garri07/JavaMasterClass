public class BankAccount {

    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;

    //how to create a constructor
    public BankAccount() {
        //this is an empty constructor
    }

    public BankAccount(String name, int accountNumber, String email, int phoneNumber){
        //this is a constructor with the parameters name, accountNumber, email, and phoneNumber
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (int amount) {
        this.balance += amount;
        System.out.println("You have desposited " + amount + ". Your new balance is " + this.balance);
    }

    public void withdraw (int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("You have withdrawn " + amount + ". Your new balance is " + this.balance);
        } else {
            System.out.println("Not enough in your account.");
        }
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
