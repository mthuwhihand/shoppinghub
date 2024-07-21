package com.example.shoppinghub.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(name = "order_id", length = 20)
    private String orderId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "payment_method", length = 50)
    private String paymentMethod;

    @Column(name = "estimated_delivery_fee", nullable = false)
    private double estimatedDeliveryFee;

    @Column(name = "total_amount", nullable = false)
    private double totalAmount;

    @Column(name = "payment_status", length = 50, nullable = false)
    private String paymentStatus;

    @Column(name = "recipient_name", length = 100, nullable = false)
    private String recipientName;

    @Column(name = "contact_number", length = 20, nullable = false)
    private String contactNumber;

    @Column(name = "address_line", length = 255, nullable = false)
    private String addressLine;

    @Column(name = "ward", length = 100, nullable = false)
    private String ward;

    @Column(name = "district", length = 100, nullable = false)
    private String district;

    @Column(name = "province", length = 100, nullable = false)
    private String province;

    @Column(name = "country", length = 100, nullable = false)
    private String country;

    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;
}
