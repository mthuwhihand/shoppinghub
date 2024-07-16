package com.example.shoppinghub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name = "user_id", length = 20)
    private String userId;

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
    private Timestamp createdAt;
}
