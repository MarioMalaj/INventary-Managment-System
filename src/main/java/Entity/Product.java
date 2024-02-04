package Client;

import jakarta.persistence.*;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.swing.DropMode.INSERT;

@Entity(name="product_table")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(name="column_name")
    private String product_Name;

    @Column(name = "created_at")
    @CreationTimestamp(event = INSERT)

    private LocalDateTime createAT;
}
