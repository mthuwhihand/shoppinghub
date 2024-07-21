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
@Table(name = "sales")
public class Sale {
    @Id
    @Column(name = "sale_id", length = 20)
    private String saleId;

    @Column(name = "sale_name", length = 255, nullable = false)
    private String saleName;

    @Column(name = "discount_percentage", precision = 5, scale = 2, nullable = false)
    private BigDecimal discountPercentage;

    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;
}
