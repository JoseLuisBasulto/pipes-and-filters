package pipeline.filters;

import model.Order;
import model.OrderState;
import pipeline.core.Filter;

public class CalculateTaxes implements Filter {

    @Override
    public Order process(Order order) {
        double iva = 0.16;

        order.setTaxes(order.getSubtotal()*iva);
        System.out.println("Impuestos calculados de manera correcta.");
        order.setOrderState(OrderState.IMPUESTOS_CALCULADOS);

        return order;
    }
}
