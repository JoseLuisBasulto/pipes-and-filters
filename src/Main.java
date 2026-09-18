import model.Customer;
import model.Order;
import model.Product;
import pipeline.core.Filter;
import pipeline.core.Pipeline;
import pipeline.filters.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Filter> filterList = List.of(
                new ValidateData(),
                new CheckAvailability(),
                new CalculateSubtotal(),
                new VerifyFraud(),
                new ApplyDiscount(),
                new CalculateTaxes(),
                new ConfirmOrder()
        );

        Pipeline pipeline = new Pipeline(filterList);

        pipeline.execute(testNoProducts());
    }

    public static Order testValidOrder(){
        Customer customer = new Customer(1, "Alberto Osorno");

        List <Product> productList = List.of(
                new Product(1, "Camisa basica blanca", 400, 1,100),
                new Product(2, "Pantalon de mezclilla azul", 700, 1, 100)
        );

        return new Order(1, customer, productList);
    }

    public static Order testNoProducts(){
        Customer customer = new Customer(1, "Alberto Osorno");

        List <Product> productList = List.of();

        return new Order(1, customer, productList);
    }

    public static Order testQuantityBiggerThanStock(){
        Customer customer = new Customer(1, "Alberto Osorno");

        List <Product> productList = List.of(
                new Product(1, "Camisa basica negra", 400, 10, 5)
        );

        return new Order(1, customer, productList);
    }

    public static Order testDiscount(){
        Customer customer = new Customer(1, "Alberto Osorno");

        List <Product> productList = List.of(
                new Product(1, "Camisa basica negra", 400, 1, 100),
                new Product(4, "Pantalon de mezclilla azul", 700, 1, 100),
                new Product(5, "Pantalon de mezclilla negro", 700, 1, 100)
        );

        return new Order(1, customer, productList);
    }

    public static Order testNoDiscount(){
        Customer customer = new Customer(1, "Alberto Osorno");

        List <Product> productList = List.of(
                new Product(1, "Camisa basica negra", 400, 1, 100),
                new Product(4, "Pantalon de mezclilla azul", 700, 1, 100)
        );

        return new Order(1, customer, productList);
    }

    public static Order testVerifyFraud(){
        Customer customer = new Customer(1, "Alberto Osorno");

        List <Product> productList = List.of(
                new Product(1, "Camisa basica roja", 400, 3,100),
                new Product(2, "Camisa basica blanca", 400, 3,100),
                new Product(3, "Camisa basica negra", 400, 3,100),
                new Product(4, "Pantalon de mezclilla azul", 700, 2, 100),
                new Product(5, "Pantalon de mezclilla negro", 700, 2, 100)
        );

        return new Order(1, customer, productList);
    }
}