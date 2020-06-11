public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Alexandra", "email@email.com", 10_000);
        System.out.println("Empty constructor");
    }

    public VipCustomer(String name, String email){
        this.name = name;
        this.email = email;
        this.creditLimit = 10_000;
        System.out.println("Constructor with 2 parameters");
    }

    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
        System.out.println("Constructor with 3 parameters");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
