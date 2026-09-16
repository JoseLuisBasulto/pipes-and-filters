package model;

import java.util.List;

public class Order {
    private final int idOrder;
    private final Customer customer;
    private final List<Product> productList;
    private double subtotal;
    private double taxes;
    private double discount;
    private double total;
    private OrderState orderState;

    public Order(int idOrder, Customer customer, List<Product> productList) {
        this.idOrder = idOrder;
        this.customer = customer;
        this.productList = productList;
        this.subtotal = 0.0;
        this.taxes = 0.0;
        this.discount = 0.0;
        this.total = 0.0;
        this.orderState = OrderState.NUEVO;
    }

    public int getIdOrder(){
        return idOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /*
    Dudas:
    cantidad solicitada -> se refiere a la cantidad de productos solicitados?
    existencia disponible -> de cada producto supongo...
     */
}
