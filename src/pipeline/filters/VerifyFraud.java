package pipeline.filters;

import model.Order;
import model.OrderState;
import pipeline.core.Filter;

public class VerifyFraud implements Filter {

    @Override
    public Order process(Order order) {
        if (order.getSubtotal() > 5000){
            order.setOrderState(OrderState.REVISION_FRAUDE);
            System.out.println("Pedido marcado para revision de fraude.");
        }
        return null;
    }
}
