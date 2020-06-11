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

        //instantiating an object with parameters.
        BankAccount otherAccount = new BankAccount("Nelson", 1234567, "nelson@email.com", 03112345);

        System.out.println("\n");

        //VipCustomer Challenge
        VipCustomer me = new VipCustomer(); //calls the empty constructor with default values
        System.out.println(me.getName()); //should be Alexandra
        System.out.println(me.getEmail()); //should be email@email.com
        System.out.println(me.getCreditLimit()); //should be 10000

        System.out.println("\n");

        VipCustomer nelson = new VipCustomer("Nelson", "nelson@email.com");
        System.out.println(nelson.getName()); //should be nelson
        System.out.println(nelson.getEmail()); //should ne nelson@email.com
        System.out.println(nelson.getCreditLimit()); //should be 10000
    }
}
