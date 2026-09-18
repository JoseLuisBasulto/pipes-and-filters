package pipeline.filters;

import exception.OrderException;
import model.Order;
import model.OrderState;
import pipeline.core.Filter;

public class VerifyFraud implements Filter {

    @Override
    public Order process(Order order) {
        if (order.getSubtotal() > 5000){
            order.setOrderState(OrderState.REVISION_FRAUDE);

            System.out.println("Pedido excede el monto normal.");
            System.out.println("-> Estado después de [VerifyFraud]: " + order.getOrderState() + "\n");

            throw new OrderException("Pedido marcado para revision de fraude.");
        }
        return order;
    }
}
