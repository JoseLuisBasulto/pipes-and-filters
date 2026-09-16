package pipeline.filters;

import model.Order;
import pipeline.core.Filter;

public class VerifyFraud implements Filter {

    @Override
    public Order process(Order order) {
        return null;
    }
}
