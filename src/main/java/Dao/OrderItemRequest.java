package Order;

import Entity.Product;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class OrderItemRequest {
    private Long customer_id;

    private Integer quantity;

    public Long getCustomer_id() {
        return customer_id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
