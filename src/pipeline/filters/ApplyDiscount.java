package pipeline.filters;

import model.Order;
import model.OrderState;
import pipeline.core.Filter;

public class ApplyDiscount implements Filter {

    @Override
    public Order process(Order order) {
        double tenPercent = 0.1;
        double twentyPercent = 0.2;
        double subtotal = order.getSubtotal();

        if(subtotal >= 3000){
            order.setSubtotal( subtotal * (1 - twentyPercent) );
            order.setDiscount(0.2);
            order.setOrderState(OrderState.DESCUENTO_APLICADO);
        }else if(subtotal >= 1500) {
            order.setSubtotal( subtotal * (1 - tenPercent) );
            order.setDiscount(0.1);
            order.setOrderState(OrderState.DESCUENTO_APLICADO);
        }

        if(order.getOrderState() != OrderState.DESCUENTO_APLICADO){
            System.out.println("No se aplicó ningún descuento.");
        }else{
            System.out.println("Descuento aplicado correctamente.");
        }

        return order;
    }
}
