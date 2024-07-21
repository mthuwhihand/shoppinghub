package com.example.shoppinghub.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_variants")
public class ProductVariant {
    @Id
    @Column(name = "variant_id", length = 20)
    private String variantId;

    @Column(name = "variant_name", length = 50, nullable = false)
    private String variantName;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "price", precision = 10, scale = 2)
    private BigDecimal price;s

    @Column(name = "color", length = 30) // Thêm thuộc tính màu sắc
    private String color;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
