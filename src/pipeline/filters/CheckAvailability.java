package pipeline.filters;

import exception.OrderException;
import model.Order;
import model.OrderState;
import model.Product;
import pipeline.core.Filter;

import java.util.List;

public class CheckAvailability implements Filter {

    @Override
    public Order process(Order order) {
        List<Product> productList = order.getProductList();

        for(Product product : productList){
            if(product.getQuantityOrdered() > product.getStock()){
                throw new OrderException("No hay suficiente existencia de " + product.getName() + ".");
            }
        }

        order.setOrderState(OrderState.DISPONIBILIDAD_CONFIRMADA);
        System.out.println("Disponibilidad confirmada correctamente.");

        return order;
    }
}
