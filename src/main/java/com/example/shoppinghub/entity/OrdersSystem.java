package com.example.shoppinghub.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders_system")
public class OrdersSystem {
    @Id
    @Column(name = "OrderSystemID", length = 20)
    private String orderSystemId;

    @Column(name = "OrderDate")
    private java.sql.Date orderDate;

    @Column(name = "Status", length = 50)
    private String status;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
