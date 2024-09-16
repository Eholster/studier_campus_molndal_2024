package se.dsve.bank;

public class Customer {
    // Create two private fields: name and socialSecurityNumber
    private String name;
    private String socialSecurityNumber;

    public Customer(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}


