package pipeline.filters;

import exception.OrderException;
import model.Order;
import model.OrderState;
import model.Product;
import pipeline.core.Filter;

public class ValidateData implements Filter {

    @Override
    public Order process(Order order) {
        if(order.getCustomer() == null){
            throw new OrderException("El pedido no cuenta con un cliente.");
        }

        if(order.getProductList() == null || order.getProductList().isEmpty()){
            throw new OrderException("El pedido no contiene productos.");
        }

        for(Product product : order.getProductList()){
            if(product.getPrice() <= 0){
                throw new OrderException("El precio de un producto debe ser mayor a 0.");
            }

            if(product.getQuantityOrdered() <= 0){
                throw new OrderException("La cantidad solicitada de un producto debe ser mayor a 0.");
            }

            if(product.getStock() < 0){
                throw new OrderException("La cantidad en stock debe ser mayor o igual a 0.");
            }
        }

        order.setOrderState(OrderState.VALIDADO);
        System.out.println("Datos validados correctamente.");

        return order;
    }
}
