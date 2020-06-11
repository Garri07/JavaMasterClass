public class BankAccount {
    private int accountNumber;
    private int balance;
    private String name;
    private String email;
    private int phoneNumber;


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
