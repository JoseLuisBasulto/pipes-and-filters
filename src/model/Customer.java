package model;

public class Customer {
    private final int idCustomer;
    private final String name;
    private final int telephone;

    public Customer(int idCustomer, String name, int telephone) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.telephone = telephone;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getName() {
        return name;
    }

    public int getTelephone(){
        return telephone;
    }
}
