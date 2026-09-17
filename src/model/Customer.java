package model;

public class Customer {
    private final int idCustomer;
    private final String name;

    public Customer(int idCustomer, String name) {
        this.idCustomer = idCustomer;
        this.name = name;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return name;
    }
}
