package pipeline.core;

import exception.OrderException;
import model.Order;
import model.OrderState;

import java.util.List;

public class Pipeline {
    private final List<Filter> filterList;

    public Pipeline(List<Filter> filterList){
        this.filterList = filterList;
    }

    // try catch para atrapar la excepción de cada filtro.
    public void execute(Order order){
        for(Filter filter : filterList){
            try {
                order = filter.process(order);
                // Se muestra el estado del pedido después de cada filtro.
                System.out.println("-> Estado después de [" + filter.getClass().getSimpleName() + "]: " + order.getOrderState());
            }catch (OrderException e){
                order.setOrderState(OrderState.RECHAZADO);
                System.out.println("[ERROR EN: " + filter.getClass().getSimpleName() + "]");
                System.out.println(e.getMessage());
                System.out.println("Estado Final: " + order.getOrderState());
                break;
            }
        }
    }
}
