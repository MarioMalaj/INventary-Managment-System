package Model;

import Entity.Category;
import Entity.Product;

import java.util.List;

public class ProductRequest {
    private String description;
    private Long category;
    private Double price;
    private Integer quantity;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "description='" + description + '\'' +
                ", category=" + category +
                ", price=" + price +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }
}
