package com.example.shoppinghub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Users_ShipmentDetails")
public class UsersShipmentDetails {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Id
    @Column(name = "recipient_name", length = 100, nullable = false)
    private String recipientName;

    @Id
    @Column(name = "contact_number", length = 20, nullable = false)
    private String contactNumber;

    @Id
    @Column(name = "address_line", length = 255, nullable = false)
    private String addressLine;

    @Id
    @Column(name = "ward", length = 100, nullable = false)
    private String ward;

    @Id
    @Column(name = "district", length = 100, nullable = false)
    private String district;

    @Id
    @Column(name = "province", length = 100, nullable = false)
    private String province;

    @Id
    @Column(name = "country", length = 100, nullable = false)
    private String country;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp createdAt;
}
