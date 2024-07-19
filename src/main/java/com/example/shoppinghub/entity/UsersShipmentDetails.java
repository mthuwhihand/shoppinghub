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
    @Column(name = "shipment_id", length = 20)
    private String shipmentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(name = "specific_address", length = 255, nullable = false)
    private String specificAddress;

    @Column(name = "administrative_boundaries", length = 255, nullable = false)
    private String administrativeBoundaries;

    @Column(name = "is_default")
    private Boolean isDefault;

    @Column(name = "created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private Timestamp createdAt;
}
