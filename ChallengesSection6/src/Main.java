public class Main {
    public static void main(String[] args) {
        //Some comment for the Git MasterClass on Udemy
        //Comment added from GitHub
        //Another comment added on GitHub after setting up tracking

        //BankAccount Challenge
        BankAccount myAccount = new BankAccount();

        myAccount.setAccountNumber(12345678);
        myAccount.setName("Alexandra");
        myAccount.setBalance(100);

        System.out.println(myAccount.getName());
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());

        myAccount.deposit(100);
        myAccount.withdraw(50);
        //total amount at this point should be 150

        myAccount.withdraw(200);
        //shouldn't work

        System.out.println(myAccount.getBalance());
        //should be 150
    }
}
