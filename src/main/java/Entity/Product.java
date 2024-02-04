package Entity;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name="column_name")
    private String product_Name;

    private String description;
    private Category category;
    private Double price;
    private Integer quantity;

    @Column(name = "created_at")
    @CreationTimestamp

    private LocalDateTime createAT;
    @Column(name = "Updated_at")
    @CreationTimestamp

    private LocalDateTime UpdateAT;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_Name(String s) {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public LocalDateTime getCreateAT() {
        return createAT;
    }

    public void setCreateAT(LocalDateTime createAT) {
        this.createAT = createAT;
    }

    public LocalDateTime getUpdateAT() {
        return UpdateAT;
    }

    public void setUpdateAT(LocalDateTime updateAT) {
        UpdateAT = updateAT;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
