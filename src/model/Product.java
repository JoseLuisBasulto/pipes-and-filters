package model;

public class Product {
    private final int idProduct;
    private final String name;
    private final double price;
    private final int quantityOrdered;
    private final int stock;


    public Product(int idProduct, String name, double price, int quantityOrdered, int stock) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.quantityOrdered = quantityOrdered;
        this.stock = stock;
    }


    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString(){
        return getQuantityOrdered() + "|" + getName() + "|" + getPrice() + "|" +getQuantityOrdered()*getPrice();
    }
}
