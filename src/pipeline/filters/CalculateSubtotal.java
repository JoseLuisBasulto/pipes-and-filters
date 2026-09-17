package pipeline.filters;

import model.Order;
import model.OrderState;
import model.Product;
import pipeline.core.Filter;

import java.util.List;

public class CalculateSubtotal implements Filter {

    @Override
    public Order process(Order order) {
        List<Product> productList = order.getProductList();
        double subtotal = order.getSubtotal();

        for(Product product : productList){
            subtotal += product.getPrice() * product.getQuantityOrdered();
        }

        order.setSubtotal(subtotal);
        order.setOrderState(OrderState.SUBTOTAL_CALCULADO);
        System.out.println("Subtotal calculado correctamente.");
        return order;
    }
}
