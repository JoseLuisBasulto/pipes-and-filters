package pipeline.filters;

import model.Order;
import model.OrderState;
import pipeline.core.Filter;

public class ConfirmOrder implements Filter {

    @Override
    public Order process(Order order) {
        order.setTotal(order.getSubtotal() + order.getTaxes());
        System.out.println("Pedido confirmado.");
        order.setOrderState(OrderState.CONFIRMADO);

        return order;
    }
}
