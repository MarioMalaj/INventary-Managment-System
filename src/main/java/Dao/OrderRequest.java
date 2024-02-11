package Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private  Long CustomerId;
   private List<OrderItemRequest> orderItemRequests=new ArrayList<>();

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public List<OrderItemRequest> getOrderItemRequests() {
        return orderItemRequests;
    }

    public void setOrderItemRequests(List<OrderItemRequest> orderItemRequests) {
        this.orderItemRequests = orderItemRequests;
    }
}
