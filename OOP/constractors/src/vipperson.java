public class vipperson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public vipperson() {
        this("Default name", 50000.00, "default@email.com");
    }
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }



    public vipperson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
}
