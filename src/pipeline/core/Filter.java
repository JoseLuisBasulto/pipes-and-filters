package pipeline.core;

import model.Order;

public interface Filter {
    Order process(Order order);
}
