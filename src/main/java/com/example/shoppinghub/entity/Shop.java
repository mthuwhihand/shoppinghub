package com.example.shoppinghub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @Column(name = "shop_id", length = 20)
    private String shopId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "shop_name", length = 255, nullable = false)
    private String shopName;

    @Column(name = "shop_address", length = 255)
    private String shopAddress;

    @Column(name = "shop_email", length = 255)
    private String shopEmail;

    @Column(name = "shop_phone", length = 20)
    private String shopPhone;

    @Column(name = "description")
    private String description;

    @Column(name = "status", length = 20)
    private String status = "pending";

    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;
}
