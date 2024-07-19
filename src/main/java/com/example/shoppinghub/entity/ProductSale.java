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
@Table(name = "product_sales")
public class ProductSale {
    @Id
    @Column(name = "product_sale_id", length = 20)
    private String productSaleId;

    @ManyToOne
    @JoinColumn(name = "variant_id")
    private ProductVariant productVariant;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @Column(name = "discounted_price", precision = 10, scale = 2)
    private BigDecimal discountedPrice;


}
